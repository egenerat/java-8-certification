package chap3CoreJavaAPIs;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class ListCourse{
	public static void main(String... args){
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

		String[] array2 = {"Hello", "world"};
		aList = Arrays.asList(array2);
		displayList(aList);
		array2[1] = "Emile !!!";
		displayList(aList);// Hello Emile!!!
		// Be careful, with asList, the changes in the array are reflected in the list.
		// The reverse is not true!

		aList.set(0, "Bonjour");
		Arrays.toString(array2);
		displayList(aList);
	}
	public static void displayList(Iterable<String> anIterable){
		for(String i : anIterable){
			System.out.println(i);
		}
	}
}