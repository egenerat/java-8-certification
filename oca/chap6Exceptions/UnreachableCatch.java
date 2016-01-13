package oca.chap6Exceptions;

class MyException extends Exception {
}

public class UnreachableCatch {
	public static void main(String... args) {
		try {

		} catch (Exception e) {

		}
		// catch(MyException e){
		// unreachable code exception !!
		// }
	}
}