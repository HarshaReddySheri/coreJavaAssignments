package comSno6.harsha.coreJavaArrayAssignment5;

import java.util.Arrays;
import java.util.Scanner;

public class A3margeStringArray2
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the array1 size: ");
        int arrSize1 = scanner.nextInt();
        String[] arr1 = new String[arrSize1];
        System.out.println("Please enter the array1 value: ");
        for (int i = 0; i < arrSize1; ++i) {
            arr1[i] = scanner.next();
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println("Please enter the array2 size: ");
        int arrSize2 = scanner.nextInt();
        String[] arr2 = new String[arrSize2];
        System.out.println("Please enter the array2 value: ");
        for (int j = 0; j < arrSize2; ++j) {
            arr2[j] = scanner.next();
        }
        System.out.println(Arrays.toString(arr2));
        String[] arr3 = new String[arr1.length + arr2.length];
        for (int k = 0; k < arr1.length; ++k) {
            arr3[k] = arr1[k];
        }
        for (int k = 0; k < arr2.length; ++k) {
            arr3[k + arr1.length] = arr2[k];
        }
        System.out.println(Arrays.toString(arr3));
        scanner.close();
    }
}
