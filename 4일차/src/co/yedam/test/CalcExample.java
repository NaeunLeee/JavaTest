package co.yedam.test;

public class CalcExample {

	public static void main(String[] args) {

		Calc calc = new Calc();
		calc.turnOn();
		calc.sum(2, 5);
		calc.sum(10.5, 20.4);
//		System.out.println("두 수의 합 : " + calc.sum2(4, 7));
//		System.out.println("배열의 총합 : " + calc.sum3(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
	}

}
