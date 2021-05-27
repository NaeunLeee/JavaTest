package co.yedam.app.score;

import java.util.Scanner;

/* 성적처리 프로그램
 * 국어, 영어, 수학 입력
 * 총점, 평균, 등급 계산
 */
public class ScoreApp {
	int kor;
	int eng;
	int mat;
	int sum;
	float avg;
	char grade;
	
	//성적 입력
	void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("국어 성적 입력 : ");
		kor = scanner.nextInt();
		System.out.print("영어 성적 입력 : ");
		eng = scanner.nextInt();
		System.out.print("수학 성적 입력 : ");
		mat = scanner.nextInt();
		return;					// return 뒤에 값이 없으면 void
	}
	//총점 계산
	int getSum() {
		sum = 0;
		sum = kor + eng + mat;
		return sum;
	}
	
	//평균 계산
	float getAvg() {
		avg = 0;
		avg = sum/3;
		return avg;
	}
	//평균이 60이상 true 아니면 false
	boolean isPass() {
		if (avg>=60) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
	//등급 계산
	char getGrade() {
		switch((int)avg/10) {      //80상 60중 하
		case 10: 
		case 9: 
		case 8: grade = '상'; break;
		case 7:
		case 6: grade = '중'; break;
		default: grade = '하'; break;
		}
		return grade;
	}
}
