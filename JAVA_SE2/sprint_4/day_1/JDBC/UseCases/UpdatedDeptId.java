package SB_101.sprint_4.day_1.JDBC.UseCases;


import SB_101.sprint_4.day_1.JDBC.DAO.Employee_I;
import SB_101.sprint_4.day_1.JDBC.DAO.Impl_Emp_Dept;
import SB_101.sprint_4.day_1.JDBC.Exception_.Employee_Eception;

public class UpdatedDeptId {
    public static void main(String[] args) {
        Employee_I dao=new Impl_Emp_Dept();
        try {
          String message=  dao.updateDeptIdWithEmployeeId(1,2);
            System.out.println(message);
        } catch (Employee_Eception e) {
            throw new RuntimeException(e);
        }
    }
}
