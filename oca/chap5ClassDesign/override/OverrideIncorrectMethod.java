package oca.chap5ClassDesign.override;

interface HasTail {
	int getTailLength();
}

abstract class Puma implements HasTail {
	// Does not compile (attempting to assign weaker privileges: protected and default)
	// A method is supposed public in an interface, not in an abstract class
	// protected int getTailLength() {
//	int getTailLength() {
	public int getTailLength() {
		return 4;
	}
}

public class OverrideIncorrectMethod extends Puma {
	public static void main(String[] args) {
		OverrideIncorrectMethod puma = new OverrideIncorrectMethod();
		System.out.println(puma.getTailLength());
	}

	// If OverrideIncorrectMethod does not implement a valid implementation of
	// getTailLength, there are 2 compilations errors: one line 8 and 13

	// If there is a valid implementation, no more compilation error line 13
	/*
	 * public int getTailLength(){ return 1; }
	 */
}