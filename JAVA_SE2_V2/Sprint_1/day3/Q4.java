package SB101_V2.Sprint_1.day3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q4 {
    public static void main(String[] args) {
        List<Integer> integerList= Arrays.asList(2,3,4,5,6,7);

     List<Integer> squredInt=   integerList.stream().map(integer -> integer*integer).collect(Collectors.toList());

        System.out.println(squredInt);

    }
}

