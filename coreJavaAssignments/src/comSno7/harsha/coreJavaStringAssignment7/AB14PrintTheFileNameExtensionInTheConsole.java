package comSno7.harsha.coreJavaStringAssignment7;

import java.util.Scanner;

public class AB14PrintTheFileNameExtensionInTheConsole {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the input String");
		String input = sc.nextLine();
		
		System.out.println("Input: " + input);
		String outString = input.substring(input.lastIndexOf(".")+1, input.length());
		System.out.println("Output: " + outString);
		
		sc.close();
				
	}
}
