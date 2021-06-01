package co.yedam.app.bookrent.complete;

import java.util.Scanner;


public class AppMain {

	static Scanner scanner = new Scanner(System.in);
	MemberService memberService = new MemberService();
	RentService rentService = new RentService();
	BookService bookService = new BookService();
	
	public void bookManager() {
		int selectNo = 0;
		boolean run = true;
		while (run) {
			System.out.println("1.도서등록  2.도서수정  3.도서삭제  4.전체조회  5.단건조회   6.종료");
			System.out.print("선택 > ");
			selectNo = scanner.nextInt();
			if (selectNo == 1) {
				bookService.input();
			} else if (selectNo == 2) {
				bookService.update();
			} else if (selectNo == 3) {
				bookService.delete();
			} else if (selectNo == 4) {
				bookService.selectAll();
			}else if (selectNo == 5) {
				bookService.selectOne();
			} else if (selectNo == 6) {
				run = false;
			}
		}
		System.out.println("도서관리 종료");
	}
	
	public void memberManager() {
		int selectNo = 0;
		boolean run = true;		
		while (run) {
			System.out.println("1.회원등록  2.회원수정  3.회원삭제  4.전체조회  5.단건조회   6.종료");
			System.out.print("선택 > ");
			selectNo = scanner.nextInt();
			if (selectNo == 1) {
				memberService.input();
			} else if (selectNo == 2) {
				memberService.update();
			} else if (selectNo == 3) {
				memberService.delete();
			} else if (selectNo == 4) {
				memberService.selectAll();
			}else if (selectNo == 5) {
				memberService.selectOne();
			} else if (selectNo == 6) {
				run = false;
			}
		}
		System.out.println("회원관리 종료");
	}
	
	public void rentManager() {
		int selectNo = 0;
		boolean run = true;		
		while (run) {
			System.out.println("1.도서대여등록  2.대여수정  3.대여취소  4.전체조회  5.단건조회   6.종료");
			System.out.print("선택 > ");
			selectNo = scanner.nextInt();
			if (selectNo == 1) {
				rentService.input();
			} else if (selectNo == 2) {
				rentService.update();
			} else if (selectNo == 3) {
				rentService.delete();
			} else if (selectNo == 4) {
				rentService.selectAll();
			}else if (selectNo == 5) {
				rentService.selectOne();
			} else if (selectNo == 6) {
				run = false;
			}
		}
		System.out.println("대여관리 종료");
	}
	
	public static void main(String[] args) {
		AppMain app = new AppMain();
		int selectNo = 0;
		boolean run = true;
		while (run) {
			System.out.println("1.도서관리  2.회원관리  3.대여관리  4.종료");
			System.out.print("선택 > ");
			selectNo = scanner.nextInt();
			if (selectNo == 1) {
				app.bookManager();
			} else if (selectNo == 2) {
				app.memberManager();
			} else if (selectNo == 3) {
				app.rentManager();
			} else {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}
