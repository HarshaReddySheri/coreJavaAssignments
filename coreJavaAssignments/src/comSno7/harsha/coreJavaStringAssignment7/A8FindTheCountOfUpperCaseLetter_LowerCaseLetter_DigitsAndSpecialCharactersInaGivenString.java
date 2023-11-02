package comSno7.harsha.coreJavaStringAssignment7;

import java.util.Scanner;

public class A8FindTheCountOfUpperCaseLetter_LowerCaseLetter_DigitsAndSpecialCharactersInaGivenString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the input String: ");
		String input = sc.nextLine();
		System.out.println("Input: " + input);
		
		int upperCaseLetterCount = 0;
		int lowerCaseLetterCount = 0;
		int digitsCount = 0;
		int specialCharacterCount = 0;
		
		char [] characters = input.toCharArray();
		for(char ch : characters) {
			if(Character.isUpperCase(ch))
				upperCaseLetterCount++;
			else if(Character.isLowerCase(ch))
				lowerCaseLetterCount++;
			else if(Character.isDigit(ch))
				digitsCount++;
			else
				specialCharacterCount++;
		}
		System.out.println("Output: ");
		System.out.println("Upper Case Letter Count: " + upperCaseLetterCount);
		System.out.println("Lower Case Letter Count: " + lowerCaseLetterCount);
		System.out.println("Digits Count: " + digitsCount);
		System.out.println("Special Character Count: " + specialCharacterCount);
		sc.close();
	}
}
