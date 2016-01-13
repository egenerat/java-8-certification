package oca.chap2OperatorsAndStatements;

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

	String year = "Freshman2";
	switch(year) {
		case "Freshman" : default: System.out.println("hello"); case "Sophomore" :
		case "Junior" : System.out.print("See you next year");
		case "Senior" : System.out.print("Congratulations");
	}

	final int foo = 1;
	switch(anInt){
		case 0:
		case foo:
	}

	}
}