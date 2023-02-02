package SB_101.Sprint_1.Day3.Assignment;

import java.util.ArrayList;
import java.util.List;

public class Q3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(405);
        list.add(3332);
        list.add(499);
        list.add(333);

 List<Integer> list1 = new ArrayList<>();
        for (Integer i: list) {
            int j=i*i;
            list1.add(j);
        }

       for(int i=0;i<list1.size();i++){
           System.out.println("list 1 "+list.get(i)+" square is "+list1.get(i));
        }
    }
}

/*Create a List of Integers and Map each integer to their square inside another
List.
Print both the List using Lambda expressions.
*/