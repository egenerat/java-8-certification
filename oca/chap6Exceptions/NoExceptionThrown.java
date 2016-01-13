package oca.chap6Exceptions;

class NoExceptionThrown {
	public static void main(String... args) {
		try {
			new NoExceptionThrown().willRaiseAnExceptionInFuture();
		} catch (Exception e) {

		}
	}

	void willRaiseAnExceptionInFuture() throws Exception {

	}
}