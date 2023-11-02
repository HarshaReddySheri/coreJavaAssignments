package comSno7.harsha.coreJavaStringAssignment7;

import java.util.Scanner;

public class AB13GiventheFirstNameandLastNamePrintTheLastNameFirstThenFollowedByCommaAndFirstCharacterOfTheFirstName {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the first input String: ");
		String input1 = sc.nextLine();
		System.out.println("Please enter the second input String: ");
		String input2 = sc.nextLine();
		
		System.out.println("Input1: " + input1);
		System.out.println("Input2: " + input2);
		
		String output = input2 + "," +input1.charAt(0);
		System.out.println("Output: " + output);
		sc.close();
	}
}
