package comSno6.harsha.coreJavaArrayAssignment5;

import java.util.Arrays;
import java.util.Scanner;

public class A6ReverseTheArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the arrSize: ");
		int arrSize = sc.nextInt();
		int arr [] = new int [arrSize];
		
		System.out.println("Please enter the Array values: "); 
		for (int i = 0; i < arrSize; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Input: " + Arrays.toString(arr));
		
		int [] revArr = new int [arr.length];
		for (int i=0; i<arr.length; i++) {
			revArr[arr.length-i-1]= arr[i];
		}
		System.out.println("Input: " + Arrays.toString(revArr));
		sc.close();
	}
}
