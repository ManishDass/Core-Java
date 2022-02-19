/*
Problem Statement: 
Write a Java program that checks whether a given string is a palindrome or not. 
Ex: MADAM is a palindrome?
*/

package CA1;

import java.util.*;

class Q3 {

    // methods for checking whether string is palindrome or not if it is palindrome
    // return true else return false
    static boolean palindromeOrNot(String str) {

        if (str.length() > 0 && str.length() < 2) // if string length is greater than 0 and less than 2 then it is
                                                  // palindrome
        {
            return true;
        } else if (str.length() > 2) // if string length is greater than 2 then we need to do some operation
        {

            int i = 0, j = str.length() - 1;

            // While there are characters to compare
            while (i < j) {

                // If string is not matching then it is non palindrome
                if (str.charAt(i) != str.charAt(j)) {
                    return false;
                }

                i++; // incrementing the i value
                j--; // decrementing the j value
            }
        } else // if string length is less than 1 then string is empty
        {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // creating scanner class object
        String str; // string varibale

        char wantToContinue = 'Y';

        while (wantToContinue == 'Y' || wantToContinue == 'y') {

            System.out.print("\nEnter a string: ");
            str = sc.nextLine(); // taking input from the user

            if (palindromeOrNot(str.trim())) // removing whitespaces before passing string variable as a parameter
            {
                System.out.println("The string " + "\"" + str + "\"" + " is palindrome");
            } 
            else 
            {
                System.out.println("The string " + "\"" + str + "\"" + " is not palindrome!");
            }

            System.out.print("\nDo you want to continue? (Y/N) : ");
            wantToContinue = sc.next().charAt(0); // taking character input from the user
            sc.nextLine(); // It consumes the "\n" character otherwise compiler will skip to take string input from user
        }

        sc.close(); // closing the scanner class object
    }
}
