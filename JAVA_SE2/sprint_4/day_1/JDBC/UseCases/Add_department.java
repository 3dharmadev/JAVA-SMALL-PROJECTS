package SB_101.sprint_4.day_1.JDBC.UseCases;

import SB_101.sprint_4.day_1.JDBC.DAO.Employee_I;
import SB_101.sprint_4.day_1.JDBC.DAO.Impl_Emp_Dept;
import SB_101.sprint_4.day_1.JDBC.Exception_.Department_Exception;

import java.util.Scanner;

public class Add_department {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter department id");
        int id= sc.nextInt();

        System.out.println("Enter department name");
        String name= sc.next();

        System.out.println("Enter department location");
        String location= sc.next();


        Employee_I employee_i=new Impl_Emp_Dept();
        try {
            System.out.println(employee_i.Add_Department(id,name,location));
        } catch (Department_Exception e) {
            throw new RuntimeException(e);
        }
    }
}
