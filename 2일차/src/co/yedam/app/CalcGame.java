package co.yedam.app;

import java.util.Scanner;

/*
 * 계산기 게임
 * 사칙연산, 진수변환, 문자값 검사
 */
//public class CalcGame {
//	//정수값 두 수의 합을 구하는 메서드			// 파이썬에서의 함수
//	int add(int a, int b) {				// def add(a, b):
//		return a+b;						//		return a+b
//	}
//	//두 수의 정수 부분 몫
//	int share(int a, int b) {
//		return a/b;
//	}
//	//두 수의 나눗셈
//	double div(int a, int b) {
//		return (double)a/b;
//	}
//	//두 수의 나머지
//	int rest(int a, int b) {
//		return a%b;
//	}
public class CalcGame {
	double a;
	double b;
	void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("x를 입력하세요 : ");
//		double x = scanner.nextDouble();
		String s1 = scanner.next();
		System.out.print("y를 입력하세요 : ");
//		double y = scanner.nextDouble();
		String s2 = scanner.next();
		a = Double.parseDouble(s1);
		b = Double.parseDouble(s2);
		scanner.close();
	}
	// 4 메서드 앞에 a와 b를 선언해줌
	
	//정수값 두 수의 합을 구하는 메서드			// 파이썬에서의 함수
	double add() {						// def add(a, b):
		return a+b;						//		return a+b
	}
	//두 수의 정수 부분 몫
	int share() {
		return (int)a/(int)b;
	}
	//두 수의 나눗셈
	double div() {
		return a/b;
	}
	//두 수의 나머지
	int rest() {
		return (int)a%(int)b;
	}
	
}
