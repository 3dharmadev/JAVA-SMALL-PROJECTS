package SB_101.sprint_4.day_1.JDBC.DAO;


import SB_101.sprint_4.day_1.JDBC.Model.Department_Bean;
import SB_101.sprint_4.day_1.JDBC.Model.Employee_Bean;
import SB_101.sprint_4.day_1.JDBC.Exception_.Department_Exception;
import SB_101.sprint_4.day_1.JDBC.Exception_.Employee_Eception;

import java.util.List;

public interface Employee_I {
 
	public String Add_Department(int did,String dname,String location) throws Department_Exception;

	public String Add_Employee_WithoutDeptId(Employee_Bean emp) throws Employee_Eception;

	public String updateDeptIdWithEmployeeId(int empId,int deptId) throws Employee_Eception;
	
	public Employee_Bean Employee_Login(String email,String password) throws Employee_Eception;
	
	public String Delete_Department(int did) throws Department_Exception;
	
	public List<Department_Bean> All_Department_Details() throws Department_Exception;
	
	public String Update_Emp_Password(int empId,String password) throws Employee_Eception;
	
	public String Update_Depart_Location(String new_location, int did) throws Employee_Eception;
	
	
}

/*Department:
did: int primary key auto_increment
dname: varchar(12) not null
location: varchar(12) not null

Employee:
empId: int primary key auto_increment
ename: varchar(12) not null
address: varchar(12)
email: varchar(20) not null unique
password: varchar(12)
salary: int
deptId: int on delete set null
 * ● Establish one-to-many relationships between the Department and Employee table.
● Write a JDBC application using DAO pattern to implement following functionalities:
○ Add a new Department
○ Register an Employee without deptId
○ Assign a registered Employee to an existing department.
○ Login an Employee and display his profile with a Welcome message.
○ Get All the Department details.
○ Update the Department location
○ Update the existing employee password.
○ Delete a department by did,
■ Note: If a Department is deleted then all the assigned employees deptId should be set to Null for
    that Department.*/
 