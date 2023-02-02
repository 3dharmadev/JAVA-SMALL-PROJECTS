package SB_101.Sprint_3.Day1;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class Nio_Package_create_file {
    public static void main(String[] args) throws IOException {
        Path p = Paths.get("nio1.txt");

        if(Files.exists(p)){
            System.out.println("File is already exist");
        }
        else{
            Path p2 = Files.createFile(p);
            System.out.println("created a file at: "+p2);
        }
        String msg = "Hello i am here";
        Files.write(p,msg.getBytes());

        List<String> list = Arrays.asList("delhi","mumbai","kolkata","chennai");
        Files.write(p,list);

        Files.write(p,list, StandardOpenOption.APPEND);
        System.out.println("done ");
    }
}
