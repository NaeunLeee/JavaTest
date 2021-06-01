package co.yedam.app.bookrent.complete;

import java.util.Scanner;
/*
 * 객체배열을 이용한 도서정보 등록/수정/삭제/조회 기능 구현
 */
public class BookService implements Service {
	
	Book[] books;
	int cnt;			//입력건수
	int maxCnt = 10;	//최대건수
	
	Scanner scanner = new Scanner(System.in);
	
	public BookService() {
		books = new Book[maxCnt];
	}
	
	//등록
	public void input() {
		if (cnt > maxCnt) {
			System.out.println("더 이상 추가할 수 없습니다.");
			return;
		}
		System.out.print("제목 > ");
		String title = scanner.next();
		System.out.print("저자 > ");
		String author = scanner.next();
		books[cnt++] = new Book(title, author); 
		System.out.println("등록된 건수 : " + cnt);
	}
	
	//수정
	public void update() {
		System.out.print("수정할 번호 > ");
		int idx = scanner.nextInt();
		if (idx >= cnt-1) {
			System.out.println("없는 번호입니다.");
			return;
		}
		System.out.print("저자 > ");
		String author = scanner.next();
		books[idx].setAuthor(author); 
		System.out.println("수정되었습니다.");
	}
	
	//삭제
	public void delete() {
		System.out.print("삭제할 번호 > ");
		int idx = scanner.nextInt();
		if (idx > cnt-1) {
			System.out.println("없는 번호입니다.");
			return;
		}
		for (int i=idx; i<cnt-1; i++) {
			books[i] = books[i+1];
		}
		cnt--;
		System.out.println("삭제되었습니다.");
	}
	
	//전체조회
	public void selectAll() {
		System.out.println(String.format("%-20s %-20s", "도서명", "저자"));
		System.out.println("================================================================");
		for (int i=0; i<cnt; i++) {
			System.out.println(String.format("%-20s %-20s", books[i].getTitle(), books[i].getAuthor()));
		}
		System.out.println("================================================================");
	}
	
	//단건조회(타이틀)
	public void selectOne() {
		System.out.printf("조회할 번호 > ");
		int idx = scanner.nextInt();
		if (idx > cnt-1) {
			System.out.println("없는 번호입니다.");
			return;
		}
		System.out.println(String.format("도서명 : %s   저자 : %s", books[idx].getTitle(), books[idx].getAuthor()));
	}
	
}
