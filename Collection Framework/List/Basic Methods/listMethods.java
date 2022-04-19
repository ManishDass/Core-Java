import java.util.ArrayList;

public class listMethods {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("One");
        list1.add("Two");
        list1.add("Four");

        list1.add(2, "Three");

        System.out.println("Element at index 2: " + list1.get(2));
        System.out.println("Size of List: " + list1.size());
        System.out.println("Does it contains some elements: " + list1.isEmpty());
        System.out.println("Index of String \"Three\": " + list1.indexOf("Three"));

    }
}
