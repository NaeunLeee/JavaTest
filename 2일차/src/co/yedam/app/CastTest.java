package co.yedam.app;

import java.util.Scanner;

/*
 * 작성자 : 이나은
 * 작성일자 : 210527
 * 
 * 형변환 테스트
 * 정수형 : byte < short < int < long
 * 실수형 : 				 float < double
 * 
 * String ------> byte    : Byte.parseByte(변수)
 * 				  short   : Short.parseShort(변수)
 * 				  int     : Integer.parseInt(변수)
 * 				  float   : Float.parseFloat(변수)
 * 				  double  : Double.parseDouble(변수)
 * 				  char    : Char.parseChar(변수)
 * 				  boolean : Boolean.parseBoolean(변수)
 * 		  <------ 
 * 		String.valueOf( )
 */
public class CastTest {

	public static void main(String[] args) {
		//자동형변환 (여러가지 타입이 섞여 있으면 가장 큰 타입 하나로 모두 변환한 다음 계산)
		int a = 10;
		long b = a;
		//강제형변환
		//a = b;       -> long 타입을 int 타입에 담으려고 해서 오류남
		a = (int)b;		// 강제로 타입을 변환해 줌
		//char <-> int
		char c = 'Z';
		System.out.println((int)c);
		int d = 97;
		System.out.println((char)d);
		//실수(double이 기본) <-> 정수(int가 기본)
		double e = 10.5;
		long f = (long)e;		//웬만하면 좌변과 우변의 타입을 맞춰주는 것이 좋음
		System.out.println(f);
		double g = 5 + 10.5;	// 5는 int, 10.5는 double -> 자동으로 double로 변환해서 계산해줌
		String h = "hi" + 5;	//"hi"는 String, 5는 int  -> 자동으로 String으로 변환
		System.out.println(g + " " + h);
		//
		System.out.println(5/2);  		// int끼리 계산 -> 결과값도 int형으로 -> 2 출력
		System.out.println(5/(double)2); 	//5도 자동으로 double로 변환 -> 2.5 출력
		double i = 5/(double)2;
		System.out.println(i);
		//
		System.out.println("hello" + 5 + 10);  		// 괄호가 없을때는 왼쪽부터 오른쪽순으로 변환을 하기 때문에 모두 String으로 변환됨
		System.out.println("hello" + (5 + 10));	 	// 괄호 안 부터 계산
		// String -> int
		String s1 = "123";
		int j = Integer.parseInt(s1);
		// int -> String
		String s2 = String.valueOf(123);
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력 : ");
		String greet = scanner.next();
		System.out.println(greet);
		
		
	}

}
