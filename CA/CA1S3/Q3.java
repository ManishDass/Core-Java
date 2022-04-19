/*
A bag seller purchases 100 bags every day. He purchases bags at Rs.60.25 and 
sells at Rs.90.00 each. He sells any unsold bag after 6 O’clock at a price of Rs. 70
each. Write a program to read the demand for the bags before 6 O’clock and 
evaluate his profit/loss on overall transaction using scanner class (assuming that 
all the bags are sold at the end of the day)
*/

import java.util.*;
public class Q3 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in); // scanner class object
            double bagCP = 60.25;
            int quantity = 100;

            System.out.print("Enter Bag Sold Before 6'0 Clock: ");
            int bagSold = sc.nextInt(); //taking input from the user

            int SP1 = bagSold * 90;
            int SP2 = (quantity - bagSold) * 70;
    
            int totalSP = SP1 + SP2;
            double totalCP = bagCP * 100;
            double profit = totalSP - totalCP; 
            double profitPercentage = (profit / totalCP) * 100;

            System.out.println("\nHe is having profit of Rs:" + (int)profit + " at the end of the day.");     
            System.out.println("His profit Percentage is: " + (int)profitPercentage + "%");      
            sc.close();
        }    
}
