package pkg.friend.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;



public class DateUtil {
	static String format = "yyyy-MM-dd";
	
	public static String dateToStr(Date date) {
		SimpleDateFormat df = new SimpleDateFormat(format);
		String s = df.format(date);
		return s;
	}
	public static String dateToStr(Date date, String format) {
		SimpleDateFormat df = new SimpleDateFormat(format);
		String s = df.format(date);
		return s;
	} 
	// 두 날짜 사이의 일수 계산
//	Calendar birth = Calendar.getInstance();
	public static long durationDay(String s1, String s2) {
		SimpleDateFormat df = new SimpleDateFormat(format);
		Date d1;
		Date d2;
		long result = 0;
		try {
			d1 = df.parse(s1);
			d2 = df.parse(s2);
			result = d1.getTime() - d2.getTime();
			result = result/1000/60/60/24;
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public static int lastDay(int year, int month) {
		int result = 0;
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month-1, 1);
        result = calendar.getActualMaximum(Calendar.DATE);
		return result;
	}

}
