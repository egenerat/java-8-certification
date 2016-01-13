package oca.chap1Blocks;

public class DataTypes{
	public static void main(String... args){
		short a = (short)123456;
		System.out.println(a);

		// Compilation is fine, b = 3 (int value)
		int b = 10/3;
		System.out.println(b);

		// Does not compile: possible lossy conversion from double to int
		//int c = 10/3.0;
		
	}
}