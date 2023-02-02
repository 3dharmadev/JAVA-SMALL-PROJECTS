package SB101_V2.Sprint_1.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Q1 {

	public static void main(String[] args) {
		 
       List<Employee> list=new ArrayList<>();
       
       list.add( new Employee(1, "Debabrata", "Cuttack",120000));
       list.add( new Employee(2, "Satyabrata", "hyderabad",13000));
       list.add( new Employee(3, "Ankit", "Delhi",13430));
       list.add( new Employee(4, "Kunal", "Mumbai",1339));
       list.add( new Employee(5, "Suvendu", "Bhubaneswar",3393));
       list.add( new Employee(6, "Ram", "Ayodha",1020201));
       list.add( new Employee(7, "Shyam", "Puri",2022));
       list.add( new Employee(8, "Deba", "Cuttack",1111));
       list.add( new Employee(9, "reva", "Cuttack",1112));
       list.add( new Employee(10, "Satya", "Sundaragada",15000));
       

       
    //   List<Employee> updatedSalary = list.stream().filter(l -> l.getSalary()<5000).map(s-> new Employee(s.getEmpId(),s.getName(),s.getAddress(),s.getSalary()+1000)).collect(Collectors.toList());
       
       Predicate<Employee> p2 = s -> s.getSalary()< 5000;
        
        
        list.forEach( (employee) ->{
        		
         employee.setSalary(p2.test(employee) ?	 employee.getSalary()+1000:employee.getSalary());
    	
        });
        
        
        
     list.forEach((emp)-> System.out.println(emp));
        
       
	}

}

 










