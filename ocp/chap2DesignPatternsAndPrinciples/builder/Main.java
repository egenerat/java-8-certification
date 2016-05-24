package ocp.chap2DesignPatternsAndPrinciples.builder;

public class Main {

	public static void main(String... args) {
		Builder builder = new Builder();
		builder
			.setVal1(1)
			.setVal2(2)
			.setVal3(3)
			.setVal4(4);
		ConstructorWithManyParameters obj = builder.build();

		// or with anonymous builder
		ConstructorWithManyParameters obj2 = new Builder().setVal1(1)
														.setVal2(2)
														.setVal3(3)
														.setVal4(4)
														.build();
	}
}
