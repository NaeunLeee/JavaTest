package exam02;

import java.util.List;

public abstract class BookAccess {
	
	// 등록
	public abstract void insert(Book book);
	// 내용조회
	public abstract List<Book> findName(String name);
	
}
