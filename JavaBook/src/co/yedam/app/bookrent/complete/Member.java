package co.yedam.app.bookrent.complete;

public class Member {

	private String name;
	private String phone;
	
	public Member() {}
	
	public Member(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public String toString() {
		return "Member [name=" + name + ", phone=" + phone + "]";
	}
	
}
