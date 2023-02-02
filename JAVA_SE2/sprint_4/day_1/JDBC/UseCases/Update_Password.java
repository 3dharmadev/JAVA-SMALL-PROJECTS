package SB_101.sprint_4.day_1.JDBC.UseCases;

import java.util.Scanner;

import SB_101.sprint_4.day_1.JDBC.DAO.Employee_I;
import SB_101.sprint_4.day_1.JDBC.DAO.Impl_Emp_Dept;
import SB_101.sprint_4.day_1.JDBC.Exception_.Employee_Eception;

public class Update_Password {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
			
			
		 System.out.println("Enter name");
			int empId= sc.nextInt();
			 System.out.println("Enter password");
				String password= sc.next();
			 
			
			 
		 
			
			 Employee_I empimpl= new Impl_Emp_Dept();
			 
	 
		
		 try {
		String str=	empimpl.Update_Emp_Password(empId, password);
		System.out.println(str);
		} catch (Employee_Eception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			

	}

}
