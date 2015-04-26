package chap3CoreJavaAPIs;

import java.util.Arrays;

public class ArraysCourse{
	public static void main(String[] args){
		// Valid declarations
		int[] array = {1,2,3};
		int[] array_bis = array;
		int[] array2 = new int[]{1,2,3};

		// Invalid declarations

		// size and content can't be declared at the same time
		// int[] array3 = new int[3]{1,2,3};

		// equals is not implemented for arrays. Reference equality, not content
		System.out.println(array.equals(array2)); // False
		System.out.println(array.equals(array_bis)); // True


		// Ugly display
		System.out.println(array);
		
		// Pretty display
		System.out.println(Arrays.toString(array));

		// length
		int[] array10 = new int[10];
		array10[0] = 1;
		System.out.println(array10.length); // returns 10, the allocated size


		// Two-dimension arrays

		// Valid
		int[][] matrix = new int[1][1];
		int[][] matrix1 = new int[1][];

		// possible to initialize in the same way as one-dimension array
		int[][] matrix2 = {{1},{1,2}};
		int[][] matrix3 = new int[][]{{1},{1,2}};

		// Invalid!
		//int[][] matrix10 = new int[][]; // array dimension missing
		// int[][] matrix11 = new int[1][]{{1},{1,2}}; // idem 1D array


		// compiles but give an ArrayOutOfBonds exception
		//matrix1[1][0] = 5;
	}
}