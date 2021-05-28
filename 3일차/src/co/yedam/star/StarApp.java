package co.yedam.star;

public class StarApp {
	
	//삼각형 출력
	void draw(int cnt) {
		for (int i=1; i<=cnt; i++) {
			System.out.println(pad('*', i));
		}
	}
	//역삼각형 출력
//	void drawInvert() {
//		for (int i=8; i>=1; i--) {
//			System.out.println(pad('*', i));
//		}
//	}
	void drawInvert(int cnt) {
		for (int i=1; i<=cnt; i++) {
			System.out.println(pad('*', cnt-i));
		}
	}
	//이등변삼각형 출력
	void drawEq(int cnt) {
		for (int i=1; i<=cnt; i++) {
			System.out.print(pad(' ', cnt-i+1));
			System.out.println(pad('*', i*2-1));
		}
	}	
	// 나무 출력
//	void drawTr(int a, int b) {
//		
//	}
	
	//다이아몬드 출력
	void drawDia(int cnt) {
		for (int i=1; i<=cnt; i++) {
			System.out.print(pad(' ', cnt-i+1));
			System.out.println(pad('*', i*2-1));
		}
		for (int i=cnt-1; i>=1; i--) {
			System.out.print(pad(' ', cnt-i+1));
			System.out.println(pad('*', i*2-1));
		}
	}	
	
	// (*, n) --> "*"*n 출력하도록 하는 메서드
	String pad(char s, int cnt) {
		String result = "";
		for (int i=1; i<=cnt; i++) {
			result += s;
		}
		return result;
	}
}
