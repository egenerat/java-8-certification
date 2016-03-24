package ocp.chap1AdvancedClassDesign.nestedClasses.staticNestedClass;

// Can be instantiated without an object of the enclosing class
// Can't access instance variables without an explicit object

// Treated as if it were a namespace
// Possible to: import Outer.Nested;
public class Outer {

	private String outerSecret = "OUTER secret";

	static class Nested {
		private String secret = "Secret";

		private String publishSecret() {
			// Does not compile
			// return outerSecret;
			// return Outer.outerSecret;
			return new Outer().outerSecret;
		}
	}

	public static void main(String... args) {
		Nested nested = new Nested();
		System.out.println(nested.secret);
		System.out.println(nested.publishSecret());
	}
}