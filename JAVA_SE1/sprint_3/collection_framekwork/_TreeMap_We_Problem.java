package java111.sprint_3.collection_framekwork;

import java.util.*;

public class _TreeMap_We_Problem {
    public static void main(String[] args) {
        TreeMap<Student1,String> tm = new TreeMap<>(new StudentMarksComparator());
        tm.put(new Student1(10,"abc",950),"Maharastra");
        tm.put(new Student1(11,"abd",796),"Kerela");
        tm.put(new Student1(15,"sky",1000),"Uttar Pradesh");
        tm.put(new Student1(17,"Vir",998),"Delhi");
        tm.put(new Student1(1,"Rohit",998),"Mumbai");
        System.out.println(tm);

    }
}
