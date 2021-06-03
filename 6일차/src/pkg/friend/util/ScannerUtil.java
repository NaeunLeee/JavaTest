package pkg.friend.util;

import java.util.Scanner;
import pkg.Friend;

public class ScannerUtil {
	static Scanner scanner = new Scanner(System.in);
	
	public static int readInt() {
		System.out.println("입력 > ");
		Int input = scanner.nextInt();
		
	}
	public static String readStr() {			
		
	}
	public static String readDate() {
		
	}
	public static Friend readFriend() {			// split으로 한줄씩 읽어들여서 friend 객체에 넣어?
		String result = scanner.next();
		String[] arr = result.split(",");
		Friend friend = new Friend();
		friend.setGubun(arr[0]);
		friend.setGubun(arr[1]);
		friend.setGubun(arr[2]);
	}
	
}
