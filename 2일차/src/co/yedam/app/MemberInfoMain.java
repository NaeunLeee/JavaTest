package co.yedam.app;

public class MemberInfoMain {
	public static void main(String[] args) {
		MemberInfo member = new MemberInfo();
		member.input();
		member.heightWeightInput();
		member.bmi();
		member.print();
		System.out.println("BMI 지수 : " + member.result);
		System.out.println("결과 : " + member.bmi());
	}
}
