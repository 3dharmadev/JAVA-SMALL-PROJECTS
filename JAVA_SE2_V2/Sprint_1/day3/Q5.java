package SB101_V2.Sprint_1.day3;

import java.util.*;
import java.util.stream.Collectors;

public class Q5 {

    public static void main(String[] args) {
        Set<Student> studentSet=new TreeSet<Student>((o1, o2) -> o1.getRoll()==o2.getRoll() ? 1:-1);


        studentSet.add(new Student(12,"Debabrata",400));
        studentSet.add(new Student(12,"Debabrata",7050));
        studentSet.add(new Student(15,"Ravan",90850));
        studentSet.add(new Student(17,"Kumbhakaran",100));
        studentSet.add(new Student(20,"Meghanada",7950));
        studentSet.add(new Student(22,"Hanuman",10000));

     Set<Student> students=   studentSet.stream().filter(student -> student.getMarks()>500).collect(Collectors.toSet());

        for (Student s: students) {
            System.out.println(s);
        }



    }

}
