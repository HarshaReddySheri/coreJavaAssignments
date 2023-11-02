package comSno7.harsha.coreJavaStringAssignment7;

import java.util.Scanner;

public class A6ReverseEachWordOfaGivenString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please ente the input string: ");
		String input = sc.nextLine();
		
		String [] words = input.split(" ");
		
		String outputString = "";
		
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
//			String reverseWord = "";
//			for (int j = word.length()-1; j>=0; j--) {
//				reverseWord += word.charAt(j);
			String reverseWord = getReverseString(word);
			if(i != words.length-1)
				outputString  += reverseWord + " ";
			
			else
				outputString += reverseWord;
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


