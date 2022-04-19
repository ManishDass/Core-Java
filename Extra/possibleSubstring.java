package Extra;
import java.util.*;
class possibleSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // scanner class object
        System.out.print("Enter a string: ");
        String str = sc.nextLine(); //taking input from the user

        for(int i =0;i<=str.length();i++)
        {
            for(int j=i+1;j<=str.length();j++)
            {
                System.out.println(str.substring(i,j));
            }
        }
    }
}