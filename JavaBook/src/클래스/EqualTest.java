package 클래스;

public class EqualTest {

	public static void main(String[] args) {
		Robot r1 = new Robot(2, 4);
		Robot r2 = new Robot(2, 4);
		
		System.out.println(r1==r2);			// 단지 주소 비교 -> 같지 않음
		System.out.println(r1.equals(r2));
		System.out.println(r1);
		
//		String a = "hello";
//		String b = "hello";
//		System.out.println(a==b);
		
		String a = new String("hello");
		String b = new String("hello");
		System.out.println(a==b);
		System.out.println(a.equals(b));
		
		
	}

}
