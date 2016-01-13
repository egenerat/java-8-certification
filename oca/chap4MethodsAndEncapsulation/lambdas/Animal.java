package chap4MethodsAndEncapsulation.lambdas;

public class Animal {
	private String name;
	private boolean canHop;
	private boolean canRun;

	public Animal(String name, boolean canHop, boolean canRun) {
		this.name = name;
		this.canHop = canHop;
		this.canRun = canRun;
	}

	public boolean canHop() {
		return canHop;
	}

	public boolean canRun() {
		return canRun;
	}

	public String getName() {
		return name;
	}
}