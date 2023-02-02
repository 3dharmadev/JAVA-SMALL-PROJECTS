package SB_101.Sprint_1.Day3;

import java.util.function.Predicate;

public class MyPredicate implements Predicate<Student> {


    @Override
    public boolean test(Student student) {
     return student.getMarks()>700;
    }
}
