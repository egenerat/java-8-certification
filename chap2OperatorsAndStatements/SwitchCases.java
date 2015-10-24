package chap2OperatorsAndStatements;

public class SwitchCases{
	public static void main(String... args){
		int anInt = 1;
		double aDouble = 1.09;
		
		// Switch on double variable does not work
		//switch(aDouble){
		switch(anInt){
			//case 1.09:
			case 1:
		}

	String year = "Freshman";
	switch(year) {
		case "Freshman" : default: case "Sophomore" :
		case "Junior" : System.out.print("See you next year");
		case "Senior" : System.out.print("Congratulations");
	}

	}
}