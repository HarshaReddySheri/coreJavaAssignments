package comSno2.harsha.coreJavaDicisionMakingStatementAssignment2;

import java.util.Scanner;

public class EvenOROddSwitchCase
{
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("Please enter the Number: ");
		int number = num.nextInt();
		int Remainder = number % 2;
		switch (Remainder) {
		case 0: {
			System.out.println("Given number is Even");
			break;
		}
		case 1: {
			System.out.println("Given number is Odd");
			break;
		}
		}
		num.close();
	}
}
