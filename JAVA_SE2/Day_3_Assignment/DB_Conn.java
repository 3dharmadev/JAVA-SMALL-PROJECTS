package SB_101.Day_3_Assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_Conn {


public static Connection Set_Connection() {
	Connection conn=null;
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {

		e.printStackTrace();
	}
	
	String url="jdbc:mysql://localhost:3306/day2_JDBC";
	
	
	
	try {
		conn= DriverManager.getConnection(url,"root","12345678");
	} catch (SQLException e) {

		e.printStackTrace();
	}
	
	
	
	
	return conn;
}

}
