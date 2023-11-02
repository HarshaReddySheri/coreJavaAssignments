package comSno4.harsha.coreJavaFor_ForEachAssignment4;

import java.util.Scanner;

public class A5SumOfEvenNumber40TO80
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the starting number");
		int startingNumber = sc.nextInt();
		System.out.println("please enter the ending number");
		int endingNumber = sc.nextInt();
		int sum = 0;
		for (int number = startingNumber; number <= endingNumber; ++number) {
			if (number % 2 == 0) {
				sum += number;
			}
		}
		System.out.println( sum);
		sc.close();
	}
}