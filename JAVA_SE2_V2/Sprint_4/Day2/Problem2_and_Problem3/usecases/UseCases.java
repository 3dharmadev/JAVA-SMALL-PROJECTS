package SB101_V2.Sprint_4.Day2.Problem2_and_Problem3.usecases;

import SB101_V2.Sprint_4.Day2.Problem2_and_Problem3.dao.StudentDao;
import SB101_V2.Sprint_4.Day2.Problem2_and_Problem3.dao.StudentDaoImpl;
import SB101_V2.Sprint_4.Day2.Problem2_and_Problem3.exception.StudentException;

public class UseCases {
    public static void main(String[] args) throws StudentException {
        StudentDao dao=new StudentDaoImpl();
       // System.out.println(dao.getStudentByRollNo(2));
     /* List<Student> studentList=  dao.getAllStudent();
        for (Student student:studentList) {
            System.out.println(student);
        } */
      /*Student student=new Student();
      student.setMarks(10); student.setStudentName("deba"); student.setAddress("cuttack"); student.setRollNo(5);
        System.out.println(dao.saveStudentDetails(student)); */
       // System.out.println(dao.deleteStudentByRollNo(6));
       // System.out.println(dao.graceStudentMarks(3,50));

      //  System.out.println(dao.getStudentsByName("deba"));


    }
}
