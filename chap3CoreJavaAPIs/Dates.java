package chap3CoreJavaAPIs;

import java.util.Calendar;
import java.time.Month;
import java.time.*;

class Dates {

	public void createDateFromString() {
		Date date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").parse("2012-05-20T09:00:00.000Z");
		String formattedDate = new SimpleDateFormat("yyyy-MM-dd'T'HHmmss").format(date);
		System.out.println(formattedDate);
	}

	public static void main(String... args) {
		// Be careful, old API Calendar starts at 0, new Month starts at 1
		System.out.println(Calendar.APRIL);
		System.out.println(Month.APRIL);
		System.out.println(LocalDate.of(2015, Month.APRIL, 1));
		System.out.println(LocalDate.of(2015, Calendar.APRIL, 1));
		System.out.println(LocalDate.of(2015, Calendar.MAY, 1).equals(LocalDate.of(2015, Month.APRIL, 1)));

		System.out.println(Period.ofMonths(1));
		System.out.println(Period.ofMonths(1).ofDays(2));
		System.out.println(Period.ofDays(2));
	}
}