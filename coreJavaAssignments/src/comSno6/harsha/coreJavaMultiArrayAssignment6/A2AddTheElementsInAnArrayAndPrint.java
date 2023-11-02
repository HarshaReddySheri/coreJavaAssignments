package comSno6.harsha.coreJavaMultiArrayAssignment6;

import java.util.Arrays;
//import java.util.Scanner;

public class A2AddTheElementsInAnArrayAndPrint {
	public static void main(String[] args) {
		/*
		 * //Array-1 Scanner sc = new Scanner(System.in);
		 * System.out.println("Please enter the number of rows in array1: ");
		 * int rowSize1 = sc.nextInt();
		 * 
		 * int [][] arr1 = new int[rowSize1][];
		 * for (int i = 0; i < rowSize1; i++) {
		 * System.out.println("Please enter the column size in array1: " + i); 
		 * int colSize1 = sc.nextInt(); 
		 * arr1[i] = new int[colSize1];
		 * 
		 * System.out.println("Please enter the values for the row number: " + i); 
		 * for(int j = 0; j < colSize1; j++){
		 *  arr1[i][j] = sc.nextInt(); 
		 *  } 
		 * }
		 * 
		 * //Array-2 System.out.println("Please enter the number of rows in array2: ");
		 * int rowSize2 = sc.nextInt();
		 * 
		 * int [][] arr2 = new int[rowSize2][];
		 * for (int i = 0; i < rowSize2; i++) {
		 * System.out.println("Please enter the column size in array2: ");
		 * int colSize2 = sc.nextInt(); 
		 * arr2[i] = new int[colSize2];
		 * 
		 * System.out.println("Please enter the values for the row number: " +i); 
		 * for(int j = 0; j < colSize2; j++) {
		 *  arr2[i][j] = sc.nextInt();
		 *  }
		 *}
		 * 
		 * 
		 * 
		 * 
		 * //ArrayInput1 System.out.println("Input1: "); 
		 * for (int i = 0; i < arr1.length; i++) {
		 *  System.out.println(Arrays.toString(arr1[i])); 
		 * }
		 * 
		 * //ArrayInput2 System.out.println("Input2: "); 
		 * for(int i = 0; i < arr2.length; i++) { 
		 * 	System.out.println(Arrays.toString(arr2[i])); 
		 * }
		 * 
		 */
		
		//Add the elements in an Array and print it in the console
		
		//Logic
		int [][]arr1 = new int[][] {
			{1, 2, 1},
			{9, 7, 2},
			{7, 6, 4},
		};
		
		int [][]arr2 = new int[][] {
			{2, 6, 8},
			{0, 1, 3},
			{1, 2, 4},
		};

		int [][] arr3= new int [arr1.length][];
		for (int i = 0; i < arr1.length; i++) {
			arr3[i] = new int [arr1[i].length];
			for (int j = 0; j < arr1[i].length; j++) {
				arr3[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		System.out.println("Output: ");
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(Arrays.toString(arr3[i]));
		}
		
		
		//sc.close();
	}
}
