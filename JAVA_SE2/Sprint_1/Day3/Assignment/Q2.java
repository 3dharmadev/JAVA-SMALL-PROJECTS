package SB_101.Sprint_1.Day3.Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Q2 {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(12,"Debabrata",7050));
        studentList.add(new Student(15,"Ravan",90850));
        studentList.add(new Student(17,"Kumbhakaran",7750));
        studentList.add(new Student(20,"Meghanada",7950));
        studentList.add(new Student(22,"Hanuman",10000));

        Optional<Student> optionalStudent = studentList.stream().max((s1,s2)-> s1.getMarks()>s2.getMarks()? 1:-1);
        Student max=optionalStudent.get();
        System.out.println(max);

    }
}
/*- Create a List of 5 Student objects and from that List get the highest marks
Student by
using Stream API.
*/
  class Student {
    private int roll;
    private  String name;
    private int marks;

    public Student(int roll, String name, int marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
