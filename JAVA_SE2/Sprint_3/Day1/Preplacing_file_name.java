package SB_101.Sprint_3.Day1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class Preplacing_file_name {
    public static void main(String[] args) throws Exception {
        Path p = Paths.get("nio1.txt");

        Stream<String> str= Files.lines(p);

        str.map(line -> {
            if(line.contains("mumbai"))
                return line.replace("mumbai","hello mumbai");
            else return line;
        }).forEach(s -> System.out.println(s));




    }
}
