package java111.sprint_3.collection_framekwork;

import java.util.Map;
import java.util.TreeMap;

public class _TreeMap {
    public static void main(String[] args) {
        Map<String,String> treeMap = new TreeMap<>();
        treeMap.put("Maharastra","Mumbai");
        treeMap.put("Telangana","Hydrabad");
        treeMap.put("Tamilnadu","Chennai");
        treeMap.put("Karnataka","Bengaluru");
        treeMap.put("Bihar","Patna");
        System.out.println(treeMap);
    }


}
