package offTopicExam;

import java.util.*;

public class ForEachNullInList{
	public static void main(String... args){
		ArrayList<String> aList = new ArrayList<>();
		aList.add(null);
		for(String i : aList){
			System.out.println(i);
		}

		ArrayList<Integer> aList2 = new ArrayList<>();
		aList2.add(new Integer(1));
		aList2.add(Integer.parseInt("2"));
		aList2.add(3);
		aList2.add(null);
		for(int i : aList2){
			System.out.println(i);
		}
	}
}