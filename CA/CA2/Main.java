class firstCharacter {
    synchronized void printFirstCharacter(int n) {
        String str = "Welcome To Tutorials Point";
        char c[] = str.toCharArray();
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

    synchronized void printSecondCharacter() {
        String str = "Welcome To Tutorials Point";
        char c[] = str.toCharArray();
        System.out.println("The second character of each word: ");
        for (int i = 0; i < c.length; i++) {
            // Logic to implement first character of each word in a string
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
        m.printFirstCharacter(5); // calling the methods using class object
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

        firstCharacter obj1 = new firstCharacter();
        secondCharacter obj2 = new secondCharacter();

        // Creating thread class objects
        NewThread1 t1 = new NewThread1(obj1);
        NewThread2 t2 = new NewThread2(obj2);

        // start threads one by one
        synchronized (t1) {
            // use sleep() method to set obj in sleeping state for 0.5 seconds
            t1.sleep(0);
            t1.start();
        }

        synchronized (t2) {
            // use wait() method to set obj in waiting state for five seconds
            t2.wait(1000);
            t2.start();
        }
    }
}
