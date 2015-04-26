package chap2OperatorsAndStatements;

public class Operations{

	public static void main(String[] args){
		System.out.println(new Integer(1) == new Integer(1)); // false

		short x = 1, y = 2, z, a;
		z = (short)(x + y); // Cast otherwise does not compile (type promotion from short with a binary operator)
		System.out.println(Integer.MAX_VALUE);

		a = (short)1_921_222;
		System.out.println(a);
	}
}