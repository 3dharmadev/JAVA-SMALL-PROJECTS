package com.maven.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.maven.DB_Util.DB_Connect;
import com.maven.exception.EmployeeException;
import com.maven.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public String registerEmployee(Employee employee) throws EmployeeException {
          String message="user exists...";
//          private int Id;
//      	private String name;
//      	private int age;
//      	private String mobileNo;
//      	private String Address;
		try(Connection conn=DB_Connect.getConnection()){
			     PreparedStatement ps=  conn.prepareStatement("INSERT INTO EMPLOYEE VALUES(?,?,?,?,?)");
			        ps.setInt(1,employee.getId());
			        ps.setString(2, employee.getName());
			        ps.setInt(3, employee.getAge());
			        ps.setString(4, employee.getMobileNo());
			        ps.setString(5, employee.getAddress());
			        
			        int res=ps.executeUpdate();
			        if(res>0)message="Inserted successfully..";
			        else throw new EmployeeException("Employee exist with this username");
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
			throw new EmployeeException("wrong id");
		}
        return message;
	}

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
		Employee employee=new Employee();
		         try(Connection conn=DB_Connect.getConnection()){
		        	PreparedStatement ps= conn.prepareStatement("SELECT * FROM EMPLOYEE WHERE Id=?");
		        	
		        	 ps.setInt(1,empId);
		        	 
		        	 ResultSet rs=ps.executeQuery();
		        	 
		        	 if(rs.next()) {
		        		 employee.setId(rs.getInt("id"));
		        		 employee.setAge(rs.getInt("age"));
		        		 employee.setAddress(rs.getString("address"));
		        		 employee.setMobileNo(rs.getString("mobilenum"));
		        		 employee.setName(rs.getString("name"));
		        	 }
		        	 else throw new EmployeeException("wrong empid");
		         }
		         catch(SQLException e) {
		        	 System.out.println(e.getMessage());
		         }
		         
		         
		         return employee;
		         
	}

}
