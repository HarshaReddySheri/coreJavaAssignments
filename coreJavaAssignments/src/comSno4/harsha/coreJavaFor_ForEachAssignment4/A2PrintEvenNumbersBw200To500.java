package comSno4.harsha.coreJavaFor_ForEachAssignment4;

import java.util.Scanner;

public class A2PrintEvenNumbersBw200To500 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the startingNumber: ");
		int startingNumber = sc.nextInt();

		System.out.println("Please enter the endingNumber: ");
		int endingNumber = sc.nextInt();


		int number = startingNumber;


		while(number <= endingNumber) {
			boolean isPrime = true;

			if(number != 1 && number != 2) {
				int i = 2;
				while(i < number) {
					if(number%i == 0) {
						isPrime = false;
						break;
					}
					i++;
				}

			}
			else{
				isPrime = false;
			}

			if(isPrime){
				System.out.println(number);
			}
			number++;

		}
		sc.close();
	}
}
