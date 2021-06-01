package co.micol.fly;

// 다중상속은 안됨
public class Superman extends Human implements Flyer {
	
	@Override
	public void takeOff() {
		System.out.println("슈퍼맨은 이륙합니다.");
	}
	@Override
	public void fly() {
		System.out.println("슈퍼맨은 납니다.");
	}
	@Override
	public void land() {
		System.out.println("슈퍼맨은 착륙합니다.");
	}
}
