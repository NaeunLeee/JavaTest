package api;

public class Book {
	private String name;
	private String content;
	
	  
	
	public Book(String name, String content) {
		super();
		this.name = name;
		this.content = content;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", content=" + content + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}
