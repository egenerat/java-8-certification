package ocp.chap3GenericsAndCollections.generics;

import java.util.*;

public class UpperBoundedList {

	static class Animal {}
	static class Cat extends Animal {}

	public static void main(String... args) {
		// List<? extends Animal> animals = new ArrayList<>(); 
		List<? extends Animal> animals = new ArrayList<Animal>(); 
		//animals.add(new Object());
		//animals.add(new Animal()); Does not compile!
		// Not possible to add a Animal to a list of Cat

		//animals.add(new Cat()); Does not compile !
		// Not possible to add a Cat to a List of Animal
	}
}