package java111.sprint_3.collection_framekwork;

import java.util.HashMap;
import java.util.Map;

public class _HashMap {
    public static void main(String[] args) {
        Map<Integer,String> hm = new HashMap<>();
        hm.put(1,"one");
        hm.put(2,"two");
        hm.put(2,"new value");
        hm.forEach((k,v)-> System.out.println(k+"-->"+v));
    }

}
