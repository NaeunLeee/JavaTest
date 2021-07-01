package bjProblem;

import java.util.Scanner;

public class P4153 {

	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean bool = true;
		
		while (bool) {
			System.out.print("세 변의 길이 입력 > ");
			String[] arr = scn.nextLine().split(" ");
			int a = Integer.parseInt(arr[0]);
			int b = Integer.parseInt(arr[1]);
			int c = Integer.parseInt(arr[2]);
			String answer;
			
			if (a!=0 && b!=0 && c!=0) {
				if (a>b && a>c && a*a==b*b+c*c) {
					answer = "rignt";
				} else if (b>a && b>c && b*b==a*a+c*c) {
					answer = "rignt";
				} else if (c>a && c>b && c*c==a*a+b*b) {
					answer = "rignt";
				} else {
					answer = "wrong";
				}
		
				System.out.println(answer);
				
			} else {
				System.out.println("종료");
				bool = false;
			}
		} 
	}

}
