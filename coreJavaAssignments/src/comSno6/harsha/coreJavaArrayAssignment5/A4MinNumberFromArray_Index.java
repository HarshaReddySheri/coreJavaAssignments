package comSno6.harsha.coreJavaArrayAssignment5;

import java.util.Arrays;
import java.util.Scanner;

public class A4MinNumberFromArray_Index
{
    public static void main(final String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the arraySize: ");
        int arrSize = sc.nextInt();
        
        int[] arr = new int[arrSize];
        System.out.println("Please enter the arrayValue: ");
        for (int i = 0; i < arrSize; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        
        int minNumber = arr[0];
        int minNumberIndex = 0;
        for (int j = 0; j < arr.length; j++) {
        	
            if (minNumber > arr[j]) {
                minNumber = arr[j];
                minNumberIndex = j;
            }
            
        }
        System.out.println(minNumber);
        System.out.println(minNumberIndex);
        sc.close();
    }
}
