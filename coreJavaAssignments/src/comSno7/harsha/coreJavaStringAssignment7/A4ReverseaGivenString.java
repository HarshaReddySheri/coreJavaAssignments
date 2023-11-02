package comSno7.harsha.coreJavaStringAssignment7;


import java.util.Scanner;

public class A4ReverseaGivenString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the Input String: ");
		String input = sc.nextLine();
		System.out.println("Input: " + input);
		
		String reverseString = new String();
		for (int i=input.length()-1 ; i >= 0 ; i--) {
			reverseString += input.charAt(i); 
		}
		System.out.println("Output: " + reverseString);
				
		sc.close();
	}
}
