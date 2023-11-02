package comSno2.harsha.coreJavaDicisionMakingStatementAssignment2;

import java.util.Scanner;

public class ArthimaticOperationSwitchCase{
	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.println("please enter First number: ");
		int num1 = number.nextInt();
		System.out.println("Enter the Second Number: ");
		int num2 = number.nextInt();
		System.out.println("please enter the Operation: ");
		String Operation = number.next();
		int result = 0;

		switch (Operation) {
		case "%": 
			result = num1 % num2;
			break;
		
		case "*": 
			result = num1 * num2;
			break;
		
		case "+": 
			result = num1 + num2;
			break;
		
		case "-": 
			result = num1 - num2;
			break;
		
		case "/": 
			result = num1 / num2;
			break;
		
		default:
			System.err.println("Invalid Opertion!!");
			break;
		}
		System.out.println(result);
		number.close();
	}
}
