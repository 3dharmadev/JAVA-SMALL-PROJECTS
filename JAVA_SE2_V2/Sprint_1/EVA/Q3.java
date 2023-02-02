package SB101_V2.Sprint_1.EVA;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Q3 {
    public static void main(String[] args) {
        List<Student1> studentList =new ArrayList<>();
        studentList.add(new Student1(1,"Rama",450));
        studentList.add(new Student1(2,"shyama",567));
        studentList.add(new Student1(3,"gadadharaa",567));
        studentList.add(new Student1(4,"chakradhara",565));
        studentList.add(new Student1(45,"padmanava",4555));
        studentList.add(new Student1(44,"mahabahu",3443));
        studentList.add(new Student1(344,"satyarama",444));
        studentList.add(new Student1(43,"viswanatha",323));

        List<Student1>  students = studentList.stream().filter(s ->s.getName().length()%2==0)
                .map(student1 -> new Student1(student1.getSid(),student1.getName().toUpperCase(),student1.getMarks())).
                sorted((o1, o2) -> o2.getName().compareTo(o1.getName())).collect(Collectors.toList());

        studentList.forEach(student1 -> System.out.println(student1));

        System.out.println("=================Descending order===================");
        students.forEach(student1 -> System.out.println(student1));



    }
}
class Student1{

    private int sid;
    private String name;

    private int marks;

    public Student1(int sid, String name, int marks) {
        this.sid = sid;
        this.name = name;
        this.marks = marks;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
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
        return "Student1{" +
                "sid=" + sid +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
/*- Create a List of 10 Students names, using stream API filter out only those
names whose length is an even number, then transform that name into the upper
case. and get the List of transformed names.
Sort the transformed List in descending order using Lambda expression.
Print both original and transformed List using Lambda Expressions.*/