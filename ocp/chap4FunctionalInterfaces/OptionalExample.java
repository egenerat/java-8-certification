package ocp.chap4FunctionalInterfaces;

import java.util.Optional;

public class OptionalExample {

	public static Optional<String> getName(String firstLetter) {
		if (firstLetter.equals("a")) {
			return Optional.of("Albert");
		}
		return Optional.empty();
	}

	public static void main(String... args) {

	}
}
