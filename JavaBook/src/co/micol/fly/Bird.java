package co.micol.fly;

public class Bird extends Animal {

	@Override
	public void run() {
		super.run();
		System.out.println("새도 달립니다");
	}
	@Override
	public void eat() {
//		super.eat();
		System.out.println("새도 먹습니다.");
	}
	public void takeOff() {
		System.out.println("새는 이륙합니다.");
	}
	public void fly() {
		System.out.println("새는 납니다.");
	}
	public void land() {
		System.out.println("새는 착륙합니다.");
	}
	public void layEggs() {
		System.out.println("새는 알을 낳습니다.");
	}
}
