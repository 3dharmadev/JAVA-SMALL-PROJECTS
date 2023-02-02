package SB_101.sprint_4.day_1.JDBC.DAO;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;




import SB_101.sprint_4.day_1.JDBC.Model.Department_Bean;
import SB_101.sprint_4.day_1.JDBC.Model.Employee_Bean;
import SB_101.sprint_4.day_1.JDBC.Exception_.Department_Exception;
import SB_101.sprint_4.day_1.JDBC.Exception_.Employee_Eception;
import SB_101.sprint_4.day_1.JDBC.JDBC_Config.JDBC_Conn;


public class Impl_Emp_Dept implements Employee_I {
	@Override
	public String Add_Department(int did, String dname, String location) {
		// TODO Auto-generated method stub
		String message = "Not Inserted..!";

		try (Connection conn =  JDBC_Conn.Set_Connection()) {

			PreparedStatement ps = conn.prepareStatement("insert into department values(?,?,?)");

			ps.setInt(1, did);
			ps.setString(2, dname);
			ps.setString(3, location);


			int x = ps.executeUpdate();

			if (x > 0)
				message = "Record Inserted Sucessfully..!";

		} catch (SQLException e) {
			e.printStackTrace();
			message = e.getMessage();
		}

		return message;
	}


	public String Add_Employee_WithoutDeptId(Employee_Bean emp) {
		String message = "Not Inserted..!";

		try (Connection conn = JDBC_Conn.Set_Connection()) {


			PreparedStatement ps = conn.prepareStatement("insert into employee(ename,address,email,password,salary)  values(?,?,?,?,?)");

			ps.setString(1, emp.getEname());
			ps.setString(2, emp.getAddress());
			ps.setString(3, emp.getEmail());
			ps.setString(4, emp.getPassword());
			ps.setLong(5, emp.getSalary());

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
	public String updateDeptIdWithEmployeeId(int empId, int deptId) throws Employee_Eception {
		 String message="please enter details carefully..";

		 try (Connection conn=JDBC_Conn.Set_Connection()){
		PreparedStatement	ps= conn.prepareStatement("update employee  set  deptId=?  where empId=?");

      int ans=ps.executeUpdate();

	  if(ans>0) message="updated successfully...";
		 }
		 catch (SQLException e){
			 throw new Employee_Eception(e.getMessage());
		 }


		 return message;
	}

	@Override
	public Employee_Bean Employee_Login( String email,String password) throws Employee_Eception {

		Employee_Bean emp = null;


		try (Connection conn=  JDBC_Conn.Set_Connection()){


			PreparedStatement ps= conn.prepareStatement("select * from employee where email=? AND password = ?");

			ps.setString(1, email);
			ps.setString(2, password);

			ResultSet rs= ps.executeQuery();
			boolean isPresent = false;
			String name="";

			if(rs.next()) {
				System.out.println("======================HELLO WELCOME=======================");
				emp = new Employee_Bean();

				isPresent=true;
				emp.setEmpid(rs.getInt("empId"));

				emp.setEname(rs.getString("ename"));
				name=rs.getString("ename");
				emp.setAddress(rs.getString("address"));
				emp.setEmail(rs.getString("email"));
				emp.setPassword(rs.getString("password"));
				emp.setSalary(rs.getInt("salary"));

				emp.setDeptid(rs.getInt("deptId"));
			}else
				throw new Employee_Eception("Invalid Username or password..");
			if(isPresent==true){
				System.out.println("Welcome to IntelliJ "+name);
			}


		} catch (SQLException e) {
			e.printStackTrace();
			throw new Employee_Eception(e.getMessage());
		}

		return emp;



	}

	@Override
	public String Delete_Department(int did) {

		String message = "Department Not Found..!";

		try (Connection conn = JDBC_Conn.Set_Connection()) {

			PreparedStatement ps = conn.prepareStatement("delete from department where did=?");

			ps.setInt(1, did);

			int x = ps.executeUpdate();

			if (x > 0)
				message = "Department Deleted Successfully..!";

		} catch (SQLException e) {
			e.printStackTrace();
			message = e.getMessage();
		}

		return message;


	}

	@Override
	public List<Department_Bean> All_Department_Details() throws Department_Exception {
		List<Department_Bean> list= new ArrayList<>();


		try (Connection conn =  JDBC_Conn.Set_Connection()) {

			PreparedStatement ps = conn.prepareStatement("select * from department");

			ResultSet rs =  ps.executeQuery();

			while(rs.next()) {

				Department_Bean dept=new Department_Bean();

				dept.setDid(rs.getInt("did"));
				dept.setDname(rs.getString("dname"));
				dept.setLocation(rs.getString("location"));

				list.add(dept);
			}



		} catch (SQLException e) {
			e.printStackTrace();
			throw new Department_Exception(e.getMessage());
		}

		return list;

	}

	@Override
	public String Update_Emp_Password(int empId,String password) {
		String message = "Wrong name..!";

		try (Connection conn =  JDBC_Conn.Set_Connection()) {

			PreparedStatement ps = conn.prepareStatement("update employee  set  password=?  where empId=?");



			ps.setString(1, password);
			ps.setInt(2, empId);


			int x = ps.executeUpdate();

			if (x > 0) message = "password Updated Successfully..!";

		} catch (SQLException e) {
			e.printStackTrace();
			message = e.getMessage();
		}

		return message;
	}

	@Override
	public String Update_Depart_Location(String new_location, int did) throws Employee_Eception {

		String message = "Wrong name..!";

		try (Connection conn =  JDBC_Conn.Set_Connection()) {

			PreparedStatement ps = conn.prepareStatement("update department  set  location=?  where did=?");


			ps.setString(1, new_location);
			ps.setInt(2, did);


			int x = ps.executeUpdate();

			if (x > 0) message = "Location Updated Sucessfully..!";


		} catch (SQLException e) {
			e.printStackTrace();
			message = e.getMessage();
		}

		return message;

	}

}