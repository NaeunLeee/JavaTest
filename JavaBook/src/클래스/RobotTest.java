package 클래스;

public class RobotTest {

	public static void change(int a) {			// 기본 타입의 변수
		a += 10;
	}
	public static void change(Robot robot) {	// 참조변수
		robot.setArm(5);
	}
	public static void main(String[] args) {
// 2. 객체 생성
		Robot r = new Robot(2, 4);
		change(r);
		System.out.println(r.getArm());
		
		int a = 1;
		change(a);
		System.out.println(a);
		
//		r.arm = 2;		-> 접근제한자 때문에 수정 불가
//		r.leg = 4;
		System.out.println(r.getArm());
		System.out.println(r.getLeg());
		Robot r2 = new Robot(2,2);
// 4. 객체 사용 (메서드 호출)
		r2.print();
		
	}

}
