package comSno7.harsha.coreJavaStringAssignment7;

import java.util.Scanner;

public class A7ModifyTheStringIntheFollowingPattern_ChangeOddWordsToUpperCaseAndReverseTheEvenWords {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the input string: ");
		String input = sc.nextLine();
		System.out.println("Input: " + input );
		String []words = input.split(" ");
		String outputString = "";
		
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			if(i % 2 != 0) {
				outputString += word.toUpperCase();
			}
			else {
				outputString += getReverseString(word);
			}
			
			if(i != words.length-1)
				outputString += " ";
		}
		System.out.println("Output: " + outputString);
		
		sc.close();
	}
	private static String getReverseString(String inputString) {
		String reverseString = "";
		for (int j = inputString.length()-1; j>=0; j--) {
			reverseString += inputString.charAt(j);
		}
		return reverseString;
	}
}
