package co.yedam.member;

public class Member {

	String name;
	String id;
	String password;
	int age;
	
	public Member() {
		this("", "", "", 0);
	}
	
	public Member(String name, String id, String password, int age) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", id=" + id + ", password=" + password + ", age=" + age + "]";
	}
	
	
	
	
}
