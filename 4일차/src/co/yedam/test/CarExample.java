package co.yedam.test;

public class CarExample {

	public static void main(String[] args) {
		//2. 객체 생성 (인스턴스)
		Car myCar = new Car();
		myCar.company = "삼성자동차";
		myCar.maxSpeed = 400;
		myCar.color = "레드";
		System.out.println("제작회사 : " + myCar.company);
		System.out.println("스피드 : " + myCar.speed);
		
		//생성자
		Car yourCar = new Car("쌍용자동차","티볼리","화이트");
		System.out.println(yourCar);
		//"코나, 100"
		Car miniCar = new Car("코나", -5);
		System.out.println(miniCar);
	}
}
