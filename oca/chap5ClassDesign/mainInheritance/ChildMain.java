package oca.chap5ClassDesign.mainInheritance;

public class ChildMain extends ParentMain{
	public static void main(String ... args ){
		// Works as expected
		// System.out.println("Child main");

		// Does not compile: non-static variable super cannot be referenced from a static context
		// super.main()

		ParentMain.main();
	}
}