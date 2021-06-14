package co.academy.model;

public class Attendance {

	int id;
	String date;
	String time;
	String attend;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getAttend() {
		return attend;
	}

	public void setAttend(String attend) {
		this.attend = attend;
	}

	public Attendance() {}
	
	public Attendance(String date, String time, String attend) {
		super();
		this.date = date;
		this.time = time;
		this.attend = attend;
	}

	public String viewAtDetail() {
		return "날짜 : " + date + " | 시간 : " + time + " | 출결 : " + attend;
	}
}
