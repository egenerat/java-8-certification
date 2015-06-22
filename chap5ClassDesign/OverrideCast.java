package chap5ClassDesign;

class Parent{
	public void method(){
		System.out.println("Parent method");
	}
}

class Child extends Parent{
	public void method(){
		System.out.println("Child method");
	}
}

public class OverrideCast{
	public static void main(String... args){
		Parent p = new Child();
		p.method(); // displays "Parent method"
	}
}