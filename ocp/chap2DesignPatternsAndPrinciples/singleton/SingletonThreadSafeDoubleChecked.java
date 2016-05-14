package ocp.chap2DesignPatternsAndPrinciples.singleton;

public class SingletonThreadSafeDoubleChecked {

	private int value = 0;

	private SingletonThreadSafeDoubleChecked() {}

	private static SingletonThreadSafeDoubleChecked instance;

	// add synchronized on the getter
	public static synchronized SingletonThreadSafeDoubleChecked getInstance() {
		if(instance == null) {
			instance = new SingletonThreadSafeDoubleChecked();
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
