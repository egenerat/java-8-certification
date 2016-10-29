package ocp.chap4FunctionalProgramming.streams;

import java.util.Arrays;
import java.util.List;

public class ListForEach {
	public static void main(String... args) {
		List<String> words = Arrays.asList("hello", "world");
		words.forEach(System.out::println);
	}
}