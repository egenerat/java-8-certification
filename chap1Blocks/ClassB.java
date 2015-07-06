package chap1Blocks;
import java.util.ArrayList;

public class ClassB{

	private int aInt;
	private String aString;
	private ArrayList<String> anArrayList;


// =========== Identifiers
//allowed
	private int $allowed;
	private int allowed$;
	private int _allowed;
	private int $;

//forbidden
	//private int $iden*tifier;

//================= Int
	private int a = 1_234;
// forbidden
	//private int a = 1_234_;

private byte aByte;

	public void testDefaultInitValues(){
		System.out.println("default init primitive type : "+aInt);
		System.out.println("default init String type : "+aString);
		System.out.println("default init object type : "+anArrayList);
		
		System.out.println("initialize block "+aByte);
		aByte = 015;
		System.out.println("octal : "+aByte);
	}

	// Test instantiation object
	public static void main(String[] args){
		ClassB newClass = new ClassB();
		newClass.testDefaultInitValues();
	}
}