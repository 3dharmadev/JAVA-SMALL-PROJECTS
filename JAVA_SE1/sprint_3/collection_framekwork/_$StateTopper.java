package java111.sprint_3.collection_framekwork;
import java.util.*;

public class _$StateTopper {
    public static void main(String[] args) {
        Map<String , Student1> hm = new HashMap<>();
        hm.put("MH",new Student1(10,"Suni",910));
        hm.put("TN",new Student1(11,"Amit",930));
        hm.put("MH",new Student1(10,"Lokesh",950));
        System.out.println(hm.keySet()); //key set will give all the keys
        System.out.println(hm.values());
        for (Student1 student: hm.values()) System.out.println(student);
        hm.forEach((k,v)-> System.out.println(k+"-->"+v));

    }
}
