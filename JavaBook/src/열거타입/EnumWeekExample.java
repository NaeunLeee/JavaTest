package 열거타입;

import java.util.Scanner;

public class EnumWeekExample {

	public static void main(String[] args) {
		// 1. 요일명 -> 오타 날 가능성
		// String week = "SUA"; 
		
		// 2. 배열 -> 귀찮음
//		String[] week = {"MON", "TUE", "WED", "THU", "FRI", "SUN"};
//		String today = week[0];
		
		// 3. enum -> 간편함
//		Week today = Week.MON;
		
		Scanner scanner = new Scanner(System.in);
		MENU menu = null;
		int menuNo;
		
		do {
			menu.print();
			System.out.println();
			System.out.print("입력 > ");
			menuNo = scanner.nextInt();
			menu = MENU.getMenu(menuNo);

			switch (menu) {
				case 등록: System.out.println("등록"); break;
				case 수정: System.out.println("수정"); break;
				case 삭제: System.out.println("삭제"); break;
				case 조회: System.out.println("조회"); break;
			}
		} while (menu != MENU.종료);
		System.out.println("종료!");
	}
}
