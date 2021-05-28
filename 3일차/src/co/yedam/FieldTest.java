package co.yedam;

public class FieldTest {
	int a = 10;				// -> 힙에 저장
	int b = 10;
	
	public void method1() {
//		int a = 0;			// -> 스택에 저장
		a++;
	}
	public static void main(String[] args) {
		FieldTest fieldTest = new FieldTest();
		fieldTest.method1();
		System.out.println(fieldTest.a);
	}
}
