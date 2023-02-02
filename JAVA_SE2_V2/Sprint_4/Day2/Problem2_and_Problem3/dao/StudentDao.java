package SB101_V2.Sprint_4.Day2.Problem2_and_Problem3.dao;

import SB101_V2.Sprint_4.Day2.Problem2_and_Problem3.exception.StudentException;
import SB101_V2.Sprint_4.Day2.Problem2_and_Problem3.model.Student;

import java.util.List;

public interface StudentDao {
    public Student getStudentByRollNo(int rollNo)throws StudentException;
    public List<Student> getAllStudent();
    public String saveStudentDetails(Student student);
    public boolean deleteStudentByRollNo(int rollNo)throws StudentException;
    public String graceStudentMarks(int rollNo, int marks)throws StudentException;

    public List<Student> getStudentsByName(String name)throws StudentException;

}
/*Implement the following methods of the EmployeeDao interface
public Student getStudentByRollNo(int rollNo)throws StudentException
public List<Student> getAllStudent();
public String saveStudentDetails(Student student);
public boolean deleteStudentByRollNo(int rollNo)throws StudentException
public String graceStudentMarks(int rollNo, int marks)throws StudentException

public List<Student> getStudentsByName(String name)throws StudentException
**Note: StudentException** should be checked exception
Write separate UseCase classes to verify all the above methods.*/