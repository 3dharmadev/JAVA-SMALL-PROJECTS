package SB101_V2.Sprint_1.day2;



import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;

public class Q4 {
    public static void main(String[] args) {
        List<Student1> studentList =new ArrayList<>();

        studentList.add(new Student1(61,"rama1",101));
        studentList.add(new Student1(61,"rama2",1011));

        studentList.add(new Student1(230,"shyam",11));

        studentList.add(new Student1(340,"kanha",9));
        studentList.add(new Student1(450,"ankit",8));
        studentList.add(new Student1(520,"kunal",7));
        studentList.add(new Student1(510,"tejas",6));



       List<Student1> filteredList = studentList.stream().filter(s-> s.getMarks()<500).map( s->
               new Student1(s.getMarks(),s.getName(),s.getRoll())
       ).collect(Collectors.toList());

        for (Student1 s: filteredList ) {
            System.out.println(s);
        }

    }
}


class Student1{
    private   int marks;
    private   String name;
    private   int roll;

    public Student1(int marks, String name,  int roll) {
        super();
        this.marks = marks;
        this.name = name;
        this.roll = roll;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "marks " + marks+
                " ,name " + name+
                " ,roll " + roll+
                "}";
    }
}