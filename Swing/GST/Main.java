import java.awt.*;
import javax.swing.*;

public class Main {
    Main() {
        JFrame f = new JFrame("GST Calculator");
        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 436, 543);
        panel.setBackground(Color.white);
        JButton b1 = new JButton("GST Calculator");
        b1.setBounds(0, 0, 436, 543);
        b1.setBackground(Color.blue);
        JButton b2 = new JButton("Your Gross Price will be");
        b2.setBounds(100, 100, 80, 30);
        b2.setBackground(Color.white);
        panel.add(b1);
        panel.add(b2);
        f.add(panel);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String args[]) {
        new Main();
    }
}