package SB_101.sprint_4.day_1.JDBC.JDBC_Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_Conn {


public static Connection Set_Connection() {
	Connection conn=null;
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {

		e.printStackTrace();
	}
	
	String url="jdbc:mysql://localhost:3306/Eva4";
	
	
	
	try {
		conn= DriverManager.getConnection(url,"root","12345678");
		System.out.println(conn);
	} catch (SQLException e) {

		e.printStackTrace();
	}
	
	
	
	
	return conn;
}


}
