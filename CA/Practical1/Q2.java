/*
Problem Statement: 
Create a class named 'Time' with data members (hours, mins, secs). Define methods in this 
class named 'hourConvertor', 'minConvertor' and 'secConvertor'. Calculate total hours, mins 
and secs for any integer value (in days).

For eg: 
Input : 2 (days)
output: total_hours:48
total_mins:2880 
total_secs:172800
*/
import java.util.*;

class Q2 {
    //private variables declared for Encapsulation purpose
    private int hours, mins, secs; 

    // get method to access private variable hours
    public int getHours()
    {
        return hours;
    }

    // get method to access private variable mins
    public int getMins()
    {
        return mins;
    }

    // get method to access private variable secs
    public int getSecs()
    {
        return secs;
    }

    // set method to access private variable hours
    public void setHours(int newHours)
    {
        hours = newHours;
    }

    // set method to access private variable mins
    public void setMins(int newMins)
    {
        mins = newMins;
    }

    // set method to access private variable secs
    public void setSecs(int newSecs)
    {
        secs = newSecs;
    }


    // methods for converting days into hour
    public void hourConvertor(int days) {
        setHours(days * 24);
    }

    // methods for converting days into minutes
    public void minConvertor(int days) {
      setMins((days * 24) * 60);
    }

    // methods for converting days into seconds
    public void secConvertor(int days) {
        setSecs(((days * 24) * 60) * 60);
    }


    public static void main(String[] args) {

        Time obj = new Time(); //creating a object for Time clas

        Scanner sc = new Scanner(System.in); // creating scanner class object
        int numberOfDays; // string varibale

        char wantToContinue = 'Y';
        
        while(wantToContinue == 'Y' || wantToContinue == 'y')
        {
        System.out.print("\nEnter number of days: ");
        numberOfDays = sc.nextInt(); // taking input from the user

        // setting values of the variables
        obj.hourConvertor(numberOfDays);
        obj.minConvertor(numberOfDays);
        obj.secConvertor(numberOfDays);

        // Displaying values of the variables
        System.out.println("\n" + numberOfDays + " Days == " + obj.getHours() + " Hours");
        System.out.println(numberOfDays + " Days == " + obj.getMins() + " Minutes");
        System.out.println(numberOfDays + " Days == " + obj.getSecs() + " Seconds");

        System.out.print("\nDo you want to continue? (Y/N) : ");
        wantToContinue = sc.next().charAt(0); // taking character input from the user
        }
        sc.close(); // closing the scanner class object otherwise there will be a Resource leak warning
    }   
}






