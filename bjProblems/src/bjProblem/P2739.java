package bjProblem;

import java.util.Scanner;

public class P2739 {

	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("입력 > ");
		int n = scn.nextInt();
		
		for (int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n", n, i, n*i);
		}
	}

}
