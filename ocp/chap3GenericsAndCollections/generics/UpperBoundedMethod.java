package ocp.chap3GenericsAndCollections.generics;

import java.util.*;

public class UpperBoundedMethod {

	static class Animal {}
	static class Cat extends Animal {}

	public static void main(String... args) {
		method(new ArrayList<Animal>());
		method(new ArrayList<Cat>());
		//method(new ArrayList<Object>()); // Does not compile!!!
	}

	public static void method(List<? extends Animal> list) {

	}
}