package pkg.friend;

import java.util.List;

import pkg.Friend;

public class FriendManager implements FriendAccess {
	Friend[] friends = new Friend[5];
	
	public FriendManager() {
		friends[0] = new CompanyFriend("예담회사", "순이", "010-2222-4444");
		friends[1] = new SchoolFriend("중앙초등", "돌이", "010-3333-4444");
		friends[2] = new CompanyFriend("삼성전자", "영이", "010-1111-2222");
		friends[3] = new CompanyFriend("카카오", "삼이", "010-4444-5555");
		friends[4] = new SchoolFriend("영신중", "경이", "010-6666-7777");
	}
	public void insert(Friend friend) {
		
	}

	public void update(Friend friend) {
		
	}

	public void delete(String name) {
		
	}

	public List selectAll() {
		System.out.println("FriendManager");
		return null;
	}

	public Friend selectOne(String name) {
		return null;
	}

	
}
