import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Swingtest extends JFrame implements ActionListener {
    JTextArea textbox1;
    JTextArea textbox2;
    JTextArea textbox3;
    JTextArea textbox4;
    JButton calbtn = new JButton("Print");

    JLabel string1 = new JLabel("");

    public Swingtest() {
        JPanel myPanel = new JPanel();
        add(myPanel);
        myPanel.setLayout(new GridLayout(6, 3));

        calbtn.addActionListener(this);
        textbox1 = new JTextArea("Basic Salary: ");
        textbox2 = new JTextArea("TA %: ");
        textbox3 = new JTextArea("DA %: ");
        textbox4 = new JTextArea("HRA %: ");

        myPanel.add(textbox1);
        myPanel.add(textbox2);
        myPanel.add(textbox3);
        myPanel.add(textbox4);

        myPanel.add(calbtn);

        myPanel.add(string1);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == calbtn) {
            String STRbasicSalary = textbox1.getText();
            String STRta = textbox2.getText();
            String STRda = textbox3.getText();
            String STRhra = textbox4.getText();

            float basicSalary = Float.parseFloat(STRbasicSalary), hra = Float.parseFloat(STRhra),
                    ta = Float.parseFloat(STRta), da = Float.parseFloat(STRda), netSalary = 0;
            // calculating TA, DA and HRA

            ta /= 100;
            hra /= 100;
            da /= 100;

            float TA, DA, HRA;

            TA = basicSalary * ta;
            DA = basicSalary * da;
            HRA = basicSalary * hra;
            // Calculating net salary by adding basicSalary, hra, da and deducting PF from
            // that
            netSalary = basicSalary + HRA + TA + DA;

            string1.setText("Net Salary: " + netSalary);

        }
    }

    public static void main(String args[]) {
        Swingtest g = new Swingtest();
        g.setLocation(10, 10);
        g.setSize(500, 500);
        g.setVisible(true);
    }
}
