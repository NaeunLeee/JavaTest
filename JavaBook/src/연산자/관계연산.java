package 연산자;

public class 관계연산 {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int x2 = 10;
		int y2 = 10;
		
		// 첫 번째 관계식이 false면 두 번째 관계식은 검사 안 함
		if (y++>10 && x++>10) {			// y가 10보다 큰 지 검사한 다음에 ++ -> y식이 false였기 때문에 x는 ++안함
			System.out.println("A");
		} else {
			System.out.println("B");
		}
		System.out.println(x);
		System.out.println(y);
		
		System.out.println("========================================");
		
		if (y2++>10 || x2++>10) {			
			System.out.println("A");
		} else {
			System.out.println("B");
		}
		System.out.println(x2);
		System.out.println(y2);
		
	}

}
