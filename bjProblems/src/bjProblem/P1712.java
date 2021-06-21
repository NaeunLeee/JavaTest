package bjProblem;

import java.util.Scanner;

public class P1712 {

	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("고정비용,가변비용,가격 > ");
		String[] arr = scn.next().split(",");
		int f = Integer.parseInt(arr[0]);
		int v = Integer.parseInt(arr[1]);
		int p = Integer.parseInt(arr[2]);
		
		if (p<=v) {
			System.out.println("-1");
		} 
		else {
			System.out.println((f/(p-v))+1);
		}
		
	}

}
