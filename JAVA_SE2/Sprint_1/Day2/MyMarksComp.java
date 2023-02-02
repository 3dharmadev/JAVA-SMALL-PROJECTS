package SB_101.Sprint_1.Day2;

import java.util.Comparator;

public class MyMarksComp implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
//         if(o1.getMarks() >o2.getMarks()) return 1;
//         else if(o1.getMarks() <  o2.getMarks()) return -1;
//         else return 0;
        return o1.getMarks()>o2.getMarks() ? 1:-1;
    }
}
