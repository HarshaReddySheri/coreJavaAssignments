package comSno3.harsha.coreJavaWhile_DoWhileAssignment3;

import java.util.Scanner;

public class A1Print1TO100
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter the Starting Number");
		int startingNumber = sc.nextInt();
		
		System.out.println("Please Enter the Ending Number");
		int endingNumber = sc.nextInt();

		int num = startingNumber;
		while (num <= endingNumber) {
			System.out.println(num);
			num++;
		}
		sc.close();
	}
}
