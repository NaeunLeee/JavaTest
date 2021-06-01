package 클래스;

public class RobotTest {

	public static void main(String[] args) {
// 2. 객체 생성
		Robot r = new Robot(2, 4);
//		r.arm = 2;		-> 접근제한자 때문에 수정 불가
//		r.leg = 4;
		System.out.println(r.getArm());
		System.out.println(r.getLeg());
		Robot r2 = new Robot(2,2);
// 4. 객체 사용 (메서드 호출)
		r2.print();
		
	}

}
