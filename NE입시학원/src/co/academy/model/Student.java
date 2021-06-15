package co.academy.model;

public class Student {

	int id;
	String pw;
	String name;
	String birth;
	String phone;
	String grade;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", pw=" + pw + ", name=" + name + ", birth=" + birth + ", phone=" + phone
				+ ", grade=" + grade + "]";
	}
	public String viewInfo() {
		return "  " + id + " | 이름 : " + name + " | 생년월일 : " + birth;
	}
	public String viewDetail() {
		return "수강번호 : " + id + " | 이름 : " + name + " | 생년월일 : " + birth + " | 전화번호 : " + phone;
	}
	public String viewName() {
		return name;
	}

	public Student() {}
	
	public Student(String name) {
		super();
		this.name = name;
	}
	
	public Student(int id, String pw, String name, String birth, String phone, String grade) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.birth = birth;
		this.phone = phone;
		this.grade = grade;
	}
	
}
