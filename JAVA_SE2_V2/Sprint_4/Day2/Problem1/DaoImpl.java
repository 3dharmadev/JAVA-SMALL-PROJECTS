package SB101_V2.Sprint_4.Day2.Problem1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DaoImpl {
    public Employee getEmployeeById(int empId) throws EmployeeException {
        Employee employee=new Employee();
        try(Connection connection=DB_Util.getConnection()){
          PreparedStatement ps= connection.prepareStatement("select * from Employee where empId=?");
          ps.setInt(1,empId);
         ResultSet rs= ps.executeQuery();
            if(rs.next()){

                employee.setEmpId(rs.getInt("empId"));

                employee.setName(rs.getString("name"));
                employee.setAddress(rs.getString("address"));
                employee.setSalary(rs.getInt("salary"));

            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new EmployeeException("no employee present with this id "+empId);
        }
        return employee;
    }
    public List<Employee> getAllEmployee(){
         List<Employee>  employees=new ArrayList<>();
        try (Connection conn=DB_Util.getConnection()){
         PreparedStatement   ps=  conn.prepareStatement("select * from employee");
        ResultSet rs= ps.executeQuery();
        while(rs.next()){

            Employee employee=new Employee();

            employee.setEmpId(rs.getInt("empId"));

            employee.setName(rs.getString("name"));
            employee.setAddress(rs.getString("address"));
            employee.setSalary(rs.getInt("salary"));
            employees.add(employee);
        }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return employees;
    }

    public String saveEmployeeDetails(Employee employee){
        String message="Not inserted..";

        try(Connection conn=DB_Util.getConnection()){
          PreparedStatement ps=  conn.prepareStatement("insert into employee values(?,?,?,?)");
          ps.setInt(1,employee.getEmpId());
          ps.setString(2,employee.getName());
          ps.setString(3,employee.getAddress());
          ps.setInt(4,employee.getSalary());
             int res= ps.executeUpdate();
             if(res>0) message="inserted successfully";
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }


        return  message;
    }

    public boolean deleteEmployeeById(int empId)throws EmployeeException{
        boolean flag=false;

        try(Connection conn=DB_Util.getConnection()){
         PreparedStatement ps= conn.prepareStatement("delete  from employee where empId=?");
            ps.setInt(1,empId);
          int res=  ps.executeUpdate();
          if(res>0) flag=true;
           else throw   new EmployeeException("please enter a valid id");
        }
        catch (SQLException e){
            throw  new EmployeeException(e.getMessage());
        }

        return flag;
    }

    public String giveBonusToEmployee(int empId, int amount)throws EmployeeException{
         String message="wrong empid or amount..";

         try(Connection conn=DB_Util.getConnection()) {
          PreparedStatement   ps=conn.prepareStatement("update employee set salary=salary+? where empId=?");
             ps.setInt(1,amount);
             ps.setInt(2,empId);
             int res=ps.executeUpdate();
             if(res>0) message="updated successfully";
             else  throw new EmployeeException("wrong employee id");
         }
         catch (SQLException e){
             throw new EmployeeException(e.getMessage());
         }



         return message;

    }

}

/*Implement the following methods of the EmployeeDao interface
public Employee getEmployeeById(int empId)throws EmployeeException
public List<Employee> getAllEmployee();
public String saveEmployeeDetails(Employee employee);
public boolean deleteEmployeeById(int empId)throws
EmployeeException
public String giveBonusToEmployee(int empId, int amount)throws
EmployeeException
Note: EmployeeException should be checked exception
Write separate UseCase classes to verify all the above methods.*/