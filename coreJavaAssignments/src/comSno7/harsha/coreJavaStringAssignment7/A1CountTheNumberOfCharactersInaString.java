package comSno7.harsha.coreJavaStringAssignment7;

import java.util.Scanner;

public class A1CountTheNumberOfCharactersInaString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the input String");
		String input = sc.nextLine();
		
		System.out.println("Input is: " + input);
		System.out.println("Input is: " + input.length());
		sc.close();
	}
}
