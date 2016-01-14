package oca.chap4MethodsAndEncapsulation.lambdas;

public class CheckIfHopper implements CheckTrait {
	public boolean test(Animal a) {
		return a.canHop();
	}
}