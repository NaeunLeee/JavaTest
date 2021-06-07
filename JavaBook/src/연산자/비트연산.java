package 연산자;

/*
 * ^ : xor -> 서로 다르면 1 (암호화)
 * & : and -> 마스크
 * | : or
 */


public class 비트연산 {

	public static void main(String[] args) {
		// 암호화,복호화
		int a = 04474;
		int key = 01111;
		int b = a ^ key;
		int c = b ^ key;
		System.out.println("원문 : " + a);
		System.out.println("암호화 : " + b);
		System.out.println("복호화 : " + c);
		
		// 마스크
		int d = 0b10101111;
		int e = 0b00000010;
		System.out.println(Integer.toBinaryString(d & e));
		
		// 쉬프트연산
		int f = 8;
		System.out.println(f>>1);		// 1000 -> 0100			(나누기 2와 같은데 속도가 더 빠름)
		System.out.println(f<<1);		// 1000 -> 10000		(곱하기 2와 같은데 속도가 더 빠름)
		
		
		
	}

}
