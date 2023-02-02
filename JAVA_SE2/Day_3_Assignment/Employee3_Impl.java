package SB_101.Day_3_Assignment;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Employee3_Impl implements Employee3{

    @Override
    public List<Employee_Bean3> _all_Employee_Salary_Less_Than_80k() {
        List<Employee_Bean3> list= new ArrayList<>();

        try (Connection conn =  DB_Conn.Set_Connection()) {

            PreparedStatement ps = conn.prepareStatement(" select * from employee3 where salary<80000");

            ResultSet rs =  ps.executeQuery();

            while(rs.next()) {

                Employee_Bean3 emp=new Employee_Bean3();

                emp.setEid(rs.getInt("eid"));
                emp.setName(rs.getString("name"));
                emp.setAddress(rs.getString("address"));
                emp.setSalary(rs.getInt("salary"));

                list.add(emp);
            }



        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        return list;
    }

    @Override
    public Employee_Bean3 Search_Employee(int ID) {

        Employee_Bean3 emp=null;

        try (Connection conn =  DB_Conn.Set_Connection()) {

            PreparedStatement ps = conn.prepareStatement(" select * from employee3 where eid=?");
            ps.setInt(1,ID);

            ResultSet rs =  ps.executeQuery();

            while(rs.next()) {

               emp=new Employee_Bean3();

                emp.setEid(rs.getInt("eid"));
                emp.setName(rs.getString("name"));
                emp.setAddress(rs.getString("address"));
                emp.setSalary(rs.getInt("salary"));


            }



        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        return emp;
    }

    @Override
    public String Add_Employee_Without_Address(int ID, String name, int salary) {
        String message = "Not Inserted..!";

        try (Connection conn = DB_Conn.Set_Connection()) {

            PreparedStatement ps = conn.prepareStatement(" insert into employee3(eid,name,salary,address)  values(?,?,?,'India')");


            ps.setInt(1, ID);
            ps.setString(2, name);
            ps.setInt(3, salary);


            int x = ps.executeUpdate();

            if (x > 0)
                message = "Record Inserted Successfully..!";

        } catch (SQLException e) {
            e.printStackTrace();
            message = e.getMessage();
        }

        return message;
    }

    @Override
    public List<Employee_Bean3> All_Employee_Details() {
        List<Employee_Bean3> list= new ArrayList<>();

        try (Connection conn =  DB_Conn.Set_Connection()) {

            PreparedStatement ps = conn.prepareStatement("select * from employee3");

            ResultSet rs =  ps.executeQuery();

            while(rs.next()) {

                Employee_Bean3 emp=new Employee_Bean3();

                emp.setEid(rs.getInt("eid"));
                emp.setName(rs.getString("name"));
                emp.setAddress(rs.getString("address"));
                emp.setSalary(rs.getInt("salary"));

                list.add(emp);
            }



        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        return list;

    }

    @Override
    public String bounus_Add_500() {
        String message = "Unable to Increment Salary..!";

        try (Connection conn =  DB_Conn.Set_Connection()) {

            PreparedStatement ps = conn.prepareStatement(" update  employee3 set salary=salary+500");



            int x = ps.executeUpdate();

            if (x > 0) message = "500 Bonus Added Successfully..!";

        } catch (SQLException e) {
            e.printStackTrace();
            message = e.getMessage();
        }

        return message;
    }

    @Override
    public String GetSalary(int ID) {
         String message="ID does not exist....";

        try (Connection conn =  DB_Conn.Set_Connection()) {

            PreparedStatement ps = conn.prepareStatement(" select salary,name from employee3 where eid=?");
            ps.setInt(1,ID);

            ResultSet rs =  ps.executeQuery();

            while(rs.next()) {
              message="Hello "+(rs.getString("name"))+ ",your salary is "+(rs.getInt("salary"));

            }



        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        return message;
    }
}
