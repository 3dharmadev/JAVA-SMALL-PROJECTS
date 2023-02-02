package SB_101.Sprint_1.Day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q3_1 {
    //Create a List of cities and sort them in descending order using Lambda
    //Expression
    public static void main(String[] args) {
        List<String> list =new ArrayList<>();
        list.add("bengaluru");
        list.add("cuttack");
        list.add("bhubaneswar");
        list.add("dhabaleswar");

       // list.sort(Comparator.naturalOrder());
        Collections.sort(list);
        System.out.println(list);

    }
}
