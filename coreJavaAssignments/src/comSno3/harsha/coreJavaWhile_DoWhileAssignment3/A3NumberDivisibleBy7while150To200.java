package comSno3.harsha.coreJavaWhile_DoWhileAssignment3;



import java.util.Scanner;

public class A3NumberDivisibleBy7while150To200
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the StartingNumber: ");
		int StartingNumber = scanner.nextInt();
		System.out.println("Please enter the EndingNumber: ");
		int EndingNumber = scanner.nextInt();
		int number = StartingNumber;
		while(number <= EndingNumber) {
			if(number%7 == 0) {
				System.out.println(number);
			}
			number++;
		}
		scanner.close();
	}
}