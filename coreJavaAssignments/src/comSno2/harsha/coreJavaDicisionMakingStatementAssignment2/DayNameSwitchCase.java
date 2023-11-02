package comSno2.harsha.coreJavaDicisionMakingStatementAssignment2;

import java.util.Scanner;

public class DayNameSwitchCase
{
	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.println("Please enter the day name : ");
		String dayName = number.next();

		switch (dayName) {
		case "Monday": 
		case "Tueday": 
		case "Wedday":
		case "Thuday": 
		case "Friday":
			System.out.println("Uff it's a Weekday");
			break;

		case "Satday": 
		case "Sunday":
			System.out.println("Yayy  it's a Weekend");
			break;

		default:
			System.err.println("dayName is Invald!!");
		}

		number.close();
	}


}




