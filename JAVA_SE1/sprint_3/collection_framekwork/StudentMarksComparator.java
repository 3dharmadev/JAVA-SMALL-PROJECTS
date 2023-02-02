package java111.sprint_3.collection_framekwork;
import java.util.Comparator;

public class StudentMarksComparator implements  Comparator<Student1> {

    @Override
    public int compare(Student1 s1,Student1 s2){
        if(s1.getMarks()>s2.getMarks())return 1;
        else if(s1.getMarks()<s2.getMarks()) return -1;
        else return 0;
    }

}
