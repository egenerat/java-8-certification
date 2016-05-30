package ocp.chap3GenericsAndCollections.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

	static Comparator<Animal> comparatorByWeight = new Comparator<Animal>() {
		public int compare(Animal animal1, Animal animal2) {
			return animal1.getWeight() - animal2.getWeight();
		}
	};

	public static void main(String... args) {
		Animal cat = new Animal(10, 5);
		Animal dog = new Animal(5, 20);
		Animal bird = new Animal(8, 1);

		ArrayList<Animal> list = new ArrayList<>();
		list.add(cat);
		list.add(dog);
		list.add(bird);

		// Sort Comparable-way
		System.out.println(list);
		// [Animal: 10 year old., Animal: 5 year old., Animal: 8 year old.]

		Collections.sort(list); // sorts the list since it is mutable!
		System.out.println(list);
		// [Animal: 5 year old., Animal: 8 year old., Animal: 10 year old.]

		Collections.sort(list, comparatorByWeight);
		System.out.println(list);

		Collections.sort(list, (animal1, animal2) -> animal1.getWeight() - animal2.getWeight());
		System.out.println(list);

		// Using method references
		// TODO
	}
}