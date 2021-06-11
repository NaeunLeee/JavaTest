package co.memo.model;

public class Memo {
	String date;
	String title;
	String content;
	
	public Memo() {}
	
	public Memo(String date, String title, String content) {
		super();
		this.date = date;
		this.title = title;
		this.content = content;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	public void view() {
		System.out.println("날짜 : " + this.date + "\t제목 : " + this.title + "\t내용 : " + this.content);
	}
	
	public void print() {
		System.out.println("=============================");
		System.out.println("\t날짜 : " + this.date);
		System.out.println("\t제목 : " + this.title);
		System.out.println("\t내용 : " + this.content);
		System.out.println("=============================");
	}
}
