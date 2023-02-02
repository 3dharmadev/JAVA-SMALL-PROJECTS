package SB_101.Sprint_2.Day5;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterr {
    public static void main(String[] args) throws IOException {
        FileWriter fw =new FileWriter("myfile1.txt");
        fw.write(97);
        fw.write("\n");
        char[] chr ={'a','b','c'};
        fw.write(chr);
        fw.write("\n");
        fw.write("Hello");
        fw.write("\n");
        fw.flush();
         fw.close();

    }
}
