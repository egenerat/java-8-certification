package chap4MethodsAndEncapsulation.lambdasPredicate;

import java.util.function.Predicate;

public class Ex17Autoboxing {
	public static void main(String... args) {
		System.out.println(method(i -> i == 5));

		// If only one parameter, parenthesis are not mandatory
		System.out.println(method((i) -> i == 5));

		// If only one expression, brackets and ; are not mandatory
		System.out.println(method((i) -> {
			return i == 5;
		}));

		System.out.println(method((Integer i) -> {
			return i == 5;
		}));

		// Does not compile, return keyword is missing
		// System.out.println(method(i -> {i == 5;}));

		// required: Predicate<Integer>
		// found: (int i)->i == 5
		// reason: argument mismatch; incompatible parameter types in lambda
		// expression
		// System.out.println(method((int i) -> i == 5));
	}

	public static boolean method(Predicate<Integer> pred) {
		return pred.test(5);
	}
}