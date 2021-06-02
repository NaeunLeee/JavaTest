package pkg.collect;

public class StringTest {

	public static void main(String[] args) {
		String str = "hello everybody!!";
		char c = str.charAt(1);
		System.out.println(str.charAt(str.length()-1));
		System.out.println("인덱스 위치의 한글자 : " + c);
		System.out.println(str.substring(6, 11));
		System.out.println(str.contains("body"));
		System.out.println(str.endsWith("!!"));
		System.out.println(str.startsWith("hell"));

		String num = "201030-11231234";
		String[] arr = num.split("-");
		System.out.println(arr[0]);
		System.out.println(arr[1].charAt(0));
		
		String path = "c:/temp/image/a.jpg";
		int pos = path.indexOf('/');
		int pos2 = path.lastIndexOf('/');
		int pos3 = path.lastIndexOf("/", pos2+1);
		System.out.println(pos + " " + pos2);
		
		// 마지막 .의 위치에서 +1부터 끝까지 : LastIndexOf, substring
		System.out.println("확장자 : " + StringUtil.getExtention(path));
		System.out.println("파일명 : " + StringUtil.getFilename(path));
		System.out.println("경로 : " + StringUtil.getPath(path));
	
		String b = "문자열 문자";
//		String d = new String(b.getBytes(), "euc-kr");
		b = b.replace("문자", "숫자");
		System.out.println(b);
	}

}
