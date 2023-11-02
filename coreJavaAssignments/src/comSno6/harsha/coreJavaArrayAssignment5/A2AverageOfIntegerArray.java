package comSno6.harsha.coreJavaArrayAssignment5;

import java.util.Arrays;
import java.util.Scanner;

public class A2AverageOfIntegerArray
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the array Size");
        int arrSize = sc.nextInt();
        
        int[] arr = new int[arrSize];
        System.out.println("Please enter the array value");

        for (int i = 0; i < arrSize; ++i) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        
        int sum = 0;
        for (int j = 0; j < arr.length; ++j) {
            sum += arr[j];
        }
        System.out.println(sum / arr.length);
        sc.close();
    }
}
