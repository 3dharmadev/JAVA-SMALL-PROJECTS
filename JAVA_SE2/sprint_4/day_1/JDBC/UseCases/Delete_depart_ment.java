package SB_101.sprint_4.day_1.JDBC.UseCases;

import java.util.Scanner;


import SB_101.sprint_4.day_1.JDBC.DAO.Employee_I;
import SB_101.sprint_4.day_1.JDBC.DAO.Impl_Emp_Dept;
import SB_101.sprint_4.day_1.JDBC.Exception_.Department_Exception;

public class Delete_depart_ment {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	 
			
			System.out.println("Enter Department id");
			int deptid= sc.nextInt();
		 
			
			 Employee_I empimpl= new Impl_Emp_Dept();
			 
	 
			String str;
			try {
				str = empimpl.Delete_Department(deptid);
				System.out.println("Delete record "+deptid+" "+str);
			} catch (Department_Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		 
		 
		

	}

}
