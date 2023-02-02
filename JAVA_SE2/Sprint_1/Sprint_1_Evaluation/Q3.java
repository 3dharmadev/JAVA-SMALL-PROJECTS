package SB_101.Sprint_1.Sprint_1_Evaluation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Q3 {
    public static void main(String[] args) {
        List<Student1> studentList =new ArrayList<>();
        studentList.add(new Student1("Cuttack"));
        studentList.add(new Student1("bengaluru"));
        studentList.add(new Student1("bengaluru cda 1"));
        studentList.add(new Student1("mumbai"));
        studentList.add(new Student1("aka"));
        studentList.add(new Student1("bensslgaluru"));
        studentList.add(new Student1("asia cda 1"));
        studentList.add(new Student1("sskle"));

        List<Student1>  students = studentList.stream().filter(s ->s.getName().length()%2==0 )
                .map(student1 -> new Student1(student1.getName().toUpperCase())).collect(Collectors.toList());

      studentList.forEach(student1 -> System.out.println(student1));
        students.forEach(student1 -> System.out.println(student1));


    }
}
class Student1{
    String name;

    public Student1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                '}';
    }
}
/*- Create a List of 10 Students names, using stream API filter out only those
names whose length is an even number, then transform that name into the upper
case. and get the List of transformed names.
Sort the transformed List in descending order using Lambda expression.
Print both original and transformed List using Lambda Expressions.*/