package SB_101.Sprint_2.Day5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Buffered_Writer {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("myfile.txt"));
        bw.write("hello");
        bw.newLine();
        bw.write("Welcome");
        bw.flush();
       bw.close();
        System.out.println("Done...");
    }
}
