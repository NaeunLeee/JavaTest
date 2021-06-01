package co.micol.fly;

public abstract class Animal {
	
	
	public void run() {
		System.out.println("동물은 달립니다");
	}
//	public void eat() {
//		System.out.println("동물은 먹습니다");
//	}
	public abstract void eat();
	public void sleep() {
		System.out.println("동물은 잡니다");
	}
	
}
