package bjProblem;

import java.util.Scanner;

public class P10871 {
	
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		print();
	}
	
	public static void print() {
		System.out.print("수의 갯수(N)와 비교할 수(X)를 입력하세요 > ");
		String[] arr1 = scn.nextLine().split(" ");
		int n = Integer.parseInt(arr1[0]);
		int x = Integer.parseInt(arr1[1]);
		System.out.printf("%d개의 수를 입력하세요 > ", n);
		String[] arr2 = scn.nextLine().split(" ");
		for (String s : arr2) {
			if (Integer.parseInt(s)<x) {
				System.out.print(s);
				System.out.print(" ");
			}
		}
	}
}
