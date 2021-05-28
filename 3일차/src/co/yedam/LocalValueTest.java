package co.yedam;

// 지역변수 - 스택
public class LocalValueTest {

	int a;
	int b;
	
	public void method1() {
		int a = 10;
		method2();
		{
			int b = 10;
			b ++;
		}
		System.out.println(a + " : " + b);
	}
	public void method2() {
		int a = 20;
		a++;
	}
	public static void main(String[] args) {
		int a = 100;
		LocalValueTest local = new LocalValueTest();
		local.method1();
		System.out.println(a);	
	}
}
