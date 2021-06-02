package pkg.friend;

import pkg.Friend;

public class SchoolFriend extends Friend {
	String birth;

	public SchoolFriend() {}
	public SchoolFriend(String gubun, String name, String tel) {
		super(gubun, name, tel);
	}
	public SchoolFriend(String gubun, String name, String tel, String birth) {
		// super() ->부모꺼 호출
		super(gubun, name, tel);
		this.birth = birth;
	}
	@Override
	public void print() {
//		super.print();
//		System.out.println("birth : " + birth);
		System.out.printf("회사친구 : %10s %10s %10s %10s\n", gubun, name, tel, birth);
	}
	
}
