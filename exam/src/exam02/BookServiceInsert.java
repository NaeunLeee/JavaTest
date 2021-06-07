package exam02;

import java.util.Scanner;

public class BookServiceInsert implements BookService {

	@Override
	public void execute(BookList bookList) {
		
//		스캐너 isbn, name, 내용 입력
		System.out.println("입력 > ");
		Scanner scanner = new Scanner(System.in);
		String[] arr = scanner.next().split(",");
		String isbn = arr[0];
		String name = arr[1];
		String content = arr[2];
		
		Book book = new Book(isbn, name, content);
		bookList.insert(book);
		
	}


	

}
