package 클래스;

public class MemberEqualTest {

	public static void main(String[] args) {
		Member m1 = new Member("park", "박기자", "1111", 20);
		Member m2 = new Member(new String("park"), "박기자", "2222", 25);
		System.out.println(m1==m2);
		System.out.println(m1.equals(m2));
	}

}
