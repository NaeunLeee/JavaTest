package bjProblem;

/*
 * 1, 2, 3의 순서를 바꾸는 가짓수는 카운트하지 못하는 문제 해결 못함
 */

import java.util.Scanner;

public class P9095 {

	
	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("테스트 횟수 > ");
		int t = scn.nextInt();
		for (int i=1; i<=t; i++) {
			int n = scn.nextInt();
			System.out.println(ottSum(n));
		}
	}

	public static int ottSum(int a) {

		int cnt = 0;
		
		for (int i=0; i<=3; i++) {
			for (int j=0; j<=5; j++) {
				for (int k=0; k<=10; k++) {
					if (i*3+j*2+k*1==a) {
						cnt += 1;
//						System.out.println(i + " " + j + " " + k);
					} else {
						continue;
					}
				}
			}
		}
		return cnt;
	}
}
