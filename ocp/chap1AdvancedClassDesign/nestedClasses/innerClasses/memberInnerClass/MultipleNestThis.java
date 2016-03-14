package ocp.chap1AdvancedClassDesign.nestedClasses.innerClasses.memberInnerClass;

public class MultipleNestThis {

	class A {
		private String x = "A";

		class B {
			private String x = "B";

			class C {
				private String x = "C";

				public void showAllAttributes() {
					System.out.println(x);
					System.out.println(this.x);
					System.out.println(B.this.x);
					System.out.println(A.this.x);
				}
			}
		}
	}
	public static void main(String... args) {
		MultipleNestThis root = new MultipleNestThis();
		MultipleNestThis.A a = root.new A();
		// equivalent to
		A a1 = root.new A();

		MultipleNestThis.A.B b = a.new B();
		// equivalent to
		A.B b1 = a.new B();

		// Does not compile!
		// B b = a.new B();

		MultipleNestThis.A.B.C c = b.new C();
		c.showAllAttributes();
	}
}