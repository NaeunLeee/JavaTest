package bjProblem;

import java.util.Scanner;

public class P11720 {

	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("갯수 입력 > ");
		int n = scn.nextInt();
		System.out.print("숫자 입력 > ");
		String[] arr = scn.next().split("");
		
		int sum = 0;
		for (int i=0; i<n; i++) {
			sum += Integer.parseInt(arr[i]);
		}
		
		System.out.println(sum);
	}

}
