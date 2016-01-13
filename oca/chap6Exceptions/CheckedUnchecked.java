package oca.chap6Exceptions;

class CheckedUnchecked {
	public static void main(String... args) {
		CheckedUnchecked obj = new CheckedUnchecked();
		System.out.println("Begin");
		// obj.raiseException();
		// obj.raiseRuntimeException();
		try {
			obj.raiseError();
		} catch (Error e) {
			System.out.println("Caught error");
		}
	}

	// Exception must be handled or thrown, unlike Runtime Exception
	void raiseException() throws Exception {
		throw new Exception();
	}

	void raiseRuntimeException() {
		throw new RuntimeException();
	}

	void raiseError() {
		throw new Error();
	}
}