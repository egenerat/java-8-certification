package chap5ClassDesign.error;

public abstract class AbstractBody {
	public abstract void dive() {};

	public static void main(String[] args) {
		AbstractBody whale = new Orca();
		whale.dive();
	}
}

class Orca extends AbstractBody {
	public void dive(int depth) {
		System.out.println("Orca diving");
	}
}