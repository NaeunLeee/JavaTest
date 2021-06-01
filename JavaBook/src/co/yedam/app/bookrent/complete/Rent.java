package co.yedam.app.bookrent.complete;

public class Rent extends RentService {

	private String name;
	private String title;
	private String date;
	
	public Rent() {}
	public Rent(String name, String title) {
		this.name = name;
		this.title = title;
	}
	public Rent(String name, String title, String date) {
		this.name = name;
		this.title = title;
		this.date = date;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDate() {
		return date;
	}
	public String toString() {
		return "Rent [name=" + name + ", title=" + title + ", date=" + date + "]";
	}
	
	
	
}
