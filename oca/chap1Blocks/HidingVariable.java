package oca.chap1Blocks;

public class HidingVariable{
	public static void main(String... args){
		int i = 1;
		if(true){
			// Compilation error: variable i is already defined in method main(String...)
			//int i = 2;
		}
		System.out.println(i);
	}
}