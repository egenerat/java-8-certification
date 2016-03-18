package ocp.chap1AdvancedClassDesign.nestedClasses.innerClasses.anonymousInnerClass;

// Also possible to give an anonymous class as a parameter of a method
public class AnonymousInner {
	
	// Declaration of the abstract class
	abstract class AbstractSize {
		abstract int getSize();
	}

	public int getImplementedSize() {
		// Define the anonymous inner class
		// Is required to extend an existing class or implement an existing interface

		// Be careful, anonymous cannot extend and implement at the same time.
		AbstractSize size = new AbstractSize() {
			int getSize() {
				return 1;
			}
		// Semi-colon here since we are declaring a local variable
		};

		return size.getSize();
	}

	public static void main(String... args) {
		AnonymousInner a = new AnonymousInner();
		System.out.println(a.getImplementedSize());
	}
}