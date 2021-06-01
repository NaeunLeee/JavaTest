package 클래스;


// 1. 클래스 선언
public class Robot {
	
// 1-1. 필드
//	int arm;
//	int leg;
//	private : 접근제한자. 클래스 내부에서만 접근 가능
	private int arm;		//-> 외부에서 arm과 leg를 수정할 수 없도록
	private int leg;
	private String name;
	
// 1-1-1. setter와 getter
//	setter : 필드값을 변경
	public void setArm(int arm) {
		this.arm = arm;
	}
	public void setLeg(int leg) {
		this.leg = leg;
	}
	public void setName(String name) {
		this.name = name;
	}
	
//	getter : 필드값을 조회
	public int getArm() {
		return this.arm;
	}
	public int getLeg() {
		return this.leg;
	}
	public String getName() {
		return this.name;
	}
	
// 1-2. 생성자
// 	기본 생성자 : 컴파일러가 기본으로 생성해주는 생성자
//	public Robot() {} 

	public Robot(int arm, int leg) {
		this.arm = arm;			// this는 자기자신 객체를 참조하는 참조변수
		this.leg = leg;
	}
	
	public Robot(int arm, int leg, String name) {
		this.arm = arm;
		this.leg = leg;
		this.name = name;
	}
	// 3. 일반 메서드
	public void print() {		// 접근제한자를 아무것도 안 적어주면 패키지 내에서만 작동
		System.out.printf("arm : %d | leg : %d | name : %s", arm, leg, name);
	}
}
