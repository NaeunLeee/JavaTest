package bjProblem;

import java.util.Scanner;

public class P2741 {

	public static void print() {
		Scanner scn = new Scanner(System.in);
		System.out.print("입력 > ");
		int num = scn.nextInt();
		
		for (int i=1; i<=num; i++) {
			System.out.println(i);
		}
	
	}
	
	public static void main(String[] args) {
		print();
	}

}
