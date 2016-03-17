package oca.chap5ClassDesign.override;

class Parent {
	public void method() {
		System.out.println("Parent method");
	}
}

class Child extends Parent {
	public void method() {
		System.out.println("Child method");
	}
}

class Other{}

public class OverrideCast {
	public static void main(String... args) {
		Parent p = new Child();
		p.method(); // displays "Parent method"

		// Compilation ok, error at runtime
		//Parent aaa = (Parent)new Object();

		// incompatible types: Other cannot be converted to Parent
		// Parent bbb = (Parent)new Other();
	}
}