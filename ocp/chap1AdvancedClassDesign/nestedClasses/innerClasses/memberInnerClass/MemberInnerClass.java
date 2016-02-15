package ocp.chap1AdvancedClassDesign.nestedClasses.innerClasses;

public class MemberInnerClass{

	private class InnerClass {
		private String name;

		private InnerClass(name) {
			this.name = name;
		}
	}

	public static void main(String... args){
		MemberInnerClass parent = new MemberInnerClass();
		InnerClass a = parent.new InnerClass("this is an inner class");
		System.out.println(a.name);
	}
}