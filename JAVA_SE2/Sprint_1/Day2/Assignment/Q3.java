package SB_101.Sprint_1.Day2.Assignment;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;


public class Q3 {
    public static void main(String[] args) {
         Map<String,Student> map = new HashMap<>();
         map.put("India",new Student(12,"Debabrata",6000));
        map.put("Australia",new Student(15,"Rohit Sharma",5057));
        map.put("England",new Student(14,"Virat Kohli",5055));
        map.put("Pakistan",new Student(42,"Ram",6606));
        map.put("Saudi Arabia",new Student(132,"Surya kumar yadav",5052));

        Map<String,Student> sortedNewMap = map.entrySet().stream().sorted(Comparator.comparing(e -> e.getValue().getName()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));
        sortedNewMap.forEach((key,val)->System.out.println(key+ " = "+ val.toString()));

    }
//    //public Map<String, Student> sortMapUsingStudentName(Map<String, Student> originalMap){
//    return null;
//    }
}
  class Student{
    private int roll;
    private  String name;
    private int marks;

    public Student(int roll, String name, int marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}



/*Sort the following Map by its value (by Student name in descending order),
using
Lambda expressions. In this Map key will be Country name and value will be the
Student
object.
public Map<String, Student> sortMapUsingStudentName(Map<String, Student> originalMap);
Student class
roll
name
email
marks
Call the above method by passing a HashMap object with 5 entries
Print all the student details belonging from each country.
*/