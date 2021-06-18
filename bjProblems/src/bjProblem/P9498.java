package bjProblem;

import java.util.Scanner;

public class P9498 {

	
	public static void calScore() {
		
		Scanner scn = new Scanner(System.in);
		
		while (true) {
			System.out.print("점수 입력 > ");
			int score = scn.nextInt();
			String grade = "";
			if (score>=90 && score<=100) {
				grade = "A";
			} else if (score>=80 && score<90) {
				grade = "B";
			} else if (score>=70 && score<80) {
				grade = "C";
			} else if (score>=60 && score<70) {
				grade = "D";
			} else if (score<60) {
				grade = "F";
			} else {
				break;
			}
			System.out.println("학점 : " + grade);
		}
	}
	
	public static void main(String[] args) {
		calScore();
	}

}
