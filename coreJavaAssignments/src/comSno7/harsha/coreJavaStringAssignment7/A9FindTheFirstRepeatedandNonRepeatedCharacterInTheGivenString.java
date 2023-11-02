package comSno7.harsha.coreJavaStringAssignment7;

import java.util.Scanner;

public class A9FindTheFirstRepeatedandNonRepeatedCharacterInTheGivenString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the input String: ");
		String input = sc.nextLine();
		System.out.println("Input: " + input);

		char firstRepeatedChar = ' ';
		char firstNonRepeatedChar = ' ';

		for (int i = 0; i < input.length(); i++) {
			char tempChar = input.charAt(i);

			if(tempChar != ' ') {
				if(input.indexOf(tempChar) == input.lastIndexOf(tempChar)) {
					if(firstNonRepeatedChar == ' ')
						firstNonRepeatedChar = tempChar;
				}	
				else if(firstRepeatedChar == ' ')
						firstRepeatedChar = tempChar;
				if(firstNonRepeatedChar != ' ' && firstRepeatedChar != ' ')
						break;
				
			}
		}
		System.out.println("Output: ");
		System.out.println("First Repeated char: " + firstRepeatedChar);
		System.out.println("First Non-Repeated char: " + firstNonRepeatedChar);
		sc.close();
	}
}
