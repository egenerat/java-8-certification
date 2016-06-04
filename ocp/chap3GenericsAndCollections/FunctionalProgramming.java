package ocp.chap3GenericsAndCollections;

import java.util.List;
import java.util.ArrayList;

public class FunctionalProgramming {
	public static void main(String... args) {
		List<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");

		list.forEach(System.out::println);
		list.removeIf(s -> s.startsWith("a"));
		list.forEach(System.out::println);
	}
}
