package ocp.chap2DesignPatternsAndPrinciples.singleton;

public class SingletonThreadSafe {

	private int value = 0;

	private SingletonThreadSafe() {}

	private static SingletonThreadSafe instance;

	// add synchronized on the getter
	public static synchronized SingletonThreadSafe getInstance() {
		if(instance == null) {
			instance = new SingletonThreadSafe();
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
