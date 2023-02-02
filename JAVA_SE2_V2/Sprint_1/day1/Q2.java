package SB101_V2.Sprint_1.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Create a List of cities and sort them in descending order using Lambda Expression.
		
		List<String> cities= new ArrayList<>();
		
		cities.add("Washington DC");
		cities.add("Patna");
		cities.add("Cuttack");
		cities.add("New York");
		cities.add("Mumbai");
		
		Collections.sort(cities,(s1,s2)-> s1.compareTo(s2));
		
		System.out.println(cities);
		
		
		
	}

}
