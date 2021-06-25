package bjProblem;

import java.util.Scanner;

public class P2577 {

	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("세자리수 A 입력 > ");
		int a = scn.nextInt();
		System.out.print("세자리수 B 입력 > ");
		int b = scn.nextInt();
		System.out.print("세자리수 C 입력 > ");
		int c = scn.nextInt();
		
		int mul = a*b*c;
		String str = Integer.toString(mul);
	
		for (int i=0; i<10; i++) {
			int cnt = 0;
			for (int j=0; j<str.length(); j++) {
				if ((str.charAt(j)-'0')==i) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}

}
