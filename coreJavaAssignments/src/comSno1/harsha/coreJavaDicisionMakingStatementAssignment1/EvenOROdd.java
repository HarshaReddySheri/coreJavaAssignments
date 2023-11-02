package comSno1.harsha.coreJavaDicisionMakingStatementAssignment1;

import java.util.Scanner;

public class EvenOROdd{
    public static void main(final String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = number.nextInt();
        if (num % 2 == 0) {
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
        number.close();
    }
}
