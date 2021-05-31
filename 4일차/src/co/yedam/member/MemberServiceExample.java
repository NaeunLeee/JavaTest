package co.yedam.member;

import java.util.Scanner;

public class MemberServiceExample {

	public static void main(String[] args) {
		MemberService app = new MemberService();
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int selectNo = 0;
		while(run) {
			System.out.println("1. 등록 | 2. 전체조회 | 3. 번호로 조회 | 4. 로그인 | 5. ID로 조회 | 6. 종료");
			System.out.print("입력 > ");
			selectNo = scanner.nextInt();
			if (selectNo==1) {
				app.insert();
			}
			else if (selectNo==2) {
				app.printList();
			}
			else if (selectNo==3) {
				app.printMember();
			}
			else if (selectNo==4) {
				app.login();
			}
			else if (selectNo==5) {
				app.search();
			}
			else if (selectNo==6) {
				run = false;
			}
			
		}
		
		

	}

}
