package SB_101.Sprint_2.Evaluation2;

import java.io.*;
import java.util.stream.Stream;

public class Q5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("myfile1.txt"));
        PrintWriter pw = new PrintWriter("myfile2.txt");

        Stream<String> str = br.lines();
        str.forEach(line-> pw.println(line));
        pw.flush();
        pw.close();
        br.close();



    }
}

/* Write a Java program to read a text file using BufferedReader class and write those
text to another file using PrintWriter class.
*/