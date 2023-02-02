package SB_101.Sprint_2.Day5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;

public class Buffered_Reader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("myfile.txt"));

     /*   String line = br.readLine();
        while(line != null){
            System.out.println(line);
            line = br.readLine();
        } */
       /* Stream<String> str = br.lines();
        str.forEach(line-> System.out.println(line)); */
       // br.lines().forEach(System.out::println);
        br.lines().filter(line -> line.contains("abc")).forEach(System.out::println);
  br.close();
    }
}
