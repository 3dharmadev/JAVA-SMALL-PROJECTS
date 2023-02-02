package SB_101.Sprint_2.Day5;

import java.io.*;

public class A implements Serializable{
    int i=10;
    public void funA(){
        System.out.println("inside A");
        System.out.println("value is"+i);
    }
}

class Main_a{
    public static void main(String[] args) throws IOException {
        A a1 =new A();
        ObjectOutputStream fos = new ObjectOutputStream(new FileOutputStream("myfile.txt"));
           fos.writeObject(a1);
           fos.writeObject(10);
        System.out.println("done");
    }
}