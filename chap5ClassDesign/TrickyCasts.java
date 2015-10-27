package chap5ClassDesign;

interface Parent1 {}

interface Parent2 {}

public class TrickyCasts implements Parent1, Parent2 {
	public static void main(String... args) {
		Object a = new TrickyCasts();
		Parent1 b = (Parent1) a;
		Parent2 c = (Parent2) b;
	}
}