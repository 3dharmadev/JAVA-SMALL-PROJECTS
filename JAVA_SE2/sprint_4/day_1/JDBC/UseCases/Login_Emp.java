package SB_101.sprint_4.day_1.JDBC.UseCases;

import java.util.Scanner;


import SB_101.sprint_4.day_1.JDBC.Model.Employee_Bean;
import SB_101.sprint_4.day_1.JDBC.DAO.Employee_I;
import SB_101.sprint_4.day_1.JDBC.DAO.Impl_Emp_Dept;
import SB_101.sprint_4.day_1.JDBC.Exception_.Employee_Eception;

public class Login_Emp {

	public static void main(String[] args)  {
		 
		 Scanner sc = new Scanner(System.in);
			
			
		 System.out.println("Enter email");
			String email= sc.next();
			System.out.println("Enter password");
			String password= sc.next();
			
			 
		 
			
			 Employee_I empimpl= new Impl_Emp_Dept();
			 
		 try {
		Employee_Bean emp =  empimpl.Employee_Login(email, password);
		
		System.out.println(emp);
		
		} catch (Employee_Eception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
