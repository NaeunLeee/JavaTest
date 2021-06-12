package bjProblem;

import java.util.Scanner;

public class P1330 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("두 수 입력 > ");
		String answer = scn.nextLine();
		String[] arr = answer.split(" ");
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		compare(a, b);
	}
	
	public static void compare(int a, int b) {
		if (a>b) {
			System.out.println(">");
		} else if (a<b) {
			System.out.println("<");
		} else if (a==b) {
			System.out.println("==");
		}
	}
}
