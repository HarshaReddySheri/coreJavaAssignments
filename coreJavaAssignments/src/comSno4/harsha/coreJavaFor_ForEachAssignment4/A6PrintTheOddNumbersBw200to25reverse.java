package comSno4.harsha.coreJavaFor_ForEachAssignment4;

import java.util.Scanner;

public class A6PrintTheOddNumbersBw200to25reverse
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the StartingNumber: ");
		int StartingNumber = scanner.nextInt();
		System.out.println("Please enter the EndingNumber: ");
		int EndingNumber = scanner.nextInt();
		
		for ( int number = StartingNumber; number <= EndingNumber; ++number) {
			if (number % 2 == 0) {
				System.out.print(number);
			}
		}
		scanner.close();
	}
}
