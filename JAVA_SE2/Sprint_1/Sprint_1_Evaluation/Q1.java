package SB_101.Sprint_1.Sprint_1_Evaluation;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Q1 {
    public static void main(String[] args) {
    Predicate<Employee>  p2= s -> s.getSalary()>8000;
        System.out.println(p2.test(new Employee(1,"abc",50000)));
        Consumer<Employee>  c1 = employee -> {
            System.out.println("Employee_I id "+employee.getEmpId());
            System.out.println("Employee_I name "+employee.getName());
            System.out.println("Employee_I salary "+employee.getSalary());
        };
        c1.accept(new Employee(1,"Debabrata",5000));
        Supplier<Employee> s1 = () -> new Employee(2,"Satya",404032);

        System.out.println(s1.get());

        Function<String,Employee> f1 =s -> {
            String[] str = s.split(",",3);
            int n= Integer.parseInt(str[0]);
            int s12= Integer.parseInt(str[2]);
            return new Employee(n,str[1],s12);
        };
       Employee employee = f1.apply("10,Manoj,80000");
        System.out.println(employee);
    }
}
class Employee{
    private int empId;
    private  String Name;
    private int Salary;

    public Employee(int empId, String name, int salary) {
        this.empId = empId;
        Name = name;
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Employee_I{" +
                "empId=" + empId +
                ", Name='" + Name + '\'' +
                ", Salary=" + Salary +
                '}';
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }
}

/*What do you mean by a Functional programming and Functional interface.
Write the implementations of all the following Functional interfaces with examples
using the Lambda expression:
Predicate<Employee_I>: If the Employee_I salary is greater than 8000.
Consumer<Employee_I>: Print the Employee_I's details.
Supplier<Employee_I>: Get the Employee_I object with all details(empId, name, salary)
Function<String, Employee_I>: It takes the Employee_I details in comma separated
String format
like, String emp= “10,Manoj,80000” , (Here the details are empId, Name and
Salary) and return the Employee_I Object based on this comma separated String.*/