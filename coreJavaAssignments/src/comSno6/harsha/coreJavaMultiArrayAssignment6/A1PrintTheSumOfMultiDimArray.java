package comSno6.harsha.coreJavaMultiArrayAssignment6;

import java.util.Arrays;
import java.util.Scanner;
//MultiDimArray @@@@@ ArraySize -> NumberOfRow's 
//				@@@@@ To Know the number of each row is S-Dim 
//				@@@@@ Each S-Dim array size --> then columnSize we get


public class A1PrintTheSumOfMultiDimArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the no of rows in array: ");
		int rowSize = sc.nextInt();
		//Array creation for RowSize
		int [][] arr = new int [rowSize][];
		
		for (int i = 0; i < rowSize; i++) {
			System.out.println("Please enter the column size in row number: " + i);
			int colSize = sc.nextInt();
			//Array creation for colSize
			arr[i] = new int [colSize];
			System.out.println("Please enter the values for the row number: " + i);
			for (int j = 0; j < colSize; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Input: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j]; 
			}
		}
		System.out.println("Output: " + sum);
		sc.close();
	}
}
