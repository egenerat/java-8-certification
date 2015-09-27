package chap5ClassDesign;

abstract class AbstractClass {
	// Method must be declared abstract (different from interface!)
	abstract void method();
}

class AbstractTest {
	public static void main(String[] args) {
		AbstractClass a = new AbstractClass();
	}
}
