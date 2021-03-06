package oca.chap4MethodsAndEncapsulation;

public class InitializationOrder {

	private int aNumber = 1;

	private InitializationOrder(){
		System.out.println("before construct" +aNumber);
		aNumber = 45;
	}

	public static void main(String[] args) {
		// System.out.println("before construct" + aNumber); // does not compile
		InitializationOrder anInstance = new InitializationOrder();
		System.out.println("after construct" + anInstance.aNumber); // not
																	// possible
																	// to
																	// reference
																	// non
																	// static
																	// fields
																	// from
																	// stsatic
																	// methods
		// System.out.println("after construct" + anInstance.aNumber); // 45

	}

	{
		aNumber = 2;
	}
}