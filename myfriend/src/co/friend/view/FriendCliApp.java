package co.friend.view;

import java.util.List;

import co.friend.access.FriendAccess;
import co.friend.access.FriendDAO;
//import co.friend.access.FriendList;
import co.friend.model.Friend;
import co.friend.util.ScannerUtil;

public class FriendCliApp {
	
//	FriendList friendList = new FriendList();
	FriendAccess friendList = new FriendDAO();
	
	public void start() {
		int menuNum;
		do {
			// 메뉴 출력
			menuTitle();
			// 메뉴 선택
			menuNum = ScannerUtil.readInt("입력");
			// 실행
			switch (menuNum) {
			case 1:	insert();	break;
			case 2:	update();	break;
			case 3:	delete();	break;
			case 4:	selectAll();break;
			case 5:	findName();	break;
			case 6: findTel();	break;
			}
		} while (menuNum != 0);
	}

	// 등록
	private void insert() {
		Friend friend = ScannerUtil.readFriend();
		friendList.insert(friend);
	}
	// 이름으로 검색해서 전화번호 수정
	private void update() {
		Friend friend = new Friend();
		friend.setName(ScannerUtil.readStr("이름을 입력하세요"));
		friend.setTel(ScannerUtil.readStr("수정할 전화번호를 입력하세요"));
		friendList.update(friend);
	}
	// 이름으로 검색해서 삭제
	private void delete() {
		String name = ScannerUtil.readStr("삭제할 친구를 입력하세요");
		friendList.delete(name);
	}
	// 전체 조회
	private void selectAll() {
		List<Friend> list = friendList.selectAll();
		for (Friend friend : list) {
			System.out.println(friend);
		}
	}
	// 이름으로 조회
	private void findName() {
		String name = ScannerUtil.readStr("검색할 이름을 입력하세요");
		Friend friend = friendList.selectOne(name);
		System.out.println(friend);
	}
	// 전화번호로 조회
	private void findTel() {
		String tel = ScannerUtil.readStr("검색할 전화번호를 입력하세요");
		Friend friend = friendList.findTel(tel);
		System.out.println(friend);
	}
	// 메뉴 출력
	public void menuTitle() {
		System.out.println();
		System.out.println("========  친구  관리  ========");
		System.out.println("==| 1. 친구추가		|==");
		System.out.println("==| 2. 친구수정		|==");
		System.out.println("==| 3. 친구삭제		|==");
		System.out.println("==| 4. 전체조회		|==");
		System.out.println("==| 5. 이름으로 조회	|==");
		System.out.println("==| 6. 전화번호 조회	|==");
		System.out.println("==| 0. 종료		|==");
		System.out.println("===========================");
		System.out.println();
	}
}
