package co.micol.fly;

public class Human extends Animal {

	public void think() {
		System.out.println("사람은 생각합니다.");
	}

	@Override
	public void eat() {
		System.out.println("사람도 먹습니다.");
	}
}
