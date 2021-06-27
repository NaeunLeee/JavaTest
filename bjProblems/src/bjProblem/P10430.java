package bjProblem;

import java.util.Scanner;

public class P10430 {

	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("숫자 입력 > ");
		String[] arr = scn.nextLine().split(" ");
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		int c = Integer.parseInt(arr[2]);
		
		System.out.println((a+b)%c);
		System.out.println(((a%c)+(b%c))%c);
		System.out.println((a*b)%c);
		System.out.println(((a%c)*(b%c))%c);
	}

}
