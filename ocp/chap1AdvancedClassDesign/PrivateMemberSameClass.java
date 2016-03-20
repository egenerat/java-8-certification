package ocp.chap1AdvancedClassDesign;

public class PrivateMemberSameClass {
	private int privateAttribute = 1; 

	@Override
	public boolean equals(Object anotherInstance) {
		if (!(anotherInstance instanceof PrivateMemberSameClass)) {
			return false;
		}
		PrivateMemberSameClass tmp = (PrivateMemberSameClass) anotherInstance;
		return this.privateAttribute == tmp.privateAttribute;
	}

	public static void main(String... args) {
		PrivateMemberSameClass a = new PrivateMemberSameClass();
		PrivateMemberSameClass b = new PrivateMemberSameClass();
		System.out.println(a.equals(b));
	}
}