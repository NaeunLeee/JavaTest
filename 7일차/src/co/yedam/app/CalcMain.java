package co.yedam.app;

public class CalcMain {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		int c = 0;
		try {
			c = Calc.div(a, b);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(c);
	}

}
