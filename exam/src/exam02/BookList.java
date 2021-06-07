package exam02;

import java.util.ArrayList;
import java.util.List;

public class BookList extends BookAccess {
	ArrayList<Book> list;
	
	public BookList() {
		list = new ArrayList<Book>();
	}
	
	// 등록
	public void insert(Book book) {
		list.add(book);
	}
	
	// 내용조회
	public List<Book> findName(String name) {
		List<Book> bookList = new ArrayList<Book>();
		for (Book b : list) {
			if (b.getName().contains(name)) {
				bookList.add(b);
			}
		}
		return bookList;
	}
	
}
