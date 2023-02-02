package SB_101.Sprint_1.Day1;

import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 1 , 2 or 3");
        int input=sc.nextByte();

        TreeSet<Employee> set;
       if(input==1){
         set=new TreeSet< >(new Comparator_empId());
       } else if (input==2) {
          set=new TreeSet< >(new Comparator_Address());
       }
       else if(input==3){
        set=new TreeSet< >(new Comparator_salary());
       }
       else {
           System.out.println("Enter a valid number");
           return;
       }

        set.add(new Employee(3,"Debabrata","Cuttack",12000));
        set.add(new Employee(4,"Satya","Bhubaneswar",11500));
        set.add(new Employee(1,"ankit","Kolkata",10000));
        set.add(new Employee(2,"Kunal","Mumbai",11000));
        set.add(new Employee(5,"Megha","Bengaluru",1000));
        set.add(new Employee(7,"Megha2","Bengaluru1",1000));
        set.add(new Employee(6,"ankita","Kolkata",1200));
        for (Employee emp:
             set) {
            System.out.println(emp);
        }
        sc.close();
    }
}

class Employee{
    private int empId;
   private String empName;
    private String address;
    private int salary;

    public Employee(int empId, String empName, String address, int salary) {
        this.empId = empId;
        this.empName = empName;
        this.address = address;
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee_I{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }


}

/*- Consider the following bean class:
Employee_I
empId: int
empName: String
address: String
salary: int
 Add 6 Employee_I objects inside the TreeSet class with proper details.
 Write a program to take the input from the user.
 If the user enters 1 then sort the Employee_I by using its empId
 If the user enters 2 then sort the Employees using their address.
If the User enters 3 then sort the Employee_I using their Salary, and if the salary is
the
same for 2 Employee_I then sort them using their name.*/
class Comparator_empId implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
      if(o1.getEmpId() > o2.getEmpId()){
          return 1;
      }
      else if(o1.getEmpId() < o2.getEmpId()){
          return -1;
      }
      else {
          return 0;
      }
    }
}
class Comparator_Address implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getAddress().compareTo(o2.getAddress());
    }
}

class Comparator_salary implements Comparator<Employee>{
 boolean flag=false;
    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.getSalary()  > o2.getSalary()){
            return 1;
        }
        else if(o1.getSalary() < o2.getSalary()){
            return -1;
        }
        else {
            return o1.getEmpName().compareTo(o2.getEmpName());
        }
    }
}