package SB101_V2.Sprint_4.Day2.Problem1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_Util {
    static Connection getConnection(){
        Connection connection=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String url="jdbc:mysql://localhost:3306/sb101_2";

        try {
            connection= DriverManager.getConnection(url,"root","12345678");
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return connection;
    }
}
