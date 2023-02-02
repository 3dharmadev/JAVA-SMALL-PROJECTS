package SB101_V2.Sprint_1.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
 

import java.util.Set;
 

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Map<String, Student> studentMap= new HashMap<>();
       
       studentMap.put("India", new Student(12,"Debabrata","dbsatapathy373@gmail.com",450));
       studentMap.put("USA", new Student(13,"Ram","rama@gmail.com",460));
       studentMap.put("UK", new Student(14,"Krishna","dbsatapathy373@gmail.com",1200));
       studentMap.put("AUS", new Student(15,"Satyam","dbsatapathy373@gmail.com",1350));
       studentMap.put("Bangladesh", new Student(16,"Sadashiva","dbsatapathy373@gmail.com",200));
       studentMap.put("JAP", new Student(17,"Rudra","dbsatapathy373@gmail.com",762));
       
      // studentMap.forEach((k,v)->System.out.println("country details-"+k+" student details-"+v));
       
     Set<Entry<String,Student>>  entrySet = studentMap.entrySet();
     
     List<Entry<String, Student>> list = new ArrayList<>(entrySet);
     
     Collections.sort(list, (  o1,  o2) ->  o2.getValue().getName().compareTo(o1.getValue().getName()));

        for (Entry<String, Student> stringStudentEntry : list) {
            System.out.println(stringStudentEntry);
        }

       
       
       
	}

}
