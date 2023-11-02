package comSno3.harsha.coreJavaWhile_DoWhileAssignment3;

import java.util.Scanner;

public class A5SumOfEvenNumber40TO80
{
	public static void main( String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the StartingNumber: ");
		int StartingNumber = scanner.nextInt();
		System.out.println("Please enter the EndingNumber: ");
		int EndingNumber = scanner.nextInt();
		
		int number = StartingNumber;
		int sum = 0;
		
		while (number <= EndingNumber) {
			if (number % 2 == 0) {
				sum += number;
			}
			number++;
		}
		System.out.println(sum);
		scanner.close();
	}
}