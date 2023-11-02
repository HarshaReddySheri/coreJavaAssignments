package comSno1.harsha.coreJavaDicisionMakingStatementAssignment1;

import java.util.Scanner;

public class GradingSystem
{
    public static void main(String[] args) {
        Scanner score = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int marks = score.nextInt();
        if (marks < 35) {
            System.out.println("student is failed");
        }
        else if (marks == 35) {
            System.out.println("student just passed");
        }
        else if (marks > 35 && marks < 75) {
            System.out.println("student secured third class");
        }
        else if (marks >= 75 && marks < 85) {
            System.out.println("student secured second class");
        }
        else {
            System.out.println("student secured first class");
        }
        score.close();
    }
}