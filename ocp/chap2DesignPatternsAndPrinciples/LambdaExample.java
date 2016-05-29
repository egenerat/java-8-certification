package ocp.chap2DesignPatternsAndPrinciples;

public class LambdaExample {

	@FunctionalInterface
	public interface NoReturnType {
		void test();
	}

	public static void noReturnType(NoReturnType l) {
		l.test();
	}

	public static void main(String... args) {
		// TODO
		// Allowed
		noReturnType(() -> System.out.println("hello"));

		// Do not compile
		// noReturnType( -> System.out.println());
		// => If 0 parameter, parenthesis are mandatory

		/* () mandatory if:
				- 0 parameter
				- Types are specified

			{} braces mandatory if:
				- return ;
				- more than one line
		*/
	}
}
