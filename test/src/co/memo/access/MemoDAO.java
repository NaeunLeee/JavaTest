package co.memo.access;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import co.memo.model.Memo;

// MemoAccess를 구현하는 클래스입니다.
// 기능을 작성하세요.
public class MemoDAO implements MemoAccess {
	
	static PreparedStatement psmt;
	static ResultSet rs;
	static Connection conn;
	static String sql;
	static Scanner scn = new Scanner(System.in);
	
	// 메모 등록 (날짜, 제목, 내용)
	public void write(String date, String title, String content) {
		connect();
		String sql = "insert into memo values (?, ?, ?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, date);
			psmt.setString(2, title);
			psmt.setString(3, content);
			int r = psmt.executeUpdate();
			System.out.println(r + "건 등록하였습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
	}

	// 메모 수정 (날짜로 검색해서 내용 수정)
	public void update(String date, String content) {
		connect();
		String sql = "update memo set content=? where date=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, content);
			psmt.setString(2, date);
			int r = psmt.executeUpdate();
			System.out.println(r + "건 수정하였습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
	}

	// 메모 삭제
	public void delete(String date) {
		connect();
		String sql = "delete from memo where date=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, date);
			int r = psmt.executeUpdate();
			System.out.println(r + "건 삭제되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
	}

	// 전체 조회
	public ArrayList<Memo> FindAll() {
		ArrayList<Memo> memoList = new ArrayList<>();
		connect();
		String sql = "select * from memo";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				Memo memo = new Memo();
				memo.setDate(rs.getString("date"));
				memo.setTitle(rs.getString("title"));
				memo.setContent(rs.getString("content"));
				memoList.add(memo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return memoList;
	}

	// 날짜로 한건조회
	public Memo FindByDate(String date) {
		connect();
		String sql = "select * from memo where date = ?";
		Memo memo = null;
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, date);
			rs = psmt.executeQuery();
			while (rs.next()) {
				memo = new Memo();
				memo.setDate(date);
				memo.setTitle(rs.getString("title"));
				memo.setContent(rs.getString("content"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return memo;
	}

	// 내용으로 조회
	public ArrayList<Memo> FindByContent(String content) {
		ArrayList<Memo> memoList = new ArrayList<>();
		connect();
		String sql = "select * from memo where content = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, content);
			rs = psmt.executeQuery();
			while (rs.next()) {
				Memo memo = new Memo();
				memo.setDate(rs.getString("date"));
				memo.setTitle(rs.getString("title"));
				memo.setContent(rs.getString("content"));
				memoList.add(memo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return memoList;
	}

	// connection
	public static void connect() {
		String url = "jdbc:sqlite:C:/sqlite/db/sample.db";
		try {
			conn = DriverManager.getConnection(url);
//			System.out.println("☆★☆★연결 성공★☆★☆");
		} catch (SQLException e) {
			System.out.println("=== 연결 실패 ===");
		} 
	}
	
	// close
	public static void close() {
		if(rs!=null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(psmt!=null) {
			try {
				psmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	
	}
}
