package 스레드;

public class User1 extends Thread {
	private Calculator calculator;

	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
		this.setName("User1");
	}

	@Override
	public void run() {
		calculator.setMemory(100);
	}
	
}
