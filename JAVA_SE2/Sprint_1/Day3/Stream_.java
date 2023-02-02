package SB_101.Sprint_1.Day3;

import java.util.*;

public class Stream_ {
    public static void main(String[] args) {
       /* List<String> list= Arrays.asList("One","two","three","four","five");
        Stream<String> strm=list.stream();
        strm.forEach(s-> System.out.println(s.toUpperCase()));
        strm.forEach(s-> System.out.println(s.toUpperCase())); */

        List<Student> students=new ArrayList<>();
        students.add(new Student(10,"N1",879));
        students.add(new Student(12,"N2",244));
        students.add(new Student(14,"N3",860));
        students.add(new Student(15,"N5",400));
      /*   //this is multi line
        Stream<Student> str1 = students.stream();
        Stream<Student> str2=str1.filter(s-> s.getMarks()<500);
        str2.forEach(student -> System.out.println(student)); */
//this is single line
       // students.stream().filter(s->s.getMarks()<500).forEach(student -> System.out.println(student));
     /*   //multi line
     Stream<Student> str1 = students.stream();
     Stream<Student> str2 = str1.filter(s->s.getMarks()>500);
     List<Student> filteredStudents = str2.collect(Collectors.toList());
        System.out.println(filteredStudents); */
         //single line
       // List<Student> list = students.stream().filter(s->s.getMarks()>500).collect(Collectors.toList());

 /*  Stream<Student> str1  = students.stream();
   Stream<Student> str2 =str1.map(s->new Student(s.getRoll(),s.getName(),s.getMarks()+50));
   List<Student> modifiedList = str2.collect(Collectors.toList()); */

       /* List<Student> list=students.stream().map(s-> new Student(s.getRoll(),s.getName(),s.getMarks()+50)).collect(Collectors.toList());
        System.out.println(list); */

  /*  Optional<Student> opt = students.stream().min((s1, s2)-> s1.getMarks() > s2.getMarks() ? 1:-1);
    Student min = opt.get();
    Optional<Student> opt2 = students.stream().max((s1,s2)-> s1.getMarks()>s2.getMarks() ? 1:-1);
    Student max=opt2.get();
        System.out.println(max);
        System.out.println(min); */

  long res = students.stream().filter(s-> s.getMarks() <500).count();
        System.out.println(res);

    }
}
