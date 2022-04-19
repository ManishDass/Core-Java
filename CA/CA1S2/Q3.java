
/*
Q3: Write a program to calculate the row-wise and column wise sum of an array. The size of the
array and values of the array are to be taken at run time.
*/
import java.util.*;

public class Q3 {

    static void sumOfRow(int arr[][]) {
        int sum;
        System.out.println("");
        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = 0; j < arr.length; j++) {
                sum += arr[i][j];
            }
            System.out.println("Sum of Row " + i + ": " + sum);
        }
    }

    static void sumOfColumn(int arr[][]) {
        int sum;
        System.out.println("");
        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = 0; j < arr.length; j++) {
                sum += arr[j][i];
            }
            System.out.println("Sum of Column " + i + ": " + sum);
        }
    }

    static void printArray(int arr[][]) {
        System.out.println("\nArray is: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // scanner class object

        System.out.print("Enter Number of rows: ");
        int row = sc.nextInt(); //taking input from the user

        System.out.print("Enter Number of columns: ");
        int column = sc.nextInt(); //taking input from the user

        int [][] arr = new int[row][column];

        int elements;

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++)
            {
            elements = sc.nextInt(); //taking input from the user 
            arr[i][j] = elements;
            }
        }
        printArray(arr);
        sumOfRow(arr);
        sumOfColumn(arr);

        sc.close();
    }
}
