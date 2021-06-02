package pkg;

public class MemberInfoMain {

	public static void main(String[] args) {

		MemberInfo member1 = MemberInfo.getInstance();
		member1.names[0] = "홍길동";
		MemberInfo member2 = MemberInfo.getInstance();
		member2.names[1] = "이나은";
		MemberInfo member3 = MemberInfo.getInstance();
		member3.names[2] = "권수민";
		
		member1.print();
		member2.print();
		member3.print();
	}

}
