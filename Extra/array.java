package Extra;
import java.util.*;

public class array {

        public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter size of array: ");
            int n = sc.nextInt();
            int arr[] = new int[n];

            for(int i=0;i<n;i++)
            {
                arr[i] = sc.nextInt();
            }  

            int min=arr[0], max=arr[0];

            System.out.println("Printing Array Elements: ");

            for(int i=0;i<n;i++)
            {
                System.out.print(arr[i] + " ");

                if(arr[i]>max)
                {
                    max = arr[i];
                }
                if(arr[i]<min)
                {
                    min = arr[i];
                }
            }

            System.out.println("\nMinimum elements: " + min);
            System.out.println("Maximum elements: " + max);
            

        }

}
