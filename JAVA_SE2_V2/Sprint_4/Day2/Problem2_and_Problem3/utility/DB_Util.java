package SB101_V2.Sprint_4.Day2.Problem2_and_Problem3.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_Util {
    public static Connection getConnection(){
        Connection connection=null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/sb101_2","root","12345678");

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return  connection;

    }
}
