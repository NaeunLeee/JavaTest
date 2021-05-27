package co.yedam.app;
/*
 * 연산자 테스트
 * 논리 : and(&&) or (||) not(!)
 * a++ -> a=a+1
 * ++a 
 * 조건 ? t : f  -> if 조건:
 * 					  t
 * 				   else:
 * 					  f
 */
public class OperateTest {

	public static void main(String[] args) {
		//증감연산자
		int x = 1;
		int y = 1;
		int a = 1;
		int b = 1;
		int result1 = ++x + 10;			// 10과의 덧셈 전에 1씩 증가
		int result2 = y++ + 10;			// 10과의 덧셈 후에 1씩 증가
		int result3 = ++a + b++;
		System.out.println(String.format("x = %d, 결과 : %d", x, result1));
		System.out.println(String.format("y = %d, 결과 : %d", y, result2));
		System.out.println(String.format("a = %d, b = %d, 결과 : %d", a, b, result3));
		//논리연산자
		System.out.println(x>0 && y>0);
		System.out.println(x==0 || y==0);		
		System.out.println(!(x==0 || y==0));		// ! : not
		System.out.println(!(x==0) || (y==0));
		//삼항연산
		x = 3;
		System.out.println(x>=0 && y>=0 ? "둘 다 0보다 크거나 같음" : "둘 중 하나 이상은 음수");
		System.out.println(x%2==0 ? "짝수" : "홀수");
		
		
		
		
		
		
		
	}

}
