package co.yedam.app.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) throws FileNotFoundException {
		String str = "1 hi";
		Scanner scanner = new Scanner(new FileInputStream("d:/temp/f.dat"));
//		int a = scanner.nextInt();
		while (true) {
			try {
				String b = scanner.next();
				System.out.println(b);
			} catch (Exception e) {
				break;
			}
		}
	}
}
