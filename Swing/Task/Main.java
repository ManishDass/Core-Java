import javax.swing.*;
import java.awt.*;

class Frame extends JFrame {
    public Frame() {
        setTitle("My Frame 1");
        setBounds(325, 58, 500, 600);

        getContentPane().setBackground(Color.LIGHT_GRAY);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 500, 70);
        panel.setBackground(Color.RED);
        add(panel);

        JLabel GSTtext = new JLabel("GST Calculator");
        GSTtext.setBounds(0, 0, 100, 40);
        panel.add(GSTtext);

        JLabel Item = new JLabel("Items");
        Item.setBounds(40, 80, 100, 40);
        add(Item);

        JTextField text1 = new JTextField();
        text1.setBounds(40, 120, 100, 20);
        add(text1);

        JLabel Qty = new JLabel("Qty.");
        Qty.setBounds(180, 80, 100, 40);
        add(Qty);

        JTextField text2 = new JTextField();
        text2.setBounds(180, 120, 100, 20);
        add(text2);

        JLabel Price = new JLabel("Price");
        Price.setBounds(300, 80, 100, 40);
        add(Price);

        JTextField text3 = new JTextField();
        text3.setBounds(300, 120, 100, 20);
        add(text3);

        JTextField text4 = new JTextField();
        text4.setBounds(40, 150, 100, 20);
        add(text4);

        JTextField text5 = new JTextField();
        text5.setBounds(180, 150, 100, 20);
        add(text5);

        JTextField text6 = new JTextField();
        text6.setBounds(300, 150, 100, 20);
        add(text6);

        JLabel Total = new JLabel("Total : ");
        Total.setBounds(180, 170, 100, 40);
        add(Total);

        JTextField totalAmt = new JTextField();
        totalAmt.setBounds(300, 180, 100, 20);
        add(totalAmt);

        JLabel GST5 = new JLabel("GST 5%");
        GST5.setBounds(40, 200, 100, 40);
        add(GST5);

        JLabel CGST2 = new JLabel("CGST 2.5%");
        CGST2.setBounds(40, 240, 100, 40);
        add(CGST2);

        JLabel SGST2 = new JLabel("SGST 2.5%");
        SGST2.setBounds(40, 280, 100, 40);
        add(SGST2);

        JTextField CGST = new JTextField();
        CGST.setBounds(300, 240, 100, 20);
        add(CGST);

        JTextField SGST = new JTextField();
        SGST.setBounds(300, 280, 100, 20);
        add(SGST);

        JButton btn = new JButton("Click Here");
        btn.setBounds(40, 330, 100, 40);
        add(btn);

        JPanel FinalPanel = new JPanel();
        FinalPanel.setBounds(60, 380, 300, 150);
        FinalPanel.setBackground(Color.GREEN);
        add(FinalPanel);

        JLabel FinalText = new JLabel("Your gross price will be");
        FinalText.setBounds(60, 50, 200, 40);
        FinalPanel.add(FinalText);

        // JLabel FinalAmt = new JLabel("Result");
        // FinalAmt.setBounds(30,60,200,40);
        // FinalPanel.add(FinalAmt);

        setResizable(false);
        setLayout(null);
        setVisible(true);
    }
}

class Main {
    public static void main(String args[]) {
        Frame fr = new Frame();
    }

}