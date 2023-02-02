package SB_101.Day_3_Assignment;


import java.util.List;

public interface Employee3 {


	public List<Employee_Bean3> _all_Employee_Salary_Less_Than_80k();

	public Employee_Bean3 Search_Employee(int ID);
	
	public String Add_Employee_Without_Address(int ID,String name, int salary);
	
	public List<Employee_Bean3> All_Employee_Details();
	
	public String bounus_Add_500();
	
	public String GetSalary(int ID);
	
	
}

/*

create database db3;
 create table Employee3( eid int primary key ,
name varchar(15) ,
address varchar(15) ,
salary int );
 *Create DAO pattern and solve this question, Get input from user
using Scanner class and use Prepared Statement to do the
following :

● Develop a JDBC application to get the salary of a particular employee, whose Id is given
by the user.
● Develop a JDBC application to get all employee’s all details from the table
● Develop a JDBC application to provide the bonus to all the employees as 500/.
● Develop a JDBC application to insert employee details without address, input should be
given by the user.
● Develop a JDBC application to search Employees based on Id.
● Develop a JDBC application to list out all the Employee Details whose salary is less than
80000;
* */
 