package comSno7.harsha.coreJavaStringAssignment7;

import java.util.Scanner;

public class AB15VerifyWhetherTheGivenStringIsPalindromeOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the input String: ");
		String input = sc.nextLine();
		System.out.println("Input: " + input);
		
		String outputStr = "";
		if(getReverseString(input).equals(input))
			outputStr = "It is a palindrome";
		else
			outputStr = "It is not a palindrome";
		
		System.out.println("Output: " + outputStr);
		sc.close();
	}
	private static String getReverseString(String input) {
		String reverseString = "";
		for (int i = input.length()-1 ; i >=0 ; i--) {
			reverseString += input.charAt(i);
		}
		return reverseString;
	}
}
