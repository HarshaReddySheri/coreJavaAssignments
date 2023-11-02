package comSno3.harsha.coreJavaWhile_DoWhileAssignment3;

import java.util.Scanner;

public class A4PrimeNumberBW50To150
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number to check the prime");
		int number = sc.nextInt();
		String check = "Prime";
		int i = 2;
		if (i < number) {
			if (number % i == 0) {
				check = "notAPrime";
			}
			++i;
		}
		System.out.println(check);
		sc.close();
	}
}
