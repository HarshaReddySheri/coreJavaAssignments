package comSno6.harsha.coreJavaArrayAssignment5;

import java.util.Arrays;
import java.util.Scanner;

public class A5MinLengthWordFromArray_index {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the arrSize: ");
		int arrSize = sc.nextInt();
		String arr [] = new String[arrSize];
		
		System.out.println("Please enter the array values: ");
		for (int i = 0; i < arrSize; i++) {
			arr[i] = sc.next();
		}
		System.out.println("Input: " + Arrays.toString(arr));
		
		String minLengthWord = arr[0];
		int minLengthWordIndex = 0;
		
		for (int j = 0; j < arr.length; j++) {
			if(arr[j].length()< minLengthWord.length()){
				minLengthWord = arr[j];
				minLengthWordIndex = j;
			}
		}
		System.out.println("minLengthWord is: " + minLengthWord);
		System.out.println("minLengthWordIndex is: " + minLengthWordIndex);
		sc.close();
	}
}
