package chap6Exceptions;

public class Raise{
	public static void main(String... args){
		boolean raiseException = false;
		do {
			try{
				System.out.println("Try with raiseException value = " + raiseException);
				if(raiseException){
					throw new Exception("I am raising an exception manually");
				}
			}
			catch(Exception e){
				System.out.println("Catch");
				e.printStackTrace();
			}
			finally{
				System.out.println("Finally");
				raiseException = raiseException? false: true;
			}
		}
		while(raiseException);
	}
}