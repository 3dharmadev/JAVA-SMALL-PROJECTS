package SB_101.sprint_4.day_1.JDBC.UseCases;

import java.util.Scanner;


import SB_101.sprint_4.day_1.JDBC.DAO.Employee_I;
import SB_101.sprint_4.day_1.JDBC.DAO.Impl_Emp_Dept;
import SB_101.sprint_4.day_1.JDBC.Exception_.Employee_Eception;

public class Update_location {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
			
			
		 System.out.println("Enter new location");
			String new_= sc.next();
			 System.out.println("Enter department id");
				int did= sc.nextInt();
			 
			
			 
		 
			
			 Employee_I empimpl= new Impl_Emp_Dept();
			 
	 
			 try {
				String str=empimpl.Update_Depart_Location(new_, did);
				System.out.println(str);
			} catch (Employee_Eception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
