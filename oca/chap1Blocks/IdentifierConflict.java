package oca.chap1Blocks;

public class IdentifierConflict{

	private String IdentifierConflict = "The string";

	public void IdentifierConflict(){
		System.out.println("The method");
	}

	public IdentifierConflict(){
		System.out.println("The construct");
	}

	public static void main(String... args){
		IdentifierConflict a = new IdentifierConflict();
		System.out.println(a.IdentifierConflict);
		a.IdentifierConflict();
	}
} 