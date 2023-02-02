package SB101_V2.Sprint_4.Day1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Q2 {
    public static Connection getConnection() {

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        Connection connection=null;

        String url="jdbc:mysql://localhost:3306/sb101_2";
        try {
             connection= DriverManager.getConnection(url,"root","12345678");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
      return connection;
    }
}
