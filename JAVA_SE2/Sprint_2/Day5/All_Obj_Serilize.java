package SB_101.Sprint_2.Day5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class All_Obj_Serilize {
    public static void main(String[] args) throws IOException {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"Deba","cuttack",234000));
        students.add(new Student(2,"ssk","elo",20100));
        students.add(new Student(3,"fl","ad",20200));
        students.add(new Student(4,"ele","ee",20300));
       // System.out.println(students);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("myfile.txt"));

        oos.writeObject(students);
        System.out.println("done");
    }
}
