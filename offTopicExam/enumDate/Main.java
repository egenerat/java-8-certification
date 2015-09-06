package offTopicExam.enumDate;

public class Main{
	public static void main(String... args){
		DayOfWeek a = DayOfWeek.SATURDAY;
		DayOfWeek b = DayOfWeek.MONDAY;
		DayOfWeek c = DayOfWeek.MONDAY;

		if(!a.equals(b))
			System.out.println(a + " different from " + b);

		if(b.equals(c))
			System.out.println(b + " equals to " + c);
		if(b == c)
			System.out.println(b + " == " + c);
	}
}