package ocp.chap1AdvancedClassDesign;

public class PassByValue {
	class Pojo {
		String name;
 
		public Pojo(String name) {
			this.name = name;
		}
 
		public void changeName(String name) {
			this.name = name;
		}
	}
 
	public static void main (String[] args) {
		PassByValue a = new PassByValue();
		Pojo b = a.new Pojo("Emile");
		System.out.println(b.name);
		a.changeBooleanPojo(b, "Alexis");
		System.out.println(b.name); // Alexis 
		a.changeReference(b, "Paul");
		System.out.println(b.name); // Alexis
		// (pass by value, value = reference of the object, value has not changed)

		boolean aBoolean = true;
		System.out.println(aBoolean); // true
		a.changeBoolean(aBoolean);
		System.out.println(aBoolean); // true
	}
 
	public void changeBooleanPojo(Pojo truc, String newName) {
		truc.changeName(newName);
	}

	public void changeReference(Pojo truc, String newName) {
		truc = new Pojo(newName);
	}	

	public void changeBoolean(boolean truc) {
		truc = !truc;
	}
}