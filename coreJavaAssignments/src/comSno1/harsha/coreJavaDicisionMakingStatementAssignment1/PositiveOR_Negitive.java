package comSno1.harsha.coreJavaDicisionMakingStatementAssignment1;

import java.util.Scanner;

public class PositiveOR_Negitive
{
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("please enter a number: ");
        int num = number.nextInt();
        if (num > 0) {
            System.out.println("positive");
        }
        else if (num == 0) {
            System.out.println("zero");
        }
        else {
            System.out.println("negitive");
        }
        number.close();
    }
}
