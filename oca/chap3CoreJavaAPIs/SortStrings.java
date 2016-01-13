package chap3CoreJavaAPIs;

import java.util.*;
import java.util.Arrays;

public class SortStrings{
	public static void main(String... args){
		// /!\ Uppercase letters before lowercase /!\
		// The output is B a c d
		List<String> list = Arrays.asList("a", "B", "d", "c");
		Collections.sort(list);
		String[] array = list.toArray(new String[4]);
		for (String string : array){
			System.out.print(string + " ");
		}
	}
}