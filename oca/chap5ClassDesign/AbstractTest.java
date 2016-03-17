package oca.chap5ClassDesign;

abstract class AbstractClass {
	// Method must be declared abstract (different from interface!)
	abstract void method();
}

class AbstractTest {
	public static void main(String[] args) {
		// Does not compile
		// AbstractClass a = new AbstractClass();
	}
}
