package offTopicExam;

import java.math.BigDecimal;

public class BigDecimalDraft {
	public static void main(String[] args){

		float aZero = 0.00f;
		float anotherZero = 0f;
		System.out.println(aZero == anotherZero);
		// true

		// Using double
		double aDouble = 0.61;
		System.out.println(0.61); // 0.61
		System.out.println(1.03);
		System.out.println(.42);
		System.out.println(1.03 - .42);
		

		double aDouble1 = 1.03 - .42;
		System.out.println(aDouble1);
		// 0.6100000000000001

		// Using big decimals: subtract in construct
		BigDecimal aBigDecimal = new BigDecimal(1.03 - .42);
		System.out.println(aBigDecimal);
		// 0.6100000000000000976996261670137755572795867919921875

		// Subtract 2 BigDecimal
		BigDecimal aBigDecimal1 = new BigDecimal(1.03);
		BigDecimal aBigDecimal2 = new BigDecimal(.42);
		System.out.println(aBigDecimal1.subtract(aBigDecimal2));
		// 0.610000000000000042188474935755948536098003387451171875

		// Subtract 2 BigDecimal created with String value
		BigDecimal aBigDecimal3 = new BigDecimal("1.03");
		BigDecimal aBigDecimal4 = new BigDecimal(".42");
		System.out.println(aBigDecimal3.subtract(aBigDecimal4));
		// 0.61

		// Try the isPositive method
		BigDecimalDraft comparator = new BigDecimalDraft();
		System.out.println(comparator.isPositive(aBigDecimal));
	
		// Big number in a float ( > 16,777,216)
		float aHugeFloat = 16777217;
		System.out.format("%f%n", aHugeFloat);
		// 16777216.000000: problem!!!

		// Does not compile
		//BigDecimal truc = 5.4f;

		Float aFloat = 1.03f;
		System.out.println(aFloat);
		// 1.03

		BigDecimal bigDecimalFromFloat = new BigDecimal(aFloat);
		System.out.println(bigDecimalFromFloat);
		// 1.0299999713897705078125

		bigDecimalFromFloat = new BigDecimal(aFloat.toString());
		System.out.println(bigDecimalFromFloat);
		// 1.03
	}

	public boolean isPositive(BigDecimal aBigDecimal) {
		return BigDecimal.ZERO.compareTo(aBigDecimal) < 0;
	}
}