package co.yedam.numgame;


import java.util.Scanner;

public class NumberGameApp {
	

	int com;
	int user; 
	Scanner scanner = new Scanner(System.in);
	// 컴퓨터 임의의 수를 생성
	void init() {
		com = (int)(Math.random()*10)+1;
	}
	
	// 사용자가 수를 입력
	void input() {
		System.out.print("수를 입력하세요 (1~10) : ");
		user = scanner.nextInt();
	}
	
	// 높다/낮다:false 정답:true 출력
	boolean confirm() {
		if (com==user) {
			System.out.println("정답입니다!!");
			return true;
		}
		else {
			if (com<user) {
				System.out.println("큽니다!");
			}
			else if (com>user) {
				System.out.println("작습니다!");
			}
			return false;
		}
	}
	boolean confirmRestart() {
		System.out.println("게임을 시작하시겠습니까? (y/n)");
		String answer = scanner.next();
		if (answer=="y") {
			return true;
		}
		else {
			return false;
		}
	}
		
	void start() {
		// while 문 돌려서 y누르면 restart 할 수 있게
		init();
		while (true) {
			input();
			if (confirm()) {
				break;
			}
			else {
			}
		}
	}
		
	
}
