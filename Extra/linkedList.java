import java.util.*;
class linkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // scanner class object
        LinkedList<String> ll = new LinkedList<String>();

        System.out.println( """
                1. Insert at front
                2. Insert at end
                3. Remove from front
                4. Remove from end
                5. Display
                6. Exit
                """ );

        while(true)
        {
        System.out.print("Choose Your Option: ");
        int a = sc.nextInt(); //taking input from the user
        sc.nextLine(); 
        if(a==1)
        {
            System.out.print("Enter Your Name: ");
            String name = sc.nextLine(); //taking input from the user
            ll.addFirst(name);
        }
        else if(a==2)
        {
            System.out.print("Enter Your Name: ");
            String name = sc.nextLine(); //taking input from the user
            ll.addLast(name);
        }
        else if(a==3)
        {
            ll.removeFirst();
        }
        else if(a==4)
        {
            ll.removeLast();
        }
        else if(a==5)
        {
            System.out.println(ll);
        }
        else if(a==6)
        {
            System.exit(1);
        }

        }
    }
}
