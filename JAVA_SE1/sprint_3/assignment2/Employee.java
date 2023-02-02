package java111.sprint_3.assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee {
   private Integer employeeId;
   private String employeeName;
   private double employeeSalary;
   public Employee(Integer employeeId,String employeeName,double employeeSalary){
       this.employeeId=employeeId;
       this.employeeName=employeeName;
       this.employeeSalary=employeeSalary;
   }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    @Override
   public String toString(){
       return "Employee_I name->"+this.employeeName+" Employee_I Id->"+this.employeeId+" Employee_I Salary->"+this.employeeSalary;
   }
}

class  Department{
    private Integer departmentId;
    private String departmentName;
    public  Department(Integer departmentId,String departmentName){
        this.departmentId=departmentId;
        this.departmentName=departmentName;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    @Override
    public String toString(){
        return "Department Name->"+this.departmentName+" Department Id->"+this.departmentId;
    }
}
class Main_{
    public static void main(String[] args) {
        List<Employee> employees= new ArrayList<>();
        List<Department> departments= new ArrayList<>();
       System.out.println("...Welcome to Employee_I Management System....");
        add();
    }

    public static void switch_(){
        Scanner sc=new Scanner(System.in);

        System.out.println(" 1: Find Employee_I in Particular Department");
        System.out.println(" 2: Remove Particular Employee_I");
        System.out.println(" 3: Print Employees in All Departments");
        int i=sc.nextInt();

        switch (i){

            case 1: search_();
            break;
            case 2: remove_();
            break;
            case 3: print_All();
        }
        sc.close();
    }


   public static List<Employee> employees= new ArrayList<>();
   public static List<Department> departments= new ArrayList<>();

   static int count=1;
    static void add(){
        Scanner sc=new Scanner(System.in);

            System.out.println("Do you want to Enter the detail of Employee_I: ? (Y/N)\n");
            String s= sc.next();

            if(s.equals("y") || s.equals("Y")){
                System.out.println("Enter the Employee_I Details: "+count);
                System.out.println("-------------------------------");

                System.out.println("Enter the Employee_I Id:");
                int id=sc.nextInt();
                System.out.println("Enter the Employee_I Name:");
                String name=sc.next();
                System.out.println("Enter the Employee_I Salary:");
                double salary = sc.nextDouble();
                System.out.println("  Enter the Department Id:");
                int department_id = sc.nextInt();
                System.out.println(" Enter the Department Name:");
                String department_name = sc.next();
                System.out.println("Employee_I Details added successfully..\n");
                count++;

                Department department=new Department(department_id,department_name);
                Employee employee=new Employee(id,name,salary);

                employees.add(employee);
                departments.add(department);
                add();
            }
            else if(s.equals("n") || s.equals("N")){
                switch_();
            }
            else {
                System.out.println("wrong input try again");
                add();
            }
            sc.close();
    }

    static void print_All(){
        Scanner sc=new Scanner(System.in);

         for (int i=0;i<employees.size();i++){
             System.out.println("Employee_I with department details number "+(i+1));

             System.out.println(employees.get(i));
             System.out.println(departments.get(i));
             System.out.println();
         }


        System.out.println("Do you want to Exit: ? (Y/N)");
        String str= sc.next();
        if(str.equals("n") || str.equals("N")){
            switch_();
        }
        else {
            return;
        }
        sc.close();

    }

