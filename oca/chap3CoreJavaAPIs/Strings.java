package oca.chap3CoreJavaAPIs;

public class Strings {
	public static void main(String[] args) {

		// String Buffer declarations
		StringBuffer sb = new StringBuffer();
		StringBuffer sb2 = new StringBuffer("Initial string");

		// does not compile
		// String aString = 1;

		// even with explicit cast
		// String aString = (String)1;

		String aString2 = "string";

		// Possible to concatenate a string and a char
		aString2 += 'c';

		String aaa = "";
		System.out.println(aaa.length());

		char bbb = 'a';
		System.out.println(++bbb);

	}
}