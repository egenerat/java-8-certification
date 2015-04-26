package package03_22_full_revisions;

public class Main{
	public static void main(String[] args){
		Main foo = new Main(0);
		foo.test(null);
		int[] array1 = new int[]{1,2,3};
		foo.test(array1);
		int[] array2 = {1,2,3};
		foo.test(array2);
		//Does NOT compile
		//foo.test({1,2,3});

		System.out.println("animal".replace('a','A')); // outputs AnimAl: all occurences replaced

		int i = 0;
		if(i == 0){
			System.out.println("Pass in the first if");
		}
		else if (i == 0){
			// COMPILE (unreachable code not detected)
			System.out.println("Does not pass whereas the condition is true");
		}

		USELESS_LABEL: {
			System.out.println("Useless block");			
		}

		long aLongPrimitive = 14L;
		int anIntPrimitive = 14;
		foo.doubleTransformation(aLongPrimitive);
		// Does NOT compile (2 transformations required)
		//foo.doubleTransformation(anIntPrimitive);
		foo.doubleTransformation((long)anIntPrimitive);
	}

	public void test(int[] array){
	}

	public void doubleTransformation(Long l){

	}

	public Main(int a){

	}

	private class Child extends Main{
		// Does NOT compile without an explicit call to parent constructor
		private Child(){
			super(1);
		}
	}
}