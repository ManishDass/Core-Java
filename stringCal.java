import java.util.*;

class stringCal {

    // methods for finding the total no. of characters
    static int lengthOfString(String str) {
        return str.length();
    }

    // methods which will finds the position of substring inside an string
    static char characterAtGivenIndex(String str, int index) {
        return str.charAt(index);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // scanner class object

        while(true)
        {
        System.out.println("""
        \nChoose which operation you want to perform
        1. Length of String
        2. Character at given index
        3. Substring
        4. Concat of two string
        5. Index of
        6. Convert to Lower Case
        7. Convert to Upper Case
        8. Compare To
        9. Check if string are equals
        10. Check if string are equals without case sensitivity
        11. Trim
        12. Exit
        """);

        int choice = sc.nextInt(); //taking input from the user
        sc.nextLine();
        System.out.print("\nEnter a string: ");
        String inputStr = sc.nextLine();


        if(choice == 1)
        {
            int length = lengthOfString(inputStr);
            System.out.println("\nLength of string: " + length);
        }
        else if(choice == 2)
        {
            System.out.print("\nEnter a index value: ");
            int index = sc.nextInt();
            char alphabet = characterAtGivenIndex(inputStr, index); 
            System.out.println("\nCharacter at index " + index + " is: " + alphabet);
        }
        else if(choice == 3)
        {
            System.out.print("\nEnter a starting index value: ");
            int index = sc.nextInt();
            System.out.println("Substring starting from index " + index +" is: " +inputStr.substring(index));
        }
        else if(choice == 4)
        {
            System.out.print("\nEnter 2nd string: ");
            String inputStr2 = sc.nextLine();
            System.out.println(inputStr.concat(inputStr2));
        }
        else if(choice == 5)
        {
            System.out.print("\nEnter Substring of string1: ");
            String inputStr2 = sc.nextLine();
            System.out.println(inputStr.indexOf(inputStr2)); 
        }
        else if(choice == 6)
        {
            System.out.print(inputStr.toLowerCase());  
        }
        else if(choice == 7)
        {
            System.out.print(inputStr.toUpperCase());   
        }
        else if(choice == 8)
        {
            System.out.print("\nEnter Substring of string1: ");
            String inputStr2 = sc.nextLine();
            System.out.println(inputStr.compareTo(inputStr2));
        }
        else if(choice == 9)
        {
            System.out.print("\nEnter String 2: ");
            String inputStr2 = sc.nextLine();
            if(inputStr.equals(inputStr2))
            {
                System.out.println("\nStrings are equals");
            } 
            else
            {
                System.out.println("\nStrings are not equals"); 
            }
        }
        else if(choice == 10)
        {
            System.out.print("\nEnter Substring of string1: ");
            String inputStr2 = sc.nextLine(); 
            if(inputStr.equalsIgnoreCase(inputStr2))
            {
                System.out.println("\nStrings are equals");
            } 
            else
            {
                System.out.println("\nStrings are not equals"); 
            }
        }
        else if(choice == 11)
        {
            System.out.println(inputStr.trim());
        }
        else if(choice == 12)
        {
            System.out.print("Successfully Exited");
            System.exit(0); 
        }
        else
        {
            System.out.print("\nChoose a valid option");
        }

        }


    }
}