    static void search_(){
         Scanner sc=new Scanner(System.in);

        System.out.println("Enter Department Id:");
        int id_d=sc.nextInt();
        System.out.println(" Enter the Employee_I Id:");
        int emp_id = sc.nextInt();
         for (int i=0;i<departments.size();i++){
           Employee employee=  employees.get(i);
             if((departments.get(i).getDepartmentId().equals(id_d)) &&
              (employees.get(i).getEmployeeId().equals(emp_id))){
                 System.out.println("employee name ->"+employees.get(0).getEmployeeName()+" Present");
                       break;
             }
         }
        System.out.println("Do you want to Exit: ? (Y/N)");
        String str= sc.next();
        if(str.equals("n") || str.equals("N")){
            switch_();
        }
        else {
            return;
        }
        sc.close();
    }
    static void remove_(){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Department Id:");
        int id_d=sc.nextInt();
        System.out.println(" Enter the Employee_I Id:");
        int emp_id = sc.nextInt();
        for (int i=0;i<departments.size();i++){
            Employee employee=  employees.get(i);
            if((departments.get(i).getDepartmentId().equals(id_d)) &&
                    (employees.get(i).getEmployeeId().equals(emp_id))){
                System.out.println("remove successfully");
                employees.remove(i);
             break;
            }
        }
        System.out.println("Do you want to Exit: ? (Y/N)");
        String str= sc.next();
        if(str.equals("n") || str.equals("N")){
            switch_();
        }
        else {
            return;
        }
        sc.close();
    }



}
/* Employee_I Management System :
Create java bean class Employee_I with following members:
employeeId: Integer
employeeName: String
employeeSalary: double
department Department
Create java bean class Department with following members:
departmentId: Integer
departmentName: String
Create Main class, inside this class create one Collection of Employee_I to store the
employee object. And you have to implement the following functionality.
CASE 1:
...Welcome to Employee_I Management System....
Do you want to Enter the detail of Employee_I: ? (Y/N)
y*/
    /*
Enter the Employee_I Details: 1
-------------------------------
Enter the Employee_I Id:
12
Enter the Employee_I Name:
anand
Enter the Employee_I Salary:
1000
Enter the Department Id:
1
Enter the Department Name:
A
Employee_I Details added successfully..
Do you want to Enter the detail of Employee_I: ? (Y/N)
y
Enter the Employee_I Details: 2
-------------------------------
Enter the Employee_I Id:
12
Enter the Employee_I Name:
anand
Enter the Employee_I Salary:
1000
Enter the Department Id:
1
Enter the Department Name:
A
Employee_I Details added successfully..
Do you want to Enter the detail of Employee_I: ? (Y/N)
n
Thank you---
Enter the your choice
1: Find Employee_I in Particular Department
2: Remove Particular Employee_I
3: Print Employees in All Departments
3
Employee_I [id=12, name=anand, salary=1000.0, department=Department [departmentId=1,
departmentName=A]]
---------------------------------
Do you want to Exit: ? (Y/N)
y
Thank you---
*/
/*
CASE 2:
...Welcome to Employee_I Management System....
Do you want to Enter the detail of Employee_I: ? (Y/N)
Y
Enter the Employee_I Details: 1
-------------------------------
Enter the Employee_I Id:
10
Enter the Employee_I Name:
anand
Enter the Employee_I Salary:
20000
Enter the Department Id:
1
Enter the Department Name:
A
Employee_I Details added successfully..
Do you want to Enter the detail of Employee_I: ? (Y/N)
y
Enter the Employee_I Details: 2
-------------------------------
Enter the Employee_I Id:
23
Enter the Employee_I Name:
shivam
Enter the Employee_I Salary:
90000
Enter the Department Id:
1
Enter the Department Name:
B
Employee_I Details added successfully..
Do you want to Enter the detail of Employee_I: ? (Y/N)
y
Enter the Employee_I Details: 3
-------------------------------
Enter the Employee_I Id:
13
Enter the Employee_I Name:
krutika
Enter the Employee_I Salary:
35000
Enter the Department Id:
1
Enter the Department Name:
A
Employee_I Details added successfully..
Do you want to Enter the detail of Employee_I: ? (Y/N)
y
Enter the Employee_I Details: 4
-------------------------------
Enter the Employee_I Id:
45
Enter the Employee_I Name:
mohit
Enter the Employee_I Salary:
31000
Enter the Department Id:
5
Enter the Department Name:
D
Employee_I Details added successfully..
Do you want to Enter the detail of Employee_I: ? (Y/N)
n
Thank you---
Enter the your choice
1: Find Employee_I in Particular Department
2: Remove Particular Employee_I
3: Print Employees in All Departments
3
Employee_I [id=45, name=mohit, salary=31000.0, department=Department [departmentId=5,
departmentName=D]]
---------------------------------
Employee_I [id=23, name=shivam, salary=90000.0, department=Department [departmentId=1,
departmentName=B]]
---------------------------------
Employee_I [id=10, name=anand, salary=20000.0, department=Department [departmentId=1,
departmentName=A]]
---------------------------------
Employee_I [id=13, name=krutika, salary=35000.0, department=Department [departmentId=1,
departmentName=A]]
---------------------------------
Do you want to Exit: ? (Y/N)
n
Enter the your choice
1: Find Employee_I in Particular Department
2: Remove Particular Employee_I
3: Print Employees in All Departments
1
Enter the Department Id:
1
Employee_I in Department: 1
Employee_I Name: shivam
Employee_I Id: 23
Employee_I Salary: 90000.0
=================================
Employee_I Name: anand
Employee_I Id: 10
Employee_I Salary: 20000.0
=================================
Employee_I Name: krutika
Employee_I Id: 13
Employee_I Salary: 35000.0
=================================
Do you want to Exit: ? (Y/N)
y
Thank you---
CASE: 3
...Welcome to Employee_I Management System....
Do you want to Enter the detail of Employee_I: ? (Y/N)
y
Enter the Employee_I Details: 1
-------------------------------
Enter the Employee_I Id:
1
Enter the Employee_I Name:
shivam arora
Enter the Employee_I Salary:
34000
Enter the Department Id:
1
Enter the Department Name:
B
Employee_I Details added successfully..
Do you want to Enter the detail of Employee_I: ? (Y/N)
y
Enter the Employee_I Details: 2
-------------------------------
Enter the Employee_I Id:
23
Enter the Employee_I Name:
anand
Enter the Employee_I Salary:
23000
Enter the Department Id:
3
Enter the Department Name:
B
Employee_I Details added successfully..
Do you want to Enter the detail of Employee_I: ? (Y/N)
n
Thank you---
Enter the your choice
1: Find Employee_I in Particular Department
2: Remove Particular Employee_I
3: Print Employees in All Departments
3
Employee_I [id=23, name=anand, salary=23000.0, department=Department [departmentId=3,
departmentName=B]]
---------------------------------
Employee_I [id=1, name=shivam, salary=34000.0, department=Department [departmentId=1,
departmentName=B]]
---------------------------------
Do you want to Exit: ? (Y/N)
n
Enter the your choice
1: Find Employee_I in Particular Department
2: Remove Particular Employee_I
3: Print Employees in All Departments
2
Enter Department Id:
1
Enter the Employee_I Id:
1
shivam Employee_I is removed from the department 1 successfully.
Do you want to Exit: ? (Y/N)
n
Enter the your choice
1: Find Employee_I in Particular Department
2: Remove Particular Employee_I
3: Print Employees in All Departments
3
Employee_I [id=23, name=anand, salary=23000.0, department=Department [departmentId=3,
departmentName=B]]
---------------------------------
Do you want to Exit: ? (Y/N)
n
Enter the your choice
1: Find Employee_I in Particular Department
2: Remove Particular Employee_I
3: Print Employees in All Departments
2
Enter Department Id:
3
Enter the Employee_I Id:
23
anand Employee_I is removed from the department 3 successfully.
Do you want to Exit: ? (Y/N)
n
Enter the your choice
1: Find Employee_I in Particular Department
2: Remove Particular Employee_I
3: Print Employees in All Departments
3
Employee_I doesn't exists..
Do you want to Exit: ? (Y/N)
y
Thank you---
*/