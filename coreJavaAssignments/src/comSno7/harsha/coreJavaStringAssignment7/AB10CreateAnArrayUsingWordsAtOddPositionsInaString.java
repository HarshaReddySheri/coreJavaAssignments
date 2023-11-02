package comSno7.harsha.coreJavaStringAssignment7;

import java.util.Arrays;
import java.util.Scanner;

public class AB10CreateAnArrayUsingWordsAtOddPositionsInaString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the input String");
		String input = sc.nextLine();
		String []words = input.split(" ");
		
		String [] outputArr = new String[words.length/2];
		int index = 0;
		for (int i = 0; i < words.length; i++) {
			if(i%2 != 0) {
				outputArr[index] = words[i];
				index++;
			}
		}
		System.out.println("Output: " + Arrays.toString(outputArr));
		sc.close();
	}
}
