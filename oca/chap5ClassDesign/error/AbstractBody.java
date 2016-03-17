package oca.chap5ClassDesign.error;

public abstract class AbstractBody {
	// Does not compile: Orca implements a different signature
	//public abstract void dive() {};

	public static void main(String[] args) {
		AbstractBody whale = new Orca();
	}
}

class Orca extends AbstractBody {
	public void dive(int depth) {
		System.out.println("Orca diving");
	}
}