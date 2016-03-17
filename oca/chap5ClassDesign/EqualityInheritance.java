package oca.chap5ClassDesign;

class Parent{}

class Child extends Parent {}

class NotRelatedClass{}

public class EqualityInheritance{
	public static void main(String... args){
		Parent b = new Child();
		Child a = new Child();
		NotRelatedClass c = new NotRelatedClass();
		if (a == b){
			System.out.println("==");
		}
		else{
			System.out.println("!=");
		}
		// Does not compile error: incomparable types: Child and NotRelatedClass
		//if (a == c){}
	}
}