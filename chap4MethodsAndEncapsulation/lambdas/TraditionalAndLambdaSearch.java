package chap4MethodsAndEncapsulation.lambdas;

import java.util.*;
//useful lambda search with Predicate
import java.util.function.*;

public class TraditionalAndLambdaSearch {
	public static void main(String... args) {
		List<Animal> animals = new ArrayList<Animal>();
		Animal dog = new Animal("dog", false, true);
		Animal dog2 = new Animal("dog2", false, true);
		Animal bird = new Animal("bird", true, false);
		animals.add(dog);
		animals.add(dog2);
		animals.add(bird);

		// Traditional search
		print(animals, new CheckIfHopper());
		print(animals, new CheckIfRunner());

		// Lambda with Interface
		print(animals, a -> a.canHop());

		// Full syntax
		print(animals, (Animal a) -> {
			return a.canHop();
		});

		// Lambda with Predicate (no need of an interface)
		printLambdaPredicate(animals, a -> a.canHop());

		// Two parameters (with functional interface)
		print2Param(animals, (a, b) -> a.canRun() && b.canRun());
	}

	private static void print(List<Animal> animals, CheckTrait checker) {
		for (Animal i : animals) {
			System.out.println(i.getName() + ": " + checker.test(i));
		}
		System.out.println();
	}

	private static void printLambdaPredicate(List<Animal> animals, Predicate<Animal> checker) {
		for (Animal i : animals) {
			System.out.println(i.getName() + ": " + checker.test(i));
		}
		System.out.println();
	}

	private static void print2Param(List<Animal> animals, CheckTwoParameters checker) {
		Animal current;
		Animal next;
		for (int i = 0; i < animals.size() - 1; i++) {
			current = animals.get(i);
			next = animals.get(i + 1);
			System.out.println(current.getName() + " " + next.getName() + ": " + checker.test(current, next));
		}
		System.out.println();
	}
}