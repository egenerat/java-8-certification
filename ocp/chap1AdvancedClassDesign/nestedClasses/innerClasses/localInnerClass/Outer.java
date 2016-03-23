package ocp.chap1AdvancedClassDesign.nestedClasses.innerClasses.localInnerClass;

/* Access local variables of a method only if they are final or effectively final.
 * Effectively final: new concept in Java 8
 * Code would compile the same if the final keyword is added to the variable declaration

 */

public class Outer {
	private int x = 1;

	public void calculate() {
		final int y = 2;

		class Inner {
			public int add() {
				return x + y;
			}
		}
		Inner inner = new Inner();
		System.out.println("Result of calculate: " + inner.add());
	}

	public static void main(String... args) {
		Outer out = new Outer();
		out.calculate();
	}
}