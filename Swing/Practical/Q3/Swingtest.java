import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Swingtest extends JFrame implements ActionListener {
    JTextArea textbox1;
    JTextArea textbox2;
    JTextArea textbox3;
    JButton calbtn = new JButton("Print");

    JLabel string1 = new JLabel("");

    public Swingtest() {
        JPanel myPanel = new JPanel();
        add(myPanel);
        myPanel.setLayout(new GridLayout(5, 3));

        calbtn.addActionListener(this);
        textbox1 = new JTextArea("String 1");
        textbox2 = new JTextArea("String 2");
        textbox3 = new JTextArea("String 3");

        myPanel.add(textbox1);
        myPanel.add(textbox2);
        myPanel.add(textbox3);

        myPanel.add(calbtn);

        myPanel.add(string1);
    }

    static void sort(String[] s, int n) {
        for (int i = 1; i < n; i++) {
            String temp = s[i];

            int j = i - 1;
            while (j >= 0 && temp.length() < s[j].length()) {
                s[j + 1] = s[j];
                j--;
            }
            s[j + 1] = temp;
        }
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == calbtn) {
            String data1 = textbox1.getText();
            String data2 = textbox2.getText();
            String data3 = textbox3.getText();

            String[] arr = { data1, data2, data3 };
            int n = arr.length;

            sort(arr, n);

            string1.setText(arr[0] + " " + arr[1] + " " + arr[2]);

        }
    }

    public static void main(String args[]) {
        Swingtest g = new Swingtest();
        g.setLocation(10, 10);
        g.setSize(500, 500);
        g.setVisible(true);
    }
}
