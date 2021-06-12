package 제어문;

public class WhileTest {

	public static void main(String[] args) {
		// 1~10 합계 구하는 for문
		int sum = 0;
		for (int i=1; i<=10; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		// 1~10 합계 구하는 while문
		int i = 1;
		sum = 0;
		while (i<=10) {
			sum += i;
			i++;
		}
		System.out.println(sum);
		
		i = 1;
		sum = 0;
		// do, while
		do {							// do : 일단 한번은 실행후 -> while 조건 비교
			sum += i;
			i++;
		} while (i<=10);
		System.out.println(sum);
	}

}
