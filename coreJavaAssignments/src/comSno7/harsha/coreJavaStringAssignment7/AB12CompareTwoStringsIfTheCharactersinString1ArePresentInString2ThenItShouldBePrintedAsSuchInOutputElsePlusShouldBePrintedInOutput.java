package comSno7.harsha.coreJavaStringAssignment7;

import java.util.Scanner;

public class AB12CompareTwoStringsIfTheCharactersinString1ArePresentInString2ThenItShouldBePrintedAsSuchInOutputElsePlusShouldBePrintedInOutput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the first input String: ");
		String input1 = sc.nextLine();
		System.out.println("Please enter the second input String: ");
		String input2 = sc.nextLine();
		
		System.out.println("Input1: " + input1);
		System.out.println("Input2: " + input2 );
		
		String output = "";
		for (int i = 0; i < input1.length(); i++) {
			char tempChar = input1.toLowerCase().charAt(i);
			
			if(input2.toLowerCase().indexOf(tempChar) >= 0)
				output += input1.charAt(i);
			
			else
				output += "+";
		}
		System.out.println("Output: " + output);
		sc.close();
	}
}
