package co.yedam.test;

/* 자동차 정보 */

//1. 클래스 선언
public class Car {
	// 필드 (상태, 속성)
	String company;
	String model;
	String color;
	int maxSpeed;
	int speed;
	
	// 생성자
	/* 1. 객체생성시에 호출되어 필드를 초기화하는 특수용도의 메서드
	 * 2. 생성자 이름은 클래스명과 동일
	 * 3. 리턴타입 없음 (void 등 x)
	 * 4. 생성자 여러개 중복선언(오버로딩)은 가능하지만
	 * 	  매개변수의 타입과 갯수는 달라야 함.
	 */

	Car() {
		this("현대자동차", "그랜저", "블랙", 350, 0);
	}
	// source - Generate Constructor using Fields

	public Car(String company, String model, String color) {
		this(company, model, color, 0, 0); 
	}
	public Car(String model, int speed) {
		this("", model, "", 0, speed);
	}
	
	
	public Car(String company, String model, String color, int maxSpeed, int speed) {
			super();
			this.company = company;
			this.model = model;
			this.color = color;
			if(maxSpeed>100) {
				this.maxSpeed = maxSpeed;
			}
			else {
				this.maxSpeed = 100;
			}
			if(speed>0) {
				this.speed = speed;
			}
			else {
				this.speed = 0;
			}
		}
	//	String과 int를 매개변수로 가지는 생성자가 또 있기 때문에 오류남.
//	public Car(String model, int maxSpeed) {
//		super();
//		this.model = model;
//		this.maxSpeed = maxSpeed;
//	}
	@Override
	public String toString() {
		return "Car [company=" + company + ", model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed
				+ ", speed=" + speed + "]";
	}
}
