package bjProblem;

import java.util.Scanner;

public class P2439 {

	static Scanner scn = new Scanner(System.in);	
	
	public static void main(String[] args) {
		System.out.print("입력 > ");
		int n = scn.nextInt();
		for (int i=1; i<=n; i++) {
			System.out.print(printC(' ', n-i+1));
			System.out.println(printC('*', i));
		}
	}

	static String printC(char s, int cnt) {
		String result = "";
		for (int i=1; i<=cnt; i++) {
			result += s;
		}
		return result;
	}
}
