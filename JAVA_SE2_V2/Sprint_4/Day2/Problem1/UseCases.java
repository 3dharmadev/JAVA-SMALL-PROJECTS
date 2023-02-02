package SB101_V2.Sprint_4.Day2.Problem1;

import java.util.List;

public class UseCases {
    public static void main(String[] args) throws EmployeeException {
        DaoImpl dao=new DaoImpl();
        /*try {
           Employee employee= dao.getEmployeeById(1);
            System.out.println(employee);
        } catch (EmployeeException e) {
            System.out.println(e.getMessage());
        } */

      /*  List<Employee> employees= dao.getAllEmployee();
        for (Employee emp: employees) {
            System.out.println(emp);
        }
           */
        /* Employee employee=new Employee();
         employee.setName("deba");
         employee.setSalary(12222);
         employee.setAddress("cuttack");
         employee.setEmpId(7);
        System.out.println(dao.saveEmployeeDetails(employee));; */

       // System.out.println(dao.deleteEmployeeById(1));

        System.out.println(dao.giveBonusToEmployee(2,1040));
    }
}
