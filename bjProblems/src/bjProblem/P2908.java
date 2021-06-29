package bjProblem;

import java.util.Scanner;

public class P2908 {

	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("세자리수 두 개 입력 > ");
		String[] arr = scn.nextLine().split(" ");
		
		int a1 = Integer.parseInt(arr[0].substring(0,1));
		int a2 = Integer.parseInt(arr[0].substring(1,2));
		int a3 = Integer.parseInt(arr[0].substring(2,3));
		
		int b1 = Integer.parseInt(arr[1].substring(0,1));
		int b2 = Integer.parseInt(arr[1].substring(1,2));
		int b3 = Integer.parseInt(arr[1].substring(2,3));
		
		int a = a3*100 + a2*10 + a1;
		int b = b3*100 + b2*10 + b1;
		
		if (a>b) {
			System.out.printf("둘 중 더 큰 수는 %d", a);
		} else if (a<b) {
			System.out.printf("둘 중 더 큰 수는 %d", b);
		}
	}

}
