package co.yedam.tree;

public class TreeApp {
	
	String pad(char s, int cnt) {
		String result = "";
		for (int i=1; i<=cnt; i++) {
			result += s;
		}
		return result;
	}

	void drawEq(int cnt) {
		for (int i=0; i<cnt; i++) {
			System.out.print(pad(' ', cnt-i+4));
			System.out.println(pad('*', i*2-1));
		}
	}
//	void drawEq(int a, int b) {
//		for (int i=a; i<b-1; i++) {
//			System.out.print(pad(' ', b-i));
//			System.out.println(pad('*', i*2-1));
//		}
//	}
	void drawRect(int c) {
		for (int i=0; i<c-1; i++) {
			System.out.print(pad(' ', c+2));
			System.out.println(pad('*', 3));
		}
	}
	
	
}
