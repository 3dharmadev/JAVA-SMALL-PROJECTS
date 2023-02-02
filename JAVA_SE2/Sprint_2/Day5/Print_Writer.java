package SB_101.Sprint_2.Day5;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Print_Writer {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("myfile.txt");
        pw.println(true);
        pw.println("hello");
        pw.println();
        pw.flush();
        pw.close();
        System.out.println("done");
    }
}
