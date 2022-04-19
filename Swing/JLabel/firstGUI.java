import java.io.*;
import javax.swing.*;

public class firstGUI {
    public static void main(String[] args) {

        JFrame frame = new JFrame(); // creating JFrame object
        JLabel test = new JLabel(); // creating JLabel object

        frame.setSize(400, 400);
        frame.setTitle("First Frame");

        test.setText("Manish Das Kindly Study");
        frame.add(test); // Adding test object into frame

        frame.setVisible(true); // finally we've to make it visible
    }
}
