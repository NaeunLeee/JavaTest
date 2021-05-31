package co.yedam.score;

import java.util.Scanner;

public class ArrayApp {

	int[] arr;					// 성적
	int studentNum;				// 학생수
	Scanner scanner = new Scanner(System.in);
	
	
	void init() {
		System.out.print("학생수 > ");
		studentNum = scanner.nextInt();
		arr = new int[studentNum];
	}
	
	void input() {
		for (int i=0; i<arr.length; i++) {
			System.out.printf("scores[%d] > ", i);
			arr[i] = scanner.nextInt();
		}
	}
	void print() {
		for (int i=0; i<arr.length; i++) {
			System.out.printf("scores[%d] > %d\n", i, arr[i]);
		}
	}
	int max() {
		int max = 0;
		for (int i=0; i<arr.length; i++) {
			if (arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}
	double avg() {
		double result = 0;
		double avg = 0; 
		for (int i=0; i<arr.length; i++) {
			result += arr[i];
			avg = result/arr.length;
		}
		return avg;
	}

	public static void main(String[] args) {

		ArrayApp app = new ArrayApp();
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		int selectNo = 0;
		while(run) {
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.print("선택 > ");
			selectNo = scanner.nextInt();
			if (selectNo == 1) {
				app.init();				
			}
			else if (selectNo == 2) {
				app.input();				
			}
			else if (selectNo == 3) {
				app.print();				
			}
			else if (selectNo == 4) {
				System.out.println("최고 점수 : "+app.max());
				System.out.println("평균 점수 : "+app.avg());
			}
			else if (selectNo == 5) {
				System.out.println("프로그램 종료");
				run = false;
			}
		}


	}
}
