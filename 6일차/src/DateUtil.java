

public class DateUtil {
//	String date = "20210602";		-> 정적메서드 안에서 접근 불가
	static String date = "20210602";
	static String curDate() {
//		DateUtil dateUtil = new DateUtil(); -> 굳이 접근하려면 객체 생성해야됨
		return date;
	}
}
