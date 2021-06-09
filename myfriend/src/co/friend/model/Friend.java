package co.friend.model;

// 친구 한명의 정보를 저장하는 용도
public class Friend {
	
	protected String gubun;
	protected String name;
	protected String tel;
	
	public Friend() {}
	public Friend(String gubun, String name, String tel) {
		super();
		this.gubun = gubun;
		this.name = name;
		this.tel = tel;
	}
	public void print() {
		System.out.printf("친구 : %5s %5s %5s\n", gubun, name, tel);
	}
	public String toString() {
		return "Friend [gubun=" + gubun + ", name=" + name + ", tel=" + tel + "]";
	}
	public String getGubun() {
		return gubun;
	}
	public void setGubun(String gubun) {
		this.gubun = gubun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	@Override
	public int hashCode() {
		return this.getGubun().hashCode() + this.getName().hashCode() + this.getTel().hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		Friend f = (Friend) obj;
		return this.getGubun().equals(f.getGubun()) 
				&& this.getName().equals(f.getName()) 
				&& this.getTel().equals(f.getTel());
	}
}
