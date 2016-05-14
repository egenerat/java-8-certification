package ocp.chap2DesignPatternsAndPrinciples.singleton;

public class Main {
	public static void main(String... args) {
		Singleton firstReference = Singleton.getInstance();
		System.out.println(firstReference.getValue()); // 0
		firstReference.increase();
		System.out.println(firstReference.getValue()); // 1

		Singleton secondReference = Singleton.getInstance();
		System.out.println(secondReference.getValue()); // 1
		System.out.println(firstReference == secondReference); // true
	}
}
