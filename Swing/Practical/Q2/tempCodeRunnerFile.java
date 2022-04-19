import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Swingtest extends JFrame implements ActionListener {
    JTextArea txtdata;
    JButton calbtn = new JButton("Calculate");

    JLabel Vowels = new JLabel("Vowels: "), Consonants = new JLabel("Consonants: "), Digits = new JLabel("Digits: "),
            Whitespaces = new JLabel("White Spaces: ");

    JLabel test = new JLabel("Test:");

    public Swingtest() {
        JPanel myPanel = new JPanel();
        add(myPanel);
        myPanel.setLayout(new GridLayout(7, 2));
        myPanel.add(calbtn);

        calbtn.addActionListener(this);
        txtdata = new JTextArea("Type Here");
        txtdata.setFont(new Font("Verdana", Font.PLAIN, 18));

        myPanel.add(txtdata);
        myPanel.add(Vowels);
        myPanel.add(Consonants);
        myPanel.add(Digits);
        myPanel.add(Whitespaces);

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == calbtn) {
            String data = txtdata.getText();

            String line = data;
            int vowels = 0, consonants = 0, digits = 0, spaces = 0;

            line = line.toLowerCase();
            for (int i = 0; i < line.length(); ++i) {
                char ch = line.charAt(i);

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    ++vowels;
                } else if ((ch >= 'a' && ch <= 'z')) {
                    ++consonants;
                }

                else if (ch >= '0' && ch <= '9') {
                    ++digits;
                }

                else if (ch == ' ') {
                    ++spaces;
                }
            }

            Vowels.setText("Vowels: " + Integer.toString(vowels));
            Consonants.setText("Consonants: " + Integer.toString(consonants));
            Digits.setText("Digits: " + Integer.toString(digits));
            Whitespaces.setText("White spaces: " + Integer.toString(spaces));

            calbtn.setBackground(Color.RED);

            Vowels.setFont(new Font("Verdana", Font.PLAIN, 18));
            Consonants.setFont(new Font("Verdana", Font.PLAIN, 18));
            Digits.setFont(new Font("Verdana", Font.PLAIN, 18));
            Whitespaces.setFont(new Font("Verdana", Font.PLAIN, 18));
        }
    }

    public static void main(String args[]) {
        Swingtest g = new Swingtest();
        g.setLocation(10, 10);
        g.setSize(600, 500);
        g.setVisible(true);
    }
}
