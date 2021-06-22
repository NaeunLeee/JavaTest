package bjProblem;
/*
 * 수열 중 1개 이상의 연속된 수를 선택해야하는 문제 아직 해결 못함
 */
import java.util.Scanner;

public class P1912 {

	static Scanner scn1 = new Scanner(System.in);
	static Scanner scn2 = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("자릿수 입력 > ");
		int n = scn1.nextInt();
		System.out.print(n + "자리 수열 입력 > ");
		String[] arr = scn2.nextLine().split(" ");
		
		int maxSum = 0;
		
		for (int i=0; i<n-1; i++) {
			if (maxSum <= Integer.parseInt(arr[i])+Integer.parseInt(arr[i+1])) {
				maxSum = Integer.parseInt(arr[i])+Integer.parseInt(arr[i+1]);
			}
		}
		System.out.println(maxSum);
		
	}

}
