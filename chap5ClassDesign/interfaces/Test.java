package chap5ClassDesign.interfaces;

public class Test {
	public static void main(String args[]) {
		// Before the interface is implemented, it is not possible to call the
		// interface method
		// new Test().myMethod(null);
		new Test().myMethod(new FutureClass());
	}

	public void myMethod(MyInterface a) {
		a.myMethod();
	}
}