package package03_22_full_revisions;

class HidingOverloading{
	String value = "parentValue";
	static String childStaticString = "AAA";

	public static void main(String[] args){
		HidingOverloading aParentObject = new HidingOverloading();
		aParentObject.aMethod();
		
		Child aChildObject = new Child();
		aChildObject.aMethod();

		HidingOverloading.aStaticMethod();
		Child.aStaticMethod();

		HidingOverloading parentReferenceChildObject = new Child();
		parentReferenceChildObject.aStaticMethod(); // parent method is called
		parentReferenceChildObject.aMethod();

		parentReferenceChildObject.testHidden();
	}

	void aMethod(){
		System.out.println("parent: "+value);
	}

	void testHidden(){
		aStaticMethod();
	}

	static void aStaticMethod(){
		System.out.println("Parent static method "+childStaticString);
	}
}
	
class Child extends HidingOverloading{
	String value = "childValue";
	static String childStaticString = "BBB";

	// Override
	void aMethod(){
		System.out.println("child: "+value);	
	}


	static void aStaticMethod(){
		System.out.println("Child method hide parent"+childStaticString);
	}
}