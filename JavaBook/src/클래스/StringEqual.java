package 클래스;

public class StringEqual {

	public static void main(String[] args) {
		String s1 = "hello";				// 상수 (new 아닌 것들은 모두 상수. ex.scanner로 입력받은 값)
		String s2 = "hello";
		String s3 = new String("hello");	// 힙 영역에 할당
		String s4 = new String("hello");
		
		System.out.println(s1==s2);			
		System.out.println(s3==s4);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		System.out.println(s3.equals(s4));
		
		StringBuffer sb = new StringBuffer("hello world");
		sb.insert(5, "!!!");
		System.out.println(sb.toString());			//StringBuffer에서 equals 사용하려면 toString 필수!
		sb.replace(0, 5, "hi");
		System.out.println(sb.toString());
		
	}

}
