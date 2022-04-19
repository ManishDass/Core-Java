/* 
Q2: Write a program of sorting an array. Declare single dimensional array and accept 5 decimal
values from the user. Then sort the input in descending order and display output
*/

import java.util.*;

public class Q2 {

    public static void reverse(float[] array) {

        int n = array.length;

        // Swaping the first half elements with last half
        // elements
        for (int i = 0; i < n / 2; i++) {
            float temp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // scanner class object

        float arr[] = new float[5];
        float a;

        System.out.println("Enter five float values: ");

        for (int i = 0; i < 5; i++) {
            a = sc.nextFloat(); // taking input from the user
            arr[i] = a;
        }

        Arrays.sort(arr);
        reverse(arr);
        System.out.println(Arrays.toString(arr));

        sc.close();
    }
}
