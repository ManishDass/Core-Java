/*
Problem Statement: 
Suppose there is the string "Lovely Professional University" define some methods which 
will be use to perform 
a. finds the total no. of characters
b. finds the position of string University
c. extracts the string Lovely
d. replaces Lovely with lovely (first letter 'l' in small case)
e. changes all characters in the string in Upper case.
*/

import java.util.*;

class stringOperation{

    // methods for finding the total no. of characters
    static int noOfCharacters(String str) {

        int count = 0; // taking a counter variable to store the number of character

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') // if charAt at i-th index is not space then only count it as character
            {
                count++;
            }
        }
        return count;
    }

    // methods which will finds the position of substring inside an string
    static int positionOfString(String str, String substr) {

        int position = 0; // taking a position variable to store the index of required substring
        position = str.indexOf(substr); // using the indexOf method we can easily find the index of any character or substring
        return position;
    }

    // methods which will extracts the string Lovely
    static String extractTheString(String str) {

        String sub; // taking a sub variable which will return the extracted string
        sub = str.substring(0, 6);
        return sub;
    }

    // methods which replaces Lovely with lovely (first letter 'l' in small case)
    static String replaceTheString(String str) {

        String tempStr = str.replace('L', 'l'); //using the replace method we can easily replace a character in the string
        return tempStr;
    }

    // methods will changes all characters in the string in Upper case.
    static String convertToUpper(String str) {
        String tempStr; // tempStr will store modified string and also used for returning
        tempStr = str.toUpperCase();
        return tempStr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //creating scanner class object
        String str = "Lovely Professional University";
        int choice;
        
        System.out.print("""
        \n\nChoose your option which you want to perform in the below string
        \nString is :\"Lovely Professional University\" 
        \n1.Total number of characters
        2.Position of string \"University\"
        3.Extracts the string \"Lovely\"
        4.Replaces Lovely with lovely (first letter 'l' in small case)
        5.Convert all characters in the string in Upper case.
        6.Exit
        """);


        while(true)
        {
        System.out.print("\nChoose your option: ");
        choice = sc.nextInt(); //taking input from the user

        if(choice == 1)
        {
            System.out.println("No of characters are: " + noOfCharacters(str));
        }
        else if(choice == 2)
        {
            System.out.println("Position of string \"University\" is: " + positionOfString(str, "University"));
        }
        else if(choice == 3)
        {
            System.out.println("Extracted string is: " + extractTheString(str));
        }
        else if(choice == 4)
        {
            System.out.println("String after converting first 'L' into lowercase: " + replaceTheString(str));
        }
        else if(choice == 5)
        {      
            System.out.println("After converting all the character to Upper Case: " + convertToUpper(str));  
        }
        else if(choice == 6)
        {
            System.out.println("\nSuccessfully exited");
            sc.close(); //closing the scanner class object otherwise there will be a Resource leak warning 
            System.exit(0); //exit(0) : Generally used to indicate successful termination.
        }
        else
        {
            System.out.println("Please choose a valid option!");
        }
        }     
    }   
}






