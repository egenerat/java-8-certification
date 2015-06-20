package chap5ClassDesign.conflict;

interface ParentA{
	default public void method(){
		System.out.println("Parent A");
	}
}

interface ParentB{
	default public void method(){
		System.out.println("Parent B");
	}	
}

interface ParentC extends ParentB{
	default public void method(){
		System.out.println("Parent C");
	}	
}

// error: class Conflict inherits unrelated defaults for method() from types ParentA and ParentB
/*public class Conflict implements ParentA, ParentB{
	public static void main(String... args){
		System.out.println("Conflict");
	}
}*/

public class Conflict implements ParentA, ParentC{
	public static void main(String... args){
		System.out.println("Conflict");
	}
}