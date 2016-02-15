package offTopicExam;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class BigDecimalHandling {
	
	public static void main(String[] args){
		DecimalFormat PRICE_FORMATTER = new DecimalFormat("0.00");
		double aDouble = 1.121;
		double aDoubleRoundTop = 1.129;
		System.out.println(PRICE_FORMATTER.format(aDouble));
		System.out.println(PRICE_FORMATTER.format(aDoubleRoundTop));

		BigDecimal aNumber = new BigDecimal("1.121");
		BigDecimal aNumberRoundTop = new BigDecimal("1.129");
		System.out.println(aNumber.setScale(2, RoundingMode.HALF_UP));
		System.out.println(aNumberRoundTop.setScale(2, RoundingMode.HALF_UP));

		System.out.println();
	}

}