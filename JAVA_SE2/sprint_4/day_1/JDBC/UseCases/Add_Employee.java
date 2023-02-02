package SB_101.sprint_4.day_1.JDBC.UseCases;

import SB_101.sprint_4.day_1.JDBC.Model.Employee_Bean;
import SB_101.sprint_4.day_1.JDBC.DAO.Employee_I;
import SB_101.sprint_4.day_1.JDBC.DAO.Impl_Emp_Dept;
import SB_101.sprint_4.day_1.JDBC.Exception_.Employee_Eception;

import java.util.Scanner;




public class Add_Employee {


	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);


		System.out.println("Enter name");
		String name= sc.next();

		System.out.println("Enter Address");
		String address= sc.next();

		System.out.println("Enter email");
		String email= sc.next();
		System.out.println("Enter password");
		String password= sc.next();

		System.out.println("Enter salary");
		int salary= sc.nextInt();




		Employee_I empimpl= new Impl_Emp_Dept();

		Employee_Bean emp = new Employee_Bean();
		emp.setAddress(address);
		emp.setEmail(email);
		emp.setEname(name);
		emp.setSalary(salary);
		emp.setPassword(password);


		try {
			String str=empimpl.Add_Employee_WithoutDeptId(emp);
			System.out.println(str);
		} catch (Employee_Eception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}





	}

}