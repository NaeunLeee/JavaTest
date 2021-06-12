package bjProblem;

import java.util.Scanner;

public class P10818 {
	
	// 미완...
	
	public static void main(String[] args) {
		compare();
	}
	
	public static void compare() {
		
		int cnt;
		int[] nums;
		int maxNum = 0;
		int minNum = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("갯수 입력 : ");
		cnt = scanner.nextInt();
		nums = new int[cnt];
		System.out.print("비교할 수 입력 : ");
		for (int i=0; i<cnt; i++) {
			nums[i] = scanner.nextInt();
		}
		for (int i=0; i<cnt; i++) {
			maxNum = minNum = nums[0];
			if (nums[i]>maxNum) {
				nums[i] = maxNum;
			}
			if (nums[i]<minNum) {
				nums[i] = minNum;
			}
		}
		System.out.println("최대값 : "+maxNum);
		System.out.println("최소값 : "+minNum);
		
		
		
	}
	
}


