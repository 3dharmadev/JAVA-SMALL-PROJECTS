package java111.sprint_3.collection_framekwork;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class _LinkedHashSet {
    public static void main(String[] args) {
        HashSet<String> hs=new HashSet<>();
        hs.add("Delhi");
        hs.add("Mumbai");
        hs.add("Chennai");
        hs.add("Pune");
        hs.add(null);
        hs.add("Bengaluru");
        System.out.println(hs);

        LinkedHashSet lhs=new LinkedHashSet<>();

        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Chennai");
        lhs.add("Pune");
        lhs.add(null);
        lhs.add("Bengaluru");
        System.out.println(lhs);
    }
}
