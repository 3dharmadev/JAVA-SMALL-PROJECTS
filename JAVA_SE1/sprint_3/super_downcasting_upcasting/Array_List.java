package java111.sprint_3.super_downcasting_upcasting;

import java.util.ArrayList;
import java.util.List;

public class Array_List {
    public static void main(String[] args) {
        List<Integer> integerList=new ArrayList<>();
        for (int i=0;i<=20;i++){
            integerList.add(i);
        }
        System.out.println(integerList);
        System.out.println(integerList.size());
        System.out.println(integerList.toArray());
        System.out.println(integerList.remove(3));
        System.out.println(integerList);

        for (Integer i: integerList) {
            System.out.println(i);
        }
        integerList.forEach(item-> System.out.println(item));
        System.out.println(integerList.contains(1));
        integerList.clear();

        System.out.println(integerList);


    }

}
