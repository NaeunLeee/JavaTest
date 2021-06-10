package co.board.access;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import co.board.model.Board;

public class BoardDAO implements BoardAccess {

	static PreparedStatement psmt;
	static ResultSet rs;
	static Connection conn;
	static String sql;
	static Scanner scn = new Scanner(System.in);
	
	// 전체리스트 조회
	@Override
	public ArrayList<Board> selectAll() {
		ArrayList<Board> boardList = new ArrayList<>();
		connect();
		try {
			String sql = "select b_id, b_title, b_writer from board";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				Board board = new Board();
				board.setIdNum(rs.getInt("b_id"));
				board.setTitle(rs.getString("b_title"));
				board.setWriter(rs.getString("b_writer"));
				boardList.add(board);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return boardList;
	}

	// 게시글 등록 (제목/내용/작성자)
	@Override
	public void insert(Board board) {
		connect();
		String sql = "insert into board (b_title, b_content, b_writer) values (?, ?, ?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, board.getTitle());
			psmt.setString(2, board.getContent());
			psmt.setString(3, board.getWriter());
			int r = psmt.executeUpdate();
			System.out.println(r + "건 등록하였습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
	}

	// 게시글 수정
	@Override
	public void update(Board board) {
		connect();
		String sql = "update board set b_content=? where b_id=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, board.getContent());
			psmt.setInt(2, board.getIdNum());
			int r = psmt.executeUpdate();
			System.out.println(r + "건 수정하였습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
	}

	// 게시글 삭제
	@Override
	public void delete(int idNum) {
		connect();
		String sql = "delete from board where b_id = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, idNum);
			int r = psmt.executeUpdate();
			System.out.println(r + "건 삭제되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
	}

	// 한건조회
	@Override
	public Board selectOne(int idNum) {
		connect();
		String sql = "select * from board where b_id = ?";
		Board b = null;
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, idNum);
			rs = psmt.executeQuery();
			while (rs.next()) {
				b = new Board();
				b.setIdNum(idNum);
				b.setTitle(rs.getString("b_title"));
				b.setContent(rs.getString("b_content"));
				b.setWriter(rs.getString("b_writer"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return b;
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
