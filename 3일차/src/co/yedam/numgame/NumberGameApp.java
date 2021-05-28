//package co.yedam.numgame;
//
//
//import java.util.Scanner;
//
//public class NumberGameApp {
//	
//
//	int com;
//	int user; 
//	Scanner scanner = new Scanner(System.in);
//	// 컴퓨터 임의의 수를 생성
//	void init() {
//		com = (int)(Math.random()*10)+1;
//	}
//	
//	// 사용자가 수를 입력
//	void input() {
//		System.out.print("수 입력 : ");
//		user = scanner.nextInt();
//	}
//	
//	// 높다/낮다:false 정답:true 출력
//	boolean confirm() {
//		String result = "";
//		if (com==user) {
//			result = "true";
//		}
//		if (com!=user) {
//			result = "false";
//		}
//		return result;
//	}
//	void start() {
//		while (true) {
//			input();
//			if (confirm()) {
//				break;
//			}
//		}
//	}
//	
//	
//}
