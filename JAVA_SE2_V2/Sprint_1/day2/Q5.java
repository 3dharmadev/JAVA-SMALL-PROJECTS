package SB101_V2.Sprint_1.day2;



import java.util.*;
import java.util.stream.Collectors;

public class Q5 {
    public static void main(String[] args) {
        Map< Student,String> studentMap= new HashMap<>();


        studentMap.put( new Student(61,"a",101),"India");
        studentMap.put( new Student(230,"b",11),"India");
        studentMap.put(new Student(340,"c",9),"UK");
        studentMap.put( new Student(510,"d",6),"AUS");
        studentMap.put(new Student(520,"e",7),"Bangladesh");

        Set<Map.Entry<Student,String>> entrySet = studentMap.entrySet();

        List<Map.Entry<Student,String>> list = new ArrayList<>(entrySet);

        Collections.sort(list, (o1, o2) ->o2.getKey().getName().compareTo(o1.getKey().getName()));

        for (Map.Entry<Student,String> set: list) {
            System.out.println(set);
        }


        //another way

        Map<Student, String > sortedNewMap = studentMap.entrySet().stream().sorted((o1,o2)-> o2.getKey().getName().compareTo(o1.getKey().getName()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println(sortedNewMap);






//
//        Set<Map.Entry<String, SB101_V2.Sprint_1.day1.Student>>  entrySet = studentMap.entrySet();
//
//        List<Map.Entry<String, SB101_V2.Sprint_1.day1.Student>> list = new ArrayList<>(entrySet);
//
//        Collections.sort(list, (  o1,  o2) ->  o2.getValue().getName().compareTo(o1.getValue().getName()));
//
//        for (Map.Entry<String, SB101_V2.Sprint_1.day1.Student> stringStudentEntry : list) {
//            System.out.println(stringStudentEntry);
//        }


    }
}
