package SB_101.Sprint_1.Day3;

import java.util.function.Function;

public class MyFunction implements Function<Student,String> {
    @Override
    public String apply(Student s) {
       return  s.getMarks()>700 ? "Pass" : "Fail";
    }
}
