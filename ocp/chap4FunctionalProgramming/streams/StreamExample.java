package ocp.chap4FunctionalProgramming.streams;

import java.util.stream.Stream;
import java.util.List;
import java.util.ArrayList;

public class StreamExample {
	public static void main(String... args) {
		// ===========
		// Terminal operations

		// - Reduction
		// identity set to 0. If identity is not set, the reduction returns an optional
		Stream<Integer> stream = Stream.of(1, 2, 3);
		Integer resultAddition = stream.reduce(0, (a, b) -> a+b);
		System.out.println(resultAddition);

		// ===========
		// Intermediate operations

		// Filter
		stream = Stream.of(1, 2, 3);
		Stream<Integer> filteredStream = stream.filter(a -> a > 1);
		filteredStream.forEach(System.out::print); // 23

		//==========
		System.out.println("\nmap");
		List<String> words = new ArrayList<>();
		List<String> cities = new ArrayList<>();
		words.add("Hello");
		words.add("World");
		cities.add("London");
		Stream<List<?>> stream2 = Stream.of(words, cities);
		//stream2.forEach(System.out::print);
		stream2.peek(System.out::print).map(List::size).forEach(System.out::print);


		// Iterate
		System.out.println("Iterate");
		// First parameter is the seed
		Stream<Integer> suite = Stream.iterate(2, n -> n + 1);

		suite.limit(5).forEach(System.out::print);
// Returns an infinite sequential ordered Stream produced by iterative application of a function f to an initial element seed, producing a Stream consisting of seed, f(seed), f(f(seed)), etc.
	}
}
