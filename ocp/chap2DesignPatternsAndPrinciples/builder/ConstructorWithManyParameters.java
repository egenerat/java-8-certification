package ocp.chap2DesignPatternsAndPrinciples.builder;

public class ConstructorWithManyParameters {
	
	private int val1;
	
	private int val2;
	
	private int val3;
	
	private int val4;

	public ConstructorWithManyParameters(int val1, int val2, int val3, int val4) {
		this.val1 = val1;
		this.val2 = val2;
		this.val3 = val3;
		this.val4 = val4;
	}
}
