package 클래스;

public class CalcStaticTest {

	public static void main(String[] args) {

		// 정적 멤버는 객체를 생성하지 않고도 클래스 이름으로 직접 접근 가능
//		CalcStatic.Pi = 3.141592;
		System.out.println(CalcStatic.PI);
		System.out.println(CalcStatic.add(10, 20));
		
//		CalcStatic c1 = new CalcStatic();
//		c1.pi = 3.141592;
//		CalcStatic c2 = new CalcStatic();
//		c2.pi = 3;
//		System.out.println(c1);
//		System.out.println(c2);
	}

}
