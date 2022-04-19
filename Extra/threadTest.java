class MultiplicationTable {
  synchronized void printMultiplicationTable(int n) {
    System.out.println("");
    int num = n, i = 1;
    while (i <= 10) {
      System.out.println(num + " * " + i + " = " + num * i);
      try {
        Thread.sleep(500);
      } catch (Exception e) {
      }
      i++;
    }
  }
}

class SumOfArrayElements {
  synchronized void sumOfArrayElements() {
    int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int n = 10;
    int sum = 0;
    int i = 0;

    while (i < n) {
      sum += arr[i];
      i++;
    }
    System.out.println("Sum of array is: " + sum);
  }
}

// Thread 1
class NewThread1 extends Thread {

  MultiplicationTable m;

  NewThread1(MultiplicationTable m) {
    this.m = m;
  }

  public void run() {
    m.printMultiplicationTable(5);
  }
}

// Thread 2
class NewThread2 extends Thread {

  SumOfArrayElements s;

  NewThread2(SumOfArrayElements s) {
    this.s = s;
  }

  public void run() {
    s.sumOfArrayElements();
  }
}

class threadTest {
  public static void main(String args[]) {

    MultiplicationTable obj1 = new MultiplicationTable();
    SumOfArrayElements obj2 = new SumOfArrayElements();

    NewThread1 t1 = new NewThread1(obj1);
    NewThread2 t2 = new NewThread2(obj2);

    t1.start();
    t2.start();
  }
}
