package SB101_V2.Sprint_1.day2;

import java.util.Arrays;
import java.util.List;

public class Q3 {
    public static void main(String[] args) {
        List<String> cities= Arrays.asList("Cuttack","Bhubaneswar","Puri","Chilika","Kolkata");
        //  PrintList pl = (list) ->{for (String city:list) System.out.println(city);};

        PrintList ps= city -> {
            for (String c:city) System.out.println(c);
        };
       ps.display(cities);
    }



}
