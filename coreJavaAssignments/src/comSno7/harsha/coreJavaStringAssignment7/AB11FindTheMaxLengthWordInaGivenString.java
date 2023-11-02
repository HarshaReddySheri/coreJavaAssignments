package comSno7.harsha.coreJavaStringAssignment7;


import java.util.Scanner;

public class AB11FindTheMaxLengthWordInaGivenString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the input String");
		String input = sc.nextLine();
		System.out.println("Input: " + input);
		String [] words = input.split(" ");
		String maxLenWord = words[0];
		for (int i = 0; i < words.length; i++) {
			if(maxLenWord.length() < words[i].length())
				maxLenWord = words[i];
		}
		System.out.println("output: " + maxLenWord);
		sc.close();
	}
}
