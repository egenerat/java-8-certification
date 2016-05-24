package ocp.chap3GenericsAndCollections.comparator;

public class Animal implements Comparable<Animal> {
	private int age;
	private int weight;

	public Animal(int age, int weight) {
		this.age = age;
		this.weight = weight;
	}

	public String toString() {
		return "Animal: " + age + " year old, " + weight + " kg.";
	}

	public int getWeight() {
		return weight;
	}

	public int compareTo(Animal otherAnimal) {
		return Integer.valueOf(age).compareTo(Integer.valueOf(otherAnimal.age));
	}
}