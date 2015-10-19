package chap6Exceptions;

public class FinalNoCatch {
	public static void main(String... args) throws Exception {
		try {
			throw new Exception();
		} finally {
			System.out.println("Finally");
		}
		// Unreachable!
		// System.out.println("Does not pass here");

		// try{
		// 	throw new Exception();
		// }
		// finally{
		// 	System.out.println("Finally before catch");
		// }
		// catch(Exception e){
		// 	System.out.println("Catch after finally");
		// }
	}
}