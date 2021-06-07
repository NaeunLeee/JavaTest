package 스레드;

public class Print1000 implements Runnable {
	
	public void run() {
		for (int i=1000; i<=1100; i++) {
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
