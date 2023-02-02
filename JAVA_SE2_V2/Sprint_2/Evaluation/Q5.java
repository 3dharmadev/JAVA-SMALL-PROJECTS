package SB101_V2.Sprint_2.Evaluation;

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
