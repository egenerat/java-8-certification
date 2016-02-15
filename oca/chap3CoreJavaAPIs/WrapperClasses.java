package oca.chap3CoreJavaAPIs;

public class WrapperClasses {
	public static void main(String... args) {
		boolean aBool;
		Boolean aBooleanWrapperClass;

		aBool = Boolean.parseBoolean("true");
		aBooleanWrapperClass = Boolean.valueOf("TRUE");
		System.out.println(aBooleanWrapperClass.equals(aBool));

		aBool = Boolean.parseBoolean("tRuE");
		System.out.println(aBool); // true

		aBool = Boolean.parseBoolean("1");
		System.out.println(aBool); // false

		aBooleanWrapperClass = Boolean.valueOf("true");
		System.out.println(aBooleanWrapperClass); // true

		int anInt = new Integer(1);
	}
}