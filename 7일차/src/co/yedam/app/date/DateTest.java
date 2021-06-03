package co.yedam.app.date;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {

		Date date = new Date();
		System.out.println(System.currentTimeMillis());

		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int day_year = calendar.get(Calendar.DAY_OF_YEAR);
		int hour = calendar.get(Calendar.HOUR);
		int minute = calendar.get(Calendar.MINUTE);
		int second = calendar.get(Calendar.SECOND);
		System.out.println(year+"년");
		System.out.println((month+1)+"월");
		System.out.println(day+"일");
		System.out.println(day_year+"일");
		System.out.println(hour+"시");
		System.out.println(minute+"분");
		System.out.println(second+"초");
		System.out.println("==========================================");

		// 살아온 일수 계산
		Calendar birth = Calendar.getInstance();
		birth.set(1994, 9, 30);
		long dur = calendar.getTimeInMillis() - birth.getTimeInMillis();
		dur = dur/1000/60/60/24;
		System.out.println("태어난지 " + dur + "일");

		// 기념일 계산
		Calendar anniversary = Calendar.getInstance();
		anniversary.set(2022, 0, 30);
		long d = anniversary.getTimeInMillis() - calendar.getTimeInMillis();
		d = d/1000/60/60/24;
		System.out.println("엄빠 결혼기념일까지 " + d + "일");
		
		System.out.println("==========================================");
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate.getYear()+"/"+
							currentDate.getMonthValue()+"/"+
							currentDate.getDayOfMonth());
		System.out.println(currentDate.plusDays(100));
		

		
		
	}

}
