package comSno6.harsha.coreJavaArrayAssignment5;

import java.util.Arrays;
import java.util.Scanner;

public class A1SumOfIntegerArray
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please enter the array Size");
        int arrSize = scanner.nextInt();
        int[] arr = new int[arrSize];
        
        System.out.println("Please enter the array value");
        
        for (int i = 0; i < arrSize; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        
        
        int sum = 0;
        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
        }
        System.out.println(sum);
        scanner.close();
    }
}