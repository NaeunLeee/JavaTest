package co.yedam.app.baseball;
/*
 * 임의의 수 3개
 * 사용자 수 입력
 * 스트라이크, 볼 카운터
 */

import java.util.Scanner;

public class BaseBallApp {
	int s;
	int b;
	int c1, c2, c3;
	int u1, u2, u3;
	Scanner scanner = new Scanner(System.in);
	
	
	void makeRnd() {
		c1 = (int)(Math.random()*9);
		c2 = (int)(Math.random()*9);
		c3 = (int)(Math.random()*9);
	}
	void input() {
		System.out.print("첫 번째 숫자 입력 : ");
		u1 = scanner.nextInt();
		System.out.print("두 번째 숫자 입력 : ");
		u2 = scanner.nextInt();
		System.out.print("세 번째 숫자 입력 : ");
		u3 = scanner.nextInt();
	}
	
	void count() {
		if (c1==u1) {
			s += 1;
		}
		else if (c1==u2 | c1==u3) {
			b += 1;
		}
		if (c2==u2) {
			s += 1;
		}
		else if (c2==u1 | c2==u3) {
			b += 1;
		}
		if (c3==u3) {
			s += 1;
		}
		else if (c3==u1 | c3==u2) {
			b += 1;
		}
	}
	
	void start() {
		makeRnd();
//		System.out.println(c1 + " " + c2 + " " + c3);
		while (s<3) {
			s = b = 0;
			input();
			count();
			if (s==0 & b==0) {
				System.out.println("파울");
			}
			else if (s==3) {
				break;
			}
			else {
				System.out.println(s + "스트라이크 " + b + "볼");
			}
		}
		System.out.println("정답!!!!!");
	}
}
