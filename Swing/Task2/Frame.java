import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.sql.*;

class Frame extends JFrame implements ActionListener {

    JLabel TitleBar;
    JTextField text1, text2, text3;
    JButton btn1, btn2, btn3, btn4;
    JTextArea FinalPanel;
    String res, Name, Age, Email;

    String url = "jdbc:mysql://127.0.0.1:3306/javapractice";
    String userName = "root";
    String password = "";

    public Connection con = null;

    public Frame() {
        setTitle("GUI Application with Database");
        setBounds(325, 58, 670, 500);

        getContentPane().setBackground(new Color(15, 111, 198));

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 700, 70);
        panel.setBackground(Color.WHITE);
        add(panel);

        TitleBar = new JLabel("GUI Application with Database");
        TitleBar.setFont(new Font("Verdana", Font.BOLD, 20));
        TitleBar.setForeground(Color.RED);
        panel.add(TitleBar);

        text1 = new JTextField("Enter your Name");
        text1.setFont(new Font("Verdana", Font.PLAIN, 18));
        text1.setForeground(Color.RED);
        text1.setBounds(40, 120, 200, 40);
        text1.addActionListener(this);
        add(text1);

        text2 = new JTextField("Enter your Age");
        text2.setFont(new Font("Verdana", Font.PLAIN, 18));
        text2.setForeground(Color.RED);
        text2.setBounds(40, 175, 200, 40);
        text2.addActionListener(this);
        add(text2);

        text3 = new JTextField("Enter your Email Id");
        text3.setFont(new Font("Verdana", Font.PLAIN, 18));
        text3.setForeground(Color.RED);
        text3.setBounds(40, 230, 200, 40);
        text3.addActionListener(this);
        add(text3);

        btn1 = new JButton("Connect Database");
        btn1.setFont(new Font("Verdana", Font.PLAIN, 13));
        btn1.setForeground(Color.RED);
        btn1.setBackground(Color.GREEN);
        btn1.setBounds(20, 300, 150, 40);
        add(btn1);
        btn1.addActionListener(this);

        btn2 = new JButton("Create Table");
        btn2.setFont(new Font("Verdana", Font.PLAIN, 14));
        btn2.setForeground(Color.RED);
        btn2.setBackground(Color.GREEN);
        btn2.setBounds(180, 300, 150, 40);
        add(btn2);
        btn2.addActionListener(this);

        btn3 = new JButton("Insert Record");
        btn3.setFont(new Font("Verdana", Font.PLAIN, 14));
        btn3.setForeground(Color.RED);
        btn3.setBackground(Color.GREEN);
        btn3.setBounds(20, 355, 150, 40);
        add(btn3);
        btn3.addActionListener(this);

        btn4 = new JButton("View Records");
        btn4.setFont(new Font("Verdana", Font.PLAIN, 14));
        btn4.setForeground(Color.RED);
        btn4.setBackground(Color.GREEN);
        btn4.setBounds(180, 355, 150, 40);
        add(btn4);
        btn4.addActionListener(this);

        FinalPanel = new JTextArea();
        FinalPanel.setBounds(350, 120, 280, 275);
        FinalPanel.setFont(new Font("Verdana", Font.PLAIN, 12));
        FinalPanel.setBackground(new Color(181, 237, 253));
        // FinalPanel.add(new JLabel("test"));
        add(FinalPanel);

        setResizable(false);
        setLayout(null);
        setVisible(true);
    }

    public void databaseConnect() {
        try {
            con = DriverManager.getConnection(url, userName, password);
            if (con != null) {
                res = "Connection Successfull";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void displayData() {
        try {
            String QUERY = "SELECT * FROM studentdata";
            con = DriverManager.getConnection(url, userName, password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY);
            FinalPanel.setText("Name          " + " Age   " + "Email       " + "\n");
            if (con != null) {
                while (rs.next()) {

                    FinalPanel.append(
                            rs.getString("Name") + ",  " + rs.getInt("Age") + ",   " + rs.getString("EmailId") + "\n");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertData(String name, int age, String Email) {
        try {
            String QUERY = "INSERT INTO studentdata VALUES ('" + name + "'," + age + ", '" + Email + "')";
            con = DriverManager.getConnection(url, userName, password);
            Statement stmt = con.createStatement();
            stmt.executeUpdate(QUERY);

            if (con != null) {
                FinalPanel.setText("Inserted Data Successfully :)");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btn1) {
            databaseConnect();
            FinalPanel.setText(res);
        }
        if (e.getSource() == btn2) {
            FinalPanel.setText(res);
        }
        if (e.getSource() == btn3) {
            Name = text1.getText();
            Age = text2.getText();
            Email = text3.getText();
            insertData(Name, Integer.parseInt(Age), Email);
        }
        if (e.getSource() == btn4) {
            displayData();
        }
    }

    public static void main(String args[]) {
        Frame obj = new Frame();
    }
}