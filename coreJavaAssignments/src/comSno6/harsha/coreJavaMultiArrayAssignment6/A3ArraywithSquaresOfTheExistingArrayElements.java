package comSno6.harsha.coreJavaMultiArrayAssignment6;

import java.util.Arrays;

//import java.util.Scanner;

public class A3ArraywithSquaresOfTheExistingArrayElements {
	public static void main(String[] args) {
//		//Array-1
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Please enter the number of rows in array1: ");
//		int rowSize = sc.nextInt();
//		
//		int [][] arr = new int[rowSize][];
//		for (int i = 0; i < rowSize; i++) {
//			System.out.println("Please enter the column size in array1: " + i);
//			int colSize = sc.nextInt();
//			arr[i] = new int[colSize];
//			
//			System.out.println("Please enter the values for the row number: " + i);
//			for (int j = 0; j < colSize; j++) {
//				arr[i][j] = sc.nextInt();
//			}
//		}
//		
//		//ArrayInput
//		System.out.println("Input: ");
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(Arrays.toString(arr[i]));
//		}
		
		int [][] arr = new int[][] {
			{2,3,5},
			{0,1,3},
			{1,2,4},
		};
		
		
		int [][]OutputArr = new int [arr.length][];
		for (int i = 0; i < arr.length; i++) {
			OutputArr[i] = new int [arr[i].length]; 
			for (int j = 0; j < arr.length; j++) {
				OutputArr[i][j] = (int) Math.pow(arr [i][j], 2);
			}
		}
		
		//ArrayOuput
		System.out.println("Input1: ");
		for (int i = 0; i < OutputArr.length; i++) {
			System.out.println(Arrays.toString(OutputArr[i]));
		}
		
		//sc.close();
	}
		
}
