package co.micol.fly;


// 인터페이스
// 1. 다중상속
// 2. 모든 메서드는 추상 메서드 (public abstract가 생략)
// 3. 개발 표준을 정해줌

public interface Flyer {

	void takeOff();			// public abstract void가 생략되어있음

	void fly();

	void land();

}