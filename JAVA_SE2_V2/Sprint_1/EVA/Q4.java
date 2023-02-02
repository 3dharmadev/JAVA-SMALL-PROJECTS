package SB101_V2.Sprint_1.EVA;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q4 {

    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(2,3,4,5);

                List<String> names = Arrays.asList("Collection","Stream","Reflection");
        List<String> result = names.stream().sorted((o1, o2) -> o2.compareTo(o1)).collect(Collectors.toList());
        System.out.println(names);

        List<String> id = Arrays.asList("aaam","ajjaa","Miiaia");
             List<String> output = id.stream().filter(s -> s.startsWith("M")).collect(Collectors.toList());

        System.out.println(output);



    }
}
