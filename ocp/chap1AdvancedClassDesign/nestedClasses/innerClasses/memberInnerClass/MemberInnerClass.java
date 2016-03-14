package ocp.chap1AdvancedClassDesign.nestedClasses.innerClasses.memberInnerClass;

/* Compiles into 2 files:
 * 	- MemberInnerClass.class
 *	- MemberInnerClass$InnerClass.class
 */
public class MemberInnerClass{

	private class InnerClass {
		private String name;

		private InnerClass(String name) {
			this.name = name;
		}

		private String getOuterPrivateAttribute () {
			return outerPrivate;
		}
	}

	private String outerPrivate;

	private MemberInnerClass (String outerPrivate) {
		this.outerPrivate = outerPrivate;
	}

	private InnerClass anotherWayToCreateInner(String innerSecret) {
		InnerClass inner = new InnerClass(innerSecret);
		return inner;
	}

	public static void main(String... args){
		MemberInnerClass outer = new MemberInnerClass("Outer secret");
		InnerClass a = outer.new InnerClass("inner SECRET");
		// Equivalent to 
		a = outer.anotherWayToCreateInner("inner SECRET");

		// Does not compile: non-static variable this cannot be referenced from a static context
		// Member inner class is not static => used with an instance of outer class
		// InnerClass b = new InnerClass("inner SECRET");
		System.out.println("Access private attributes of the member inner class: " + a.name);
		System.out.println("Access outer private attribute: " + a.getOuterPrivateAttribute());
	}
}