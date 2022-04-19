import java.util.*;

public class orderProduct {
    public static void main(String args[]) {

        ArrayList<Integer> productStock = new ArrayList<Integer>();// Creating arraylist

        productStock.add(100);
        productStock.add(200);
        productStock.add(170);
        productStock.add(220);
        // Printing the arraylist object
        System.out.println(productStock);

        Scanner sc = new Scanner(System.in); // scanner class object

        while (true) {
            System.out.println("""
                    \nChoose What You want to order
                    1.TV
                    2.Phone
                    3.Fridge
                    4.Air Conditioner
                    5.Exit
                    """);
            System.out.print("Choose Your Option: ");
            int choice = sc.nextInt(); // taking input from the user

            if (choice == 1) {
                System.out.print("Enter How many you want to order: ");
                int count = sc.nextInt(); // taking input from the user
                if(count > productStock.get(0))
                System.out.println("Sorry Order Quantity is out of limit ");
                else
                {
                System.out.println("Order Successfully Placed");
                System.out.println("Total Amount: " + count * 25000);
                }
            } else if (choice == 2) {
                System.out.print("Enter How many you want to order: ");
                int count = sc.nextInt(); // taking input from the user
                if(count > productStock.get(1))
                System.out.println("Sorry Order Quantity is out of limit ");
                else
                {
                System.out.println("Order Successfully Placed");
                System.out.println("Total Amount: " + count * 15000);
                }
            } else if (choice == 3) {
                System.out.print("Enter How many you want to order: ");
                int count = sc.nextInt(); // taking input from the user
                if(count > productStock.get(2))
                System.out.println("Sorry Order Quantity is out of limit ");
                else
                {
                System.out.println("Order Successfully Placed");
                System.out.println("Total Amount: " + count * 35000);
                }
            } else if (choice == 4) {
                System.out.print("Enter How many you want to order: ");
                int count = sc.nextInt(); // taking input from the user
                if(count > productStock.get(3))
                System.out.println("Sorry Order Quantity is out of limit ");
                else
                {
                System.out.println("Order Successfully Placed");
                System.out.println("Total Amount: " + count * 45000);
                }
            }
            else if (choice == 5) {
                System.exit(0);
            }
        }
    }
}