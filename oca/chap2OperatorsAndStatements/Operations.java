package chap2OperatorsAndStatements;

public class Operations {

	public static void main(String[] args) {
		System.out.println(new Integer(1) == new Integer(1)); // false

		short x = 1, y = 2, z, a;
		z = (short) (x + y); // Cast otherwise does not compile (type promotion
								// from short with a binary operator)
		System.out.println(Integer.MAX_VALUE);

		a = (short) 1_921_222;
		System.out.println(a);

		char b = 'b';
		char c = 'c';
		// Not valid with double qutoes
		// char d = "d";

		// Not valid: a char (same for byte and short) is promoted to int before
		// used with a binary operator
		// char result = b + c;

		String b_string = "b";

		// Forbidden
		// String c_string = 'c';
		// System.out.println(b == b_string);
		System.out.println(b_string.equals(b));

		boolean bool = true;

		// Forbidden, there is no relation between 0 and false!
		// bool = (bool!=true);

		// Forbidden!!!
		// x = void_method();
		// Object an_object = void_method();

	}

	void void_method() {
	};
}