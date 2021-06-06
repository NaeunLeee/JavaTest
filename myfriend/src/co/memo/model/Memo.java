package co.memo.model;

public class Memo {
	protected String date;
	protected String content;
	
	public Memo() {} 
	public Memo(String date, String content) {
		super();
		this.date = date;
		this.content = content; 
	}
	public String toString() {
		return "Memo [date=" + date + ", content=" + content + "]";
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
	
}
