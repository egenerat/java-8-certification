package oca.chap3CoreJavaAPIs;

import java.util.Calendar;
import java.util.Date;
import java.time.Month;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.FormatStyle;
import java.time.format.DateTimeFormatter;

class Dates {

	public void createDateFromString() throws ParseException{
		Date date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").parse("2012-05-20T09:00:00.000Z");
		String formattedDate = new SimpleDateFormat("yyyy-MM-dd'T'HHmmss").format(date);
		System.out.println(formattedDate);
	}

	public static void main(String... args) throws ParseException{
		// Be careful, old API Calendar starts at 0, new Month starts at 1
		System.out.println(Calendar.APRIL);
		System.out.println(Month.APRIL);
		System.out.println(LocalDate.of(2015, Month.APRIL, 1));
		System.out.println(LocalDate.of(2015, Calendar.APRIL, 1));
		System.out.println(LocalDate.of(2015, Calendar.MAY, 1).equals(LocalDate.of(2015, Month.APRIL, 1)));

		System.out.println(Period.ofMonths(1));
		System.out.println(Period.ofMonths(1).ofDays(2));
		System.out.println(Period.ofDays(2));

		LocalDate date = LocalDate.of(2018, Month.APRIL, 30).plusMonths(-1).plusYears(20);
		System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());

		LocalDate d = LocalDate.of(2015, 5, 12);
		LocalDateTime d1 = LocalDateTime.of(2015, 5, 12, 11, 23);
		Period p = Period.of(1, 2, 3);
		d = d.minus(p);
		DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		System.out.println(f.format(d1));
	}	
}