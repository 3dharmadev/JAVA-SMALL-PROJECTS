package SB_101.Sprint_2.Day5;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class File_Reader {
    public static void main(String[] args) throws IOException {
  /*       FileReader fr = new FileReader("myfile.txt");
        int ch = fr.read();
        while (ch!=-1){
            System.out.print((char) ch);
            ch=fr.read(); */
        File f = new File("myfile.txt");
        FileReader fr = new FileReader(f);
        long numOfChar = f.length();
        char[] chr = new char[(int) numOfChar];
        fr.read(chr);

        for (char ch : chr) {
            System.out.print(ch);
        }

    }
}
