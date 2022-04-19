import java.util.*;
import java.sql.*;

class Main {
    Connection con;

    public void databaseConnect() {
        try {
            String url = "jdbc:mysql://127.0.0.1:3306/javapractice";
            String userName = "root";
            String password = "";
            con = DriverManager.getConnection(url, userName, password);
            if (con != null) {
                System.out.println("Connection Successfull");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.databaseConnect();
    }
}
