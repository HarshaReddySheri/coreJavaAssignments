package comSno6.harsha.coreJavaMultiArrayAssignment6;

import java.util.Arrays;

//import java.util.Scanner;

public class A6InterchangTheValuesOfaArrayByTransposingTheIndexValues {

	public static void main(String[] args) {
//		//Array-1
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Please enter the number of rows in array1: ");
//		int rowSize1 = sc.nextInt();
//		
//		int [][] arr1 = new int[rowSize1][];
//		
//		for (int i = 0; i < rowSize1; i++) {
//			System.out.println("Please enter the column size in array1: " + i);
//			int colSize1 = sc.nextInt();
//			arr1[i] = new int[colSize1];
//			
//			System.out.println("Please enter the values for the row number: " + i);
//			for (int j = 0; j < colSize1; j++) {
//				arr1[i][j] = sc.nextInt();
//			}
//		}
//		
//		
//		//ArrayInput1
//		System.out.println("Input1: ");
//		for (int i = 0; i < arr1.length; i++) {
//			System.out.println(Arrays.toString(arr1[i]));
//		}
	

		int [][] arr = new int [][] {
			{1, 8, 4},
			{9, 7, 2},
			{7, 6, 4}
		};
		
		int[][] outputArr = new int [arr.length][];
		for (int i = 0; i < arr.length; i++) {
			outputArr[i] = new int [arr[i].length];
			for (int j = 0; j < arr[i].length; j++) {
				outputArr[i][j] = arr[j][i];
			}
		}
		
		System.out.println("Input: ");
		for (int i = 0; i < outputArr.length; i++) {
			System.out.println(Arrays.toString(outputArr[i]));
		}
//		sc.close();
		
	}

}
