package SB_101.sprint_4.day_1.JDBC.UseCases;

import java.util.List;


import SB_101.sprint_4.day_1.JDBC.Model.Department_Bean;
import SB_101.sprint_4.day_1.JDBC.DAO.Employee_I;
import SB_101.sprint_4.day_1.JDBC.DAO.Impl_Emp_Dept;
import SB_101.sprint_4.day_1.JDBC.Exception_.Department_Exception;

public class Print_All_Depart_Ment {

	public static void main(String[] args) {
		 Employee_I empimpl= new Impl_Emp_Dept();
		 
		 
			 
			try {
			List<Department_Bean> list = empimpl.All_Department_Details();
				System.out.println(list);
			} catch (Department_Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


	}

}
