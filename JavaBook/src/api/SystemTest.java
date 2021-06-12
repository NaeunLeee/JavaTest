package api;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Field;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;


public class SystemTest {   

	public static void main(String[] args) throws URISyntaxException, FileNotFoundException {
		System.out.println(System.currentTimeMillis());
//		 파일명 rename, 실행시간
		//System.exit(1);
		Map<String, String> map = System.getenv();
		System.out.println(map.get("JAVA_HOME"));
		Iterator<String> iter = map.keySet().iterator();
		while (iter.hasNext()) {
			String key = iter.next();
			System.out.println(key + " : " + map.get(key));
		}
//		System.gc(); // 안해줘도 JVM이 알아서 메모리 제거
		
		
		// java.lang.reflect 필드
		Field[] fields = Book.class.getDeclaredFields();
		for (Field f : fields) {
			System.out.println(f.getName() + " : " + f.getType());
		}
		URI uri = Book.class.getResource("/resources/menu.txt").toURI();
		Scanner scanner = new Scanner(new File(uri));
		System.out.println(scanner.next());
		
	}

}
