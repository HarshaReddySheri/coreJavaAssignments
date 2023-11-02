package comSno6.harsha.coreJavaArrayAssignment5;

import java.util.Arrays;
import java.util.Scanner;

public class A4MaxNumberFromArray_Index
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
        
        int maxNumber = arr[0];
        int maxNumberIndex = 0;
        for (int j = 0; j < arr.length; j++) {
        	
            if (maxNumber < arr[j]) {
                maxNumber = arr[j];
                maxNumberIndex = j;
            }
            
        }
        System.out.println("MaxNumber is:" + maxNumber);
        System.out.println("MaxNumber Index:" + maxNumberIndex);
        sc.close();
    }
}
