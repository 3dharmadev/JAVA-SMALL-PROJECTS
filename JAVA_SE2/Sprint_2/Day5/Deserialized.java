package SB_101.Sprint_2.Day5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class Deserialized {
    public static void main(String[] args) throws  Exception  {
        FileInputStream fis = new FileInputStream("myfile.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
      /* A obj = (A) ois.readObject();
        int i = (Integer) ois.readObject();
        System.out.println(i);
       obj.funA(); */
        List<Student> student= ( List<Student>)  ois.readObject();
        System.out.println(student);

    }
}
