package java111.sprint_3.collection_framekwork;

import java.util.*;

public class Set_ {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        Integer[] arr={1,2,3,6,5,4,1};
        Integer [] arr2={7,8,9,10};
        Collections.addAll(set, arr);
        Collections.addAll(set, arr2);
        System.out.println(set);
//        set.add("a");
//        set.add("b");
//        set.add("a");
//        set.add("c");
//        System.out.println(set);
//        Object[] array= set.toArray();
//       System.out.println(Arrays.toString(array));
//       set.clear();
//        System.out.println(set);
//        System.out.println("a".hashCode());
    }
}
