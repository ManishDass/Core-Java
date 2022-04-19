//What way would you create a programwhich generate the threads:
//- To display 10 terms of Fibonacci series.
//- To display 1 to 10 in reverse order.

class Fibonacci {
    synchronized void printFibonacci(int x) {
        int n = x;
        int a = 0;
        int b = 1;

        System.out.print(a + " " + b);

        for (int i = 3; i <= n; i++) {
            int term = a + b;
            System.out.print(" " + term);
            a = b;
            b = term;
        }
    }
}

class ReverseNumber {
    synchronized void printReverseNumber() {

        int n = 10;
        int i = 1;
        System.out.println("\nPrinting Number in reverse");
        while (n >= i) {
            System.out.println(n);
            n--;
        }
        System.out.println("\n");

    }
}

// Thread 1
class NewThread1 extends Thread {

    Fibonacci m;

    NewThread1(Fibonacci m) {
        this.m = m;
    }

    public void run() {
        m.printFibonacci(10);
    }
}

// Thread 2
class NewThread2 extends Thread {

    ReverseNumber s;

    NewThread2(ReverseNumber s) {
        this.s = s;
    }

    public void run() {
        s.printReverseNumber();
    }
}

class Mythread {
    public static void main(String args[]) {

        Fibonacci obj1 = new Fibonacci();
        ReverseNumber obj2 = new ReverseNumber();

        NewThread1 t1 = new NewThread1(obj1);
        NewThread2 t2 = new NewThread2(obj2);

        t1.start();
        t2.start();
    }
}
