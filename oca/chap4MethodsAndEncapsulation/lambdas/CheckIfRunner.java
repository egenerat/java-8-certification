package oca.chap4MethodsAndEncapsulation.lambdas;

public class CheckIfRunner implements CheckTrait {
	public boolean test(Animal a) {
		return a.canRun();
	}
}