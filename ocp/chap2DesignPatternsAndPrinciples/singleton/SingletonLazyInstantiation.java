
package ocp.chap2DesignPatternsAndPrinciples.singleton;

public class SingletonLazyInstantiation {

	private int value = 0;

	private SingletonLazyInstantiation() {}

	// remove the final keyword
	private static SingletonLazyInstantiation instance;

	public static SingletonLazyInstantiation getInstance() {
		if (instance == null) {
			instance = new SingletonLazyInstantiation();
		}
		return instance;
	}

	public synchronized void increase() {
		value++;
	}

	public synchronized int getValue() {
		return value;
	}
}
