package comSno7.harsha.coreJavaStringAssignment7;

import java.util.Scanner;

public class A2CountTheNumberOfWordsInaString2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the input String");
		String input = sc.nextLine();
		System.out.println("Input: " + input);
		
		String[] words = input.split(" ");
		
		System.out.println("Output: " + words.length);
		sc.close();
	}
}


