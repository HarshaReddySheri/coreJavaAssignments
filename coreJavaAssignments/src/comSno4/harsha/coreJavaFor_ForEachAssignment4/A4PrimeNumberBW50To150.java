package comSno4.harsha.coreJavaFor_ForEachAssignment4;

import java.util.Scanner;

public class A4PrimeNumberBW50To150{
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter the startingNumber: ");
			int startingNumber = sc.nextInt();

			System.out.println("Please enter the endingNumber: ");
			int endingNumber = sc.nextInt();


			int number;

			for ( number = startingNumber;  number <= endingNumber; number++) {
				boolean isPrime = true;
				if(number != 1 && number != 2) {
					for (int i = 2; i < number; i++) {
						if (number % i == 0) {
							isPrime = false;
							break;
						}
				
					}
				}
				
				else{
					isPrime = false;
				}

				if(isPrime){
					System.out.println(number);
				}
				
			}
			
		}
		
	}
	
}