package ocp.chap2DesignPatternsAndPrinciples.builder;

public class Builder {

	private int val1;
	private int val2;
	private int val3;
	private int val4;

	public Builder setVal1(int val1) {
		this.val1 = val1;
		return this;
	}

	public Builder setVal2(int val2) {
		this.val2 = val2;
		return this;
	}

	public Builder setVal3(int val3) {
		this.val3 = val3;
		return this;
	}

	public Builder setVal4(int val4) {
		this.val4 = val4;
		return this;
	}

	public ConstructorWithManyParameters build() {
		return new ConstructorWithManyParameters(val1, val2, val3, val4);
	}
}
