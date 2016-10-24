package ocp.chap4FunctionalProgramming.streams;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

class StreamComparisonJava7And8 {
	public static void main(String... args) {
		// Find the first 2 names alphabetically that are 5 character long

		// Java 7
		List<String> names = Arrays.asList("Emile", "Bob", "Alice");
		List<String> filteredNames = new ArrayList<>();
		for(String i : names) {
			if(i.length() == 5) {
				filteredNames.add(i);
			}
		}
		Collections.sort(filteredNames);
		for(String i : filteredNames)
			System.out.println(i);

		// Java 8
		names.stream().filter(n -> n.length == 5)
			.sorted()
			.limit(2)
			.forEach(System.out::println);
	}
}