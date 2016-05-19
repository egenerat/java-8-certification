package ocp.chap3GenericsAndCollections.generics;

import java.util.*;

public class LowerBoundedMethod {

	static class Animal {}
	static class Cat extends Animal {}

	public static void main(String... args) {
		method(new ArrayList<Animal>());
		// method(new ArrayList<Cat>()); Does not compile
		method(new ArrayList<Object>());
	}

	public static void method(List<? super Animal> list) {

	}
}