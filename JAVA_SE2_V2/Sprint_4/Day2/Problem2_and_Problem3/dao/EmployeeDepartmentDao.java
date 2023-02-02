package SB101_V2.Sprint_4.Day2.Problem2_and_Problem3.dao;

import SB101_V2.Sprint_4.Day2.Problem2_and_Problem3.exception.DepartmentException;
import SB101_V2.Sprint_4.Day2.Problem2_and_Problem3.exception.EmployeeException;
import SB101_V2.Sprint_4.Day2.Problem2_and_Problem3.model.Department;
import SB101_V2.Sprint_4.Day2.Problem2_and_Problem3.model.Employee;

import java.util.List;

public interface EmployeeDepartmentDao {
   String insertDataIntoEmployeeTable(Employee employee);
   List<Employee> allEmployeeWorkingUnderAccountDept() throws EmployeeException;
   String deleteDepartmentByDepartmentId(int deptId) throws DepartmentException;

   List<Department> getAllEmp_DeptUnderMumbai() throws DepartmentException;

}

/*   Write a JDBC application to insert details of Employee by taking the input from the
    User.
● Write a JDBC application to insert details of Employee by taking the input from the
    User.
● Write a JDBC application to get all the Employee details who work in the “Account”
    department.
● Write a JDBC application to delete the Dependent based on did, by taking the input
    from the user.
● Write a JDBC application to get the Department details of those employees who live
    in Mumba*/