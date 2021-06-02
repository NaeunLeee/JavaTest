package pkg;
/*
 * 정적메서드 안에서는 정적필드만 접근가능
 * 접근제어자 : private > default > protected > public
 * 			같은클래스  같은패키지	다른패키지-상속
 */

public class DateUtil {
//	String date = "20210602";		-> 정적메서드 안에서 접근 불가
	String date = "20210602";
	public static String curDate() {
		DateUtil dateUtil = new DateUtil(); // -> 굳이 접근하려면 객체 생성해야됨
		return dateUtil.date;
	}
}
