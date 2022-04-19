import java.util.*;

public class linkedListMethods {
    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<Integer>();

        ll.addFirst(2);
        ll.addLast(5);
        System.out.println("Removed element:" + ll.poll());

        int z = ll.pop();

        System.out.println("Removed element l:" + z);

        for (int x : ll) {
            System.out.println(x);
        }
    }
}
