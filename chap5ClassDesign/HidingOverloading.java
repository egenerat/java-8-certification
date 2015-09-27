package chap5ClassDesign;

class HidingOverloading {
	// String value = "parentValue";
	// static String childStaticString = "AAA";

	public static void main(String[] args) {
		// HidingOverloading aParent = new HidingOverloading();
		// aParent.testParent();

		Child aChildObject = new Child();
		aChildObject.testParent();
		aChildObject.testChild();
	}

	int getAge() {
		return 50;
	}

	static String getDescription() {
		return "Parent static method";
	}

	void testParent() {
		System.out.println(getAge() + getDescription());
	}
}

class Child extends HidingOverloading {
	// String value = "childValue";
	// static String childStaticString = "BBB";

	// Override
	int getAge() {
		return 25;
	}

	// Hide
	static String getDescription() {
		return "Hiding method";
	}

	void testChild() {
		System.out.println(getAge() + getDescription());
	}
}