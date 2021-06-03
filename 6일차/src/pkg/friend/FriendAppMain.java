package pkg.friend;

import pkg.Friend;

public class FriendAppMain {

	public static void main(String[] args) {
		FriendList list = new FriendList();
		
		// 등록
		Friend f = new CompanyFriend("현대해상", "김길동", "222");
		list.insert(f);
		f = new SchoolFriend("초등학교", "김기자", "333");
		list.insert(f);
		
		// 검색
		System.out.println(list.selectOne("김기자"));
		
		// 수정
		f = new SchoolFriend("초등학교", "김기자", "444");
		list.update(f);
		
		// 삭제
		list.delete("김길동");
		
		// 전체 조회
		list.selectAll();
	}

}
