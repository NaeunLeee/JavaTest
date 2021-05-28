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
		for (int i=1; i<=cnt; i++) {
			System.out.print(pad(' ', cnt-i+1));
			System.out.println(pad('*', i*2-1));
		}
	}
	
	
}
