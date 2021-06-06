package co.memo.view;

import java.util.List;

import co.friend.util.ScannerUtil;
import co.memo.access.MemoList;
import co.memo.model.Memo;

public class MemoCliApp {

	MemoList memoList = new MemoList();
	
	public void start() {
		int menuNum;
		do {
			menuTitle();
			menuNum = ScannerUtil.readInt("입력");
			switch (menuNum) {
			case 1: insert();	break;
			case 2: update();	break;
			case 3: delete();	break;
			case 4: selectAll();break;
			case 5: selectOne();break;
			case 6: searchContent(); break;
			}
		} while (menuNum != 0);
	}
	
	// 등록
	private void insert() {
		Memo memo = ScannerUtil.readMemo();
		memoList.insert(memo);
	}
	// 날짜로 검색해서 메모 수정
	private void update() {
		Memo memo = new Memo(); 
		memo.setDate(ScannerUtil.readStr("수정할 날짜"));
		memo.setContent(ScannerUtil.readStr("수정할 내용"));
		memoList.update(memo);
	}
	// 날짜로 검색해서 메모 삭제
	private void delete() {
		String date = ScannerUtil.readStr("삭제할 날짜");
		memoList.delete(date);
	}
	// 전체 조회
	private void selectAll() {
		List<Memo> list = memoList.selectAll();
		for (Memo memo : list) {
			System.out.println(memo);
		}
	}
	// 날짜로 조회
	private void selectOne() {
		String date = ScannerUtil.readStr("검색할 날짜");
		Memo memo = memoList.selectOne(date);
		System.out.println(memo);
	}
	// 일부내용으로 조회
	private void searchContent() {
		String content = ScannerUtil.readStr("검색할 내용");
		Memo memo = memoList.searchContent(content);
		System.out.println(memo);
	}
	// 메뉴 출력
	public void menuTitle() {
		System.out.println("========  메모  관리  ========");
		System.out.println("==| 1. 메모추가		|==");
		System.out.println("==| 2. 메모수정		|==");
		System.out.println("==| 3. 메모삭제		|==");
		System.out.println("==| 4. 전체조회		|==");
		System.out.println("==| 5. 날짜로 조회		|==");
		System.out.println("==| 6. 내용으로 조회	|==");
		System.out.println("==| 0. 종료		|==");
		System.out.println("===========================");
	}
	
	
}
