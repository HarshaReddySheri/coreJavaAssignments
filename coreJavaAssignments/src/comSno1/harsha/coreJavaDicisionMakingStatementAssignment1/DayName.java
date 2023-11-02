package comSno1.harsha.coreJavaDicisionMakingStatementAssignment1;

import java.util.Scanner;

public class DayName
{
    public static void main(String[] args) {
        final Scanner day = new Scanner(System.in);
        System.out.println("Please enter the day name: ");
        String dayName = day.next();
        if (dayName.equals("Monday") || dayName.equals("Tueday") || dayName.equals("Wedday") || dayName.equals("Thuday") || dayName.equals("Friday")) {
            System.out.println("Uff, it's a Weekday");
        }
        else if (dayName.equals("Satday") || dayName.equals("Sunday")) {
            System.out.println("Yayy, it's a Weekend");
        }
        day.close();
    }
}