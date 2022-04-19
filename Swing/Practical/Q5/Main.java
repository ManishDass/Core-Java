import java.util.*;

class firstCharacter {

    String userString;

    // constructor
    firstCharacter(String data) {
        userString = data;
    }

    synchronized void printFirstCharacter() {

        char c[] = userString.toCharArray();
        System.out.println("The first character of each word: ");
        for (int i = 0; i < c.length; i++) {
            // Logic to implement first character of each word in a string
            if (c[i] != ' ' && (i == 0 || c[i - 1] == ' ')) {
                System.out.println(c[i]);
            }
        }
    }
}

class secondCharacter {

    String userString;

    // constructor
    secondCharacter(String data) {
        userString = data;
    }

    synchronized void printSecondCharacter() {

        char c[] = userString.toCharArray();
        System.out.println("The second character of each word: ");
        for (int i = 0; i < c.length; i++) {
            // Logic to implement second character of each word in a string
            if (c[i] != ' ' && (i == 0 || c[i - 1] == ' ')) {
                System.out.println(c[i + 1]);
            }
        }
    }
}

// Thread 1
class NewThread1 extends Thread {

    firstCharacter m;

    NewThread1(firstCharacter m) // passing object as a parameter
    {
        this.m = m;
    }

    public void run() {
        m.printFirstCharacter(); // calling the methods using class object
    }
}

// Thread 2
class NewThread2 extends Thread {

    secondCharacter n;

    NewThread2(secondCharacter n) // passing object as a parameter
    {
        this.n = n;
    }

    public void run() {
        n.printSecondCharacter(); // calling the methods using class object
    }
}

class Main {
    public static void main(String args[]) throws InterruptedException {

        Scanner sc = new Scanner(System.in); // scanner class object

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        firstCharacter obj1 = new firstCharacter(str);
        secondCharacter obj2 = new secondCharacter(str);

        // Creating thread class objects
        NewThread1 t1 = new NewThread1(obj1);
        NewThread2 t2 = new NewThread2(obj2);

        t1.start();

        synchronized (t2) {
            // use wait() method to set obj in waiting state for 1 seconds
            t2.wait(1000);
            t2.start();
        }
    }
}
