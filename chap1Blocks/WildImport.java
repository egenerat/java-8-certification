package chap1Blocks;

import java.util.*;
import java.sql.*;

public class WildImport {
	public static void main(String... args) {
		ArrayList<String> stringList = new ArrayList<String>();
		// Test import conflict
		// Date truc;
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
			stringList.add(args[i]);
		}
		// Test variable out of scope
		// System.out.println(i);
	}
}