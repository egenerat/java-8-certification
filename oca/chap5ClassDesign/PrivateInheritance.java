package oca.chap5ClassDesign;

class Parent {
	protected void privateMethod() {
		System.out.println("say hello");
	}
}

class Child extends Parent {
	public void publicMethod(){
		privateMethod();
	}
}

public class PrivateInheritance {

	public static void main(String... args){
		Child a = new Child();
		// Does not compile, privateMethod is private
		a.publicMethod();
		//Parent b = a;
		//b.method1();
	}
}