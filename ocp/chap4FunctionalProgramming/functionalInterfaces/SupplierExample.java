package ocp.chap4FunctionalProgramming.functionalInterfaces;

import java.util.ArrayList;
import java.util.function.Supplier;

public class SupplierExample {
	public static void main(String... args) {
		Supplier<String> s1 = String::new;
		Supplier<String> s2 = () -> new String();
		System.out.println(s1.get().length());
		System.out.println(s2.get().length());

		Supplier<ArrayList<String>> s3 = ArrayList<String>::new;
		ArrayList<String> list = s3.get();
		System.out.println(list);
	}
}

