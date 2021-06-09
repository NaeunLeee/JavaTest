package co.friend.access;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import co.friend.model.Friend;
import co.friend.util.DAO;

// FriendAccess.java와 그를 구현하는 FriendList.java

public class FriendDAO extends DAO implements FriendAccess {

	PreparedStatement psmt;
	ResultSet rs;
	String sql;
	
	// 친구 추가
	@Override
	public void insert(Friend friend) {
		String sql = "insert into friend values (?, ?, ?)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, friend.getGubun());
			psmt.setString(2, friend.getName());
			psmt.setString(3, friend.getTel());
			int r = psmt.executeUpdate();
			System.out.println(r + "건 입력하였습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 이름으로 검색해서 전화번호 수정
	@Override
	public void update(Friend friend) {
		String sql = "update friend set tel=? where name=?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, friend.getTel());
			psmt.setString(2, friend.getName());
			int r = psmt.executeUpdate();
			System.out.println(r + "건 수정하였습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 친구 삭제
	@Override
	public void delete(String name) {
		String sql = "delete from friend where name = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, name);
			int r = psmt.executeUpdate();
			System.out.println(r + "건 삭제되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 전체 조회
	@Override
	public ArrayList<Friend> selectAll() {
		
		ArrayList<Friend> fList = new ArrayList<>();
		
		try {
			System.out.println();
			System.out.println("=============< 전체 리스트를 조회합니다 >=============");
			psmt = conn.prepareStatement("select * from friend");
			rs = psmt.executeQuery();
			while(rs.next()) {
				Friend friend = new Friend();
				friend.setGubun(rs.getString("gubun"));
				friend.setName(rs.getString("name"));
				friend.setTel(rs.getString("tel"));
				fList.add(friend);		// 데이터건수만큼 ArrayList에 담아서 반환
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return fList;
	}

	// 이름으로 조회
	@Override
	public Friend selectOne(String name) {
		String sql = "select * from friend where name = ?";
		Friend f = null;
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, name);
			rs = psmt.executeQuery();
			if (rs.next()) {
				f = new Friend();
				f.setGubun(rs.getString("gubun"));
				f.setName(rs.getString("name"));
				f.setTel(rs.getString("tel"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return f;
	}

	// 전화번호로 조회
	@Override
	public Friend findTel(String tel) {
		String sql = "select * from friend where tel = ?";
		Friend f = null;
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, tel);
			rs = psmt.executeQuery();
			if (rs.next()) {
				f = new Friend();
				f.setGubun(rs.getString("gubun"));
				f.setName(rs.getString("name"));
				f.setTel(rs.getString("tel"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return f;
	}
	
	// 이름과 전화번호 값을 담아주는 컬렉션
	public Map<String, String> getNameTel() {
		Map<String, String> friends = new HashMap<>();
		String sql = "select name, tel from friend";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				friends.put(rs.getString("name"), rs.getString("tel"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return friends;
	}

	
}
