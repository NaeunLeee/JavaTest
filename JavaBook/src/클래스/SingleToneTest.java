package 클래스;

public class SingleToneTest {

	public static void main(String[] args) {
		Calculator c1 = Calculator.getInstance();
		// c1 = new Calculator();
		c1.add(10, 20);
		
		Calculator c2 = Calculator.getInstance();
		c2.add(10, 20);
		
		System.out.println(c1 == c2);
	}

}
