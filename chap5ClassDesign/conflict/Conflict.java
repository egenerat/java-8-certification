package chap5ClassDesign.conflict;

interface ParentA{
	default public void method(){
		System.out.println("Parent A");
	}
}

interface ParentB{
	public void method();
}

interface ParentC extends ParentB{
	default public void method(){
		System.out.println("Parent C");
	}
}

interface ParentD{
	public void method();
}


// error: class Conflict inherits unrelated defaults for method() from types ParentA and ParentB
/*public class Conflict implements ParentA, ParentB{
	public static void main(String... args){
		System.out.println("Conflict");
	}
}*/


public abstract class Conflict implements ParentD, ParentB{
	// public void method(){}

	public static void main(String... args){
		System.out.println("Conflict");
	}
}