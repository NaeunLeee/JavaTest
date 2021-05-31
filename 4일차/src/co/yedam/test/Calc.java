package co.yedam.test;

// 클래스 : 필드 + 메서드 + 생성자
public class Calc {
	
	//on		1. 리턴값도 없고, 매개변수도 없음.
	void turnOn() {
		System.out.println("계산기 ON");
	}
	
	//덧셈		2. 리턴값 없고, 매개변수는 있음.
	void sum(int a, int b) {
		System.out.println("int 메서드");
		System.out.println("두 수의 합 : "+(a+b));
	}
	void sum(double a, double b) {
		System.out.println("double 메서드");
		System.out.println("두 수의 합 : "+(a+b));
	}

	//덧셈		3. 리턴값도 있고, 매개변수도 있음.
	int sum2(int a, int b) {
		return a+b;
	}
	//덧셈		4. 가변인수
	int sum3(int ... arr) {
		int result = 0;
		for (int i=0; i<arr.length; i++) {
			result += arr[i];
		}
		return result;
	}
}
