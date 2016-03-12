package ocp.chap1AdvancedClassDesign.enumExamples;

public class AffluenceMain {
	public static void main(String... args) {
		Affluence affluence = Affluence.LOW;
		Affluence affluence2 = Affluence.valueOf("LOW");

		// RuntimeException
		// Affluence affluence3 = Affluence.valueOf("low");

		// Does not compile
		// Affluence affluence2 = LOW;

		switch (affluence) {
			case LOW: break;
			// Does not compile
			// case Affluence.LOW: break;
		}
	}
}