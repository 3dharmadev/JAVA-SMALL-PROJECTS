package java111.sprint_3.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _Lower_Bound {
    public static  void addNumbers(List<? super Integer> list){
        for (Object n: list) {
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
           List<Integer> list = Arrays.asList(1,2,3,4);
           addNumbers(list);
        List<Number> d = Arrays.asList(11.2,22.222,33.22,43.22);
        System.out.println("displaying the number values");
        addNumbers(d);
        List<String> str = Arrays.asList("11.2,22.222,33.22,43.22");
//        System.out.println("displaying the str values");
//        addNumbers(str);

        List<Object> obj= new ArrayList<>();
        addNumbers(obj);
    }
}
