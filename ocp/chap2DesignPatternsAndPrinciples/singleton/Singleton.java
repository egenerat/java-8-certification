package ocp.chap2DesignPatternsAndPrinciples.singleton;

public class Singleton {

	private int value = 0;

	private Singleton() {}

	private static final Singleton instance = new Singleton();

	public static Singleton getInstance() {
		return instance;
	}

	public synchronized void increase() {
		value++;
	}

	public synchronized int getValue() {
		return value;
	}
}
