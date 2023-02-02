package SB101_V2.Sprint_1.EVA;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Q2 {
    public static void main(String[] args) {
        List<Student> students=new ArrayList<>();

        students.add(new Student(10,"N1",879,"Cuttack"));
        students.add(new Student(12,"N2",244,"bengaluru"));
        students.add(new Student(14,"N3",860,"bengaluru cda 1"));
        students.add(new Student(15,"N5",400,"mumbai"));
        students.add(new Student(17,"N4",500,"CHENNAI"));

        List<Student> bestStudent = students.stream().filter(student -> student.getMarks()>500).
                map(s -> new Student(s.getRoll(), s.getName(), s.getMarks()*1000,s.getAddress())).collect(Collectors.toList());

        List<Employee1> employee1= new ArrayList<>();

        bestStudent.stream().forEach(s-> employee1.add(new Employee1(s.getRoll(),s.getName(), s.getMarks(), s.getAddress())));

        students.stream().forEach(student -> System.out.println(student));

        employee1.stream().forEach(employee11 -> System.out.println(" EMP   ->    "+employee11));


    }
}
/* - Create a List of 5 Student objects.
        - Transform the Student whose marks are greater than 500 to the Employee object as
        roll should be the empId and employee salary should be marks * 10000. by using Stream API.

        **Hint:** make use of the map function of Stream API.

        - Get all the employees in another List and sort all the employee's object according to
        their salary in descending order by **using Lambda Expression.**
        - Print both Employee’s List and Original Student’s List using Lambda expression.
*/



class Student {
    private int roll;
    private  String name;
    private int marks;

    private String address;
    public Student(int roll, String name, int marks, String address) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                ", address='" + address + '\'' +
                '}';
    }


}
class Employee1{
    private int empId;
    private  String Name;
    private int Salary;
    private String address;

    public Employee1(int empId, String name, int salary, String address) {
        this.empId = empId;
        Name = name;
        Salary = salary;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "empId=" + empId +
                ", Name='" + Name + '\'' +
                ", Salary=" + Salary +
                ", address='" + address + '\'' +
                '}';
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
