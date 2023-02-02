package java111.sprint_3.collection_framekwork;

import java.util.Set;
import java.util.TreeSet;

public class Tree_Set {
    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("z");
        treeSet.add("a");
        treeSet.add("x");
        System.out.println(treeSet);
        Set<Student1> student1TreeSet= new TreeSet<>();
        student1TreeSet.add(new Student1(105,"abc",60));
        student1TreeSet.add(new Student1(101,"xyz",66));
        student1TreeSet.add(new Student1(102,"eee",664));
        System.out.println(student1TreeSet);

        Set<Student1> student1SetSortedOnMarks  = new TreeSet<>(new StudentMarksComparator());
        student1SetSortedOnMarks.add(new Student1(105,"abc",60));
        student1SetSortedOnMarks.add(new Student1(101,"xyz",66));
        student1SetSortedOnMarks.add(new Student1(102,"eee",664));
        System.out.println(student1SetSortedOnMarks);
    }
}
