package chap3CoreJavaAPIs;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class ListCourse {
	public static void main(String... args) {

		List isValid = new ArrayList();
		isValid.add(123);
		for (Object i : isValid){
			System.out.println(i);
		}

		List<String> aList = new ArrayList<String>();
		aList.add("Hello");

		// If size is not correct, it is automatically increased
		String[] array = aList.toArray(new String[0]);
		Arrays.toString(array);
		System.out.println(array.length); // 1

		array = aList.toArray(new String[10]);
		System.out.println(array.length); // 10

		aList.add("World");
		Arrays.toString(array); // Hello + 9*null

		System.out.println("=================");

		String[] array2 = { "Hello", "world" };
		aList = Arrays.asList(array2);
		displayList(aList);
		array2[1] = "Emile !!!";
		displayList(aList);// Hello Emile!!!
		// Be careful, with asList, the changes in the array are reflected in
		// the list.
		// The reverse is not true!

		aList.set(0, "Bonjour");
		Arrays.toString(array2);
		displayList(aList);

		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		List<Integer> list2 = new ArrayList<>();
		list2.add(1);
		System.out.println(list1.equals(list2));

		// A list can not be passed as a varargs parameter directly
		methodWithVarargs(list1.toArray(new Integer[list1.size()]));
		methodWithVarargs(new Integer[] { 1 });

		//  incompatible types: ArrayList<Integer> cannot be converted to List<String>
		// List<String> aaa = new ArrayList<Integer>();
	}

	public static <T> void displayList(Iterable<T> anIterable) {
		for (T i : anIterable) {
			System.out.println(i);
		}
	}

	public static void methodWithVarargs(Integer... varArg) {
	}
}