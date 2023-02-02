package SB101_V2.Sprint_4.Day2.Problem2_and_Problem3.dao;

import SB101_V2.Sprint_4.Day2.Problem2_and_Problem3.exception.StudentException;
import SB101_V2.Sprint_4.Day2.Problem2_and_Problem3.model.Student;
import SB101_V2.Sprint_4.Day2.Problem2_and_Problem3.utility.DB_Util;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao{

    @Override
    public Student getStudentByRollNo(int rollNo) throws StudentException {
        Student student=new Student();
        try(Connection conn= DB_Util.getConnection()){
         PreparedStatement ps=  conn.prepareStatement("select * from Student where rollNo=?");
         ps.setInt(1,rollNo);
         ResultSet rs=ps.executeQuery();
         if(rs.next()){
             student.setRollNo(rs.getInt("rollNo"));
             student.setStudentName(rs.getString("studentName"));
             student.setAddress(rs.getString("address"));
             student.setMarks(rs.getInt("marks"));
         }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return student;
    }

    /**
     * @return
     */
    @Override
    public List<Student> getAllStudent() {
        List<Student> students=new ArrayList<>();

        try(Connection conn=DB_Util.getConnection()){
         PreparedStatement ps=  conn.prepareStatement("select * from student");
           ResultSet rs=  ps.executeQuery();
            while (rs.next()){
                Student student=new Student();
                student.setRollNo(rs.getInt("rollNo"));
                student.setStudentName(rs.getString("studentName"));
                student.setAddress(rs.getString("address"));
                student.setMarks(rs.getInt("marks"));
                students.add(student);
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }

        return students;

    }

    /**
     * @param student
     * @return
     */
    @Override
    public String saveStudentDetails(Student student) {
        String message="Not inserted..";

        try(Connection conn=DB_Util.getConnection()){
        PreparedStatement ps = conn.prepareStatement("insert into student values(?,?,?,?)");
        ps.setInt(1,student.getRollNo());
        ps.setString(2,student.getStudentName());
        ps.setString(3,student.getAddress());
        ps.setInt(4,student.getMarks());
        int ans= ps.executeUpdate();
        if(ans>0) message="inserted successfully...";
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }


        return message;
    }

    /**
     * @param rollNo
     * @return
     * @throws StudentException
     */
    @Override
    public boolean deleteStudentByRollNo(int rollNo) throws StudentException {
        boolean delete=false;

        try (Connection conn=DB_Util.getConnection()){
            PreparedStatement ps= conn.prepareStatement("delete from student where rollNo=?");
            ps.setInt(1,rollNo);
           int res= ps.executeUpdate();
           if(res>0) delete=true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return delete;
    }

    /**
     * @param rollNo
     * @param marks
     * @return
     * @throws StudentException
     */
    @Override
    public String graceStudentMarks(int rollNo, int marks) throws StudentException {
       String message="Not updated wrong input...";
       try (Connection conn=DB_Util.getConnection()){
           PreparedStatement ps=conn.prepareStatement("update student set marks=marks+? where rollNo=?");
           ps.setInt(1,marks);
           ps.setInt(2,rollNo);
          int res= ps.executeUpdate();
          if(res>0) message="Updated successfully";
       }
       catch (SQLException e){
          throw  new StudentException(e.getMessage());
       }

       return message;
    }

    /**
     * @param name
     * @return
     * @throws StudentException
     */
    @Override
    public List<Student> getStudentsByName(String name) throws StudentException {
      List<Student> students=new ArrayList<>();

      try (Connection conn=DB_Util.getConnection()){
       PreparedStatement ps=  conn.prepareStatement("select * from student where studentName=?");
       ps.setString(1,name);
       ResultSet rs1=ps.executeQuery();
          while (rs1.next()){
              Student student=new Student();
              student.setRollNo(rs1.getInt("rollNo"));
              student.setStudentName(rs1.getString("studentName"));
              student.setAddress(rs1.getString("address"));
              student.setMarks(rs1.getInt("marks"));
              students.add(student);
          }
      }
      catch (SQLException e){
          throw new StudentException(e.getMessage());
      }

      return students;
    }
}
