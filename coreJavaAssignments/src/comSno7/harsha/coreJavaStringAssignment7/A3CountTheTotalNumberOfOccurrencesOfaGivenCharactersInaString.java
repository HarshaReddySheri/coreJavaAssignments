package comSno7.harsha.coreJavaStringAssignment7;

//import java.util.Arrays;
import java.util.Scanner;

public class A3CountTheTotalNumberOfOccurrencesOfaGivenCharactersInaString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the input string: ");
		String input = sc.nextLine();
		
		System.err.println("Please enter the target character: ");
		char targetChar = sc.next().charAt(0);
		
		System.out.println("Input: " + input);
		System.out.println("Target Character: " + targetChar);
		
		char[] Characters = input.toCharArray();
		
		//System.out.println(Arrays.toString(Characters));
		int count = 0;
		for (int i = 0; i < Characters.length; i++) {
			if(Characters[i] == targetChar) {
				 count++;
			}
		}
		System.out.println("Output: " + count);
		sc.close();
	}
}
