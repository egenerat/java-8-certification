package ocp.chap4FunctionalProgramming.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MapExample {
	public static void main(String... args) {
		List<Integer> l = IntStream.range(1, 10)
						.mapToObj(x -> x)
						.collect(Collectors.toList());
		l.forEach(System.out::println);
	}
}