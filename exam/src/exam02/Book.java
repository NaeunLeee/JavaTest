package exam02;

public class Book {
	String isbn;
	String name;
	String content;
	
	public Book(String isbn, String name, String content) {
		this.isbn = isbn;
		this.name = name;
		this.content = content;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
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

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", name=" + name + ", content=" + content + "]";
	}
	
	
	
}
