package bjProblem;

import java.util.Scanner;

public class P4344 {

	static Scanner scn1 = new Scanner(System.in);
	static Scanner scn2 = new Scanner(System.in);
	static int sum;
	static int avg;
	
	public static void main(String[] args) {
		print();
	}
	
	public static void print() {
		System.out.print("학생의 수를 입력하세요 > ");
		int n = scn1.nextInt();
		System.out.printf("학생 %d명의 점수를 입력하세요 > ", n);
		String[] arr = scn2.nextLine().split(" ");

		for (String s : arr) {
			sum += Integer.parseInt(s);
		}
		avg = sum/arr.length;
		int cnt = 0;
		for (String s : arr) {
			if (Integer.parseInt(s)<avg) {
				cnt += 1;
			}
		}
		double share = ((double)cnt/(double)arr.length)*100;
		System.out.printf("평균 %d점을 넘지 못하는 학생의 비율은 ", avg);
		System.out.printf(share + "입니다.");
	}

}
