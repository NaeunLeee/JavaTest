package co.yedam.app.bookrent.complete;

public class Book {

	private String title;
	private String author;
	
	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}
	
	public Book(String title) {
		this(title, "작자미상");
	}
	
	public Book() {
		this("","");
	}

	public void print() {
		System.out.printf("제목 : %s  작자 : %s\n", title, author);
	}
}
