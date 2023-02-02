package SB101_V2.Sprint_4.Day2.Problem2_and_Problem3.dao;

import SB101_V2.Sprint_4.Day2.Problem2_and_Problem3.exception.DepartmentException;
import SB101_V2.Sprint_4.Day2.Problem2_and_Problem3.exception.EmployeeException;
import SB101_V2.Sprint_4.Day2.Problem2_and_Problem3.model.Department;
import SB101_V2.Sprint_4.Day2.Problem2_and_Problem3.model.Employee;
import SB101_V2.Sprint_4.Day2.Problem2_and_Problem3.utility.DB_Util;
import com.sun.source.tree.LiteralTree;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Emp_DeptImpl implements EmployeeDepartmentDao{
    /**
     * @param employee
     * @return
     */
    @Override
    public String insertDataIntoEmployeeTable(Employee employee) {
        String message="Not inserted...";
        try(Connection conn= DB_Util.getConnection()){
         PreparedStatement ps=  conn.prepareStatement("insert into employee values(?,?,?,?,?)");
         ps.setInt(1,employee.getEmployeeId());
         ps.setString(2,employee.getEmployeeName());
         ps.setString(3,employee.getAddress());
         ps.setInt(4,employee.getMobileNum());
         ps.setInt(5,employee.getDepartmentId());
         int res=ps.executeUpdate();
         if(res>0) message="inserted successfully...";
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return message;
    }

    /**
     * @return
     * @throws EmployeeException
     */
    @Override
    public List<Employee> allEmployeeWorkingUnderAccountDept() throws EmployeeException {
        List<Employee> employees=new ArrayList<>();

        try(Connection conn=DB_Util.getConnection()){
         PreparedStatement ps=
                 conn.prepareStatement("select * from employee where " +
                         "deptid=(select did from department where dname='account')");
         ResultSet rs= ps.executeQuery();

         while (rs.next()) {
             Employee employee = new Employee();
             employee.setEmployeeId(rs.getInt("empId"));
             employee.setEmployeeName(rs.getString("ename"));
             employee.setAddress(rs.getString("address"));
             employee.setMobileNum(rs.getInt("mobile"));
             employee.setDepartmentId(rs.getInt("deptid"));
             employees.add(employee);
         }
        }
        catch (SQLException e){
            e.printStackTrace();
            throw  new EmployeeException(e.getMessage());
        }


        return employees;
    }

    /**
     * @param deptId
     * @return
     * @throws DepartmentException
     */
    @Override
    public String deleteDepartmentByDepartmentId(int deptId) throws DepartmentException {
       String message="Wrong department id...";

       try(Connection conn=DB_Util.getConnection()){
         PreparedStatement ps= conn.prepareStatement("DELETE FROM department WHERE did=?");
        int res= ps.executeUpdate();
        if(res>0) message="delete successfully...";
       }
       catch (SQLException e){
           message=e.getMessage();
           System.out.println(e.getMessage());
       }


       return message;
    }

    /**
     * @return
     * @throws DepartmentException
     */
    @Override
    public List<Department> getAllEmp_DeptUnderMumbai() throws DepartmentException {
        List<Department> departments=new ArrayList<>();

        try(Connection conn=DB_Util.getConnection()){
            PreparedStatement ps=
                    conn.prepareStatement("select * from department where location='mumbai'");
            ResultSet rs= ps.executeQuery();

            while (rs.next()) {
                Department department=new Department();
                department.setDepartmentId(rs.getInt("did"));
                department.setDepartmentName(rs.getString("dname"));
                department.setLocation(rs.getString("location"));
                departments.add(department);
            }
        }
        catch (SQLException e){
            e.printStackTrace();
            throw  new DepartmentException(e.getMessage());
        }
        return departments;
    }
}
