package co.memo.view;

import java.util.List;
import java.util.Scanner;
import co.memo.access.MemoAccess;
import co.memo.access.MemoDAO;
import co.memo.model.Memo;

public class MemoCliApp {

	MemoAccess access = new MemoDAO(); // 데이터베이스 입출력 처리하세요.
	Scanner scanner1 = new Scanner(System.in);
	Scanner scanner2 = new Scanner(System.in);

	public void start() {
		int menuNum;

		do {
			menuTitle();
			System.out.print("입력 > ");
			menuNum = scanner1.nextInt();
			switch (menuNum) {
			case 1:
				insert();
				break;
			case 2:
				update();
				break;
			case 3:
				delete();
				break;
			case 4:
				selectAll();
				break;
			case 5:
				findByDate();
				break;
			case 6:
				findByContent();
				break;
			}
		} while (menuNum != 0);
		System.out.println("프로그램 종료.");
	}

	private void insert() {
		System.out.println("메모를 등록하세요.");
		System.out.print("날짜 (MM/dd) > ");
		String date = scanner1.next();
		System.out.print("제목 > ");
		String title = scanner2.nextLine();
		System.out.print("내용 > ");
		String content = scanner2.nextLine();
		access.write(date, title, content);
	}

	private void update() {
		System.out.println("메모를 수정합니다.");
		System.out.print("수정할 메모의 날짜 (MM/dd) > ");
		String date = scanner1.next();
		System.out.print("수정할 내용 > ");
		String content = scanner2.nextLine();
		access.update(date, content);
	}

	private void delete() {
		System.out.println("메모를 삭제합니다.");
		System.out.print("삭제할 메모의 날짜 (MM/dd) > ");
		String date = scanner2.nextLine();
		access.delete(date);
	}

	private void selectAll() {
		System.out.println("전체 메모 목록을 조회합니다.");
		System.out.println("=====================================================");
		List<Memo> memoList = access.FindAll();
		for (Memo memo : memoList) {
			memo.view();
		}
		System.out.println("=====================================================");
	}

	private void findByDate() {
		System.out.print("조회할 메모의 날짜 (MM/dd) > ");
		String date = scanner2.nextLine();
		if (access.FindByDate(date)!=null) {
			access.FindByDate(date).print();;
		} else {
			System.out.println("해당 날짜에 조회되는 메모가 없습니다.");
		}
	}

	private void findByContent() {
		System.out.print("조회할 메모의 내용 > ");
		String content = scanner2.nextLine();
		List<Memo> memoList = access.FindByContent(content);
		if (memoList!=null) {
			for (Memo memo : memoList) {
				memo.print();
			}
		} else {
			System.out.println("해당 내용의 메모가 없습니다.");
		}
	}

	private void menuTitle() {
		System.out.println("== 메모 관리 ==");
		System.out.println("=1. 메모 추가");
		System.out.println("=2. 메모 수정");
		System.out.println("=3. 메모 삭제");
		System.out.println("=4. 전체 조회");
		System.out.println("=5. 날짜로 조회");
		System.out.println("=6. 내용으로 조회");
		System.out.println("=0. 종료");
		System.out.println("===============");

	}

}
