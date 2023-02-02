package SB_101.Day_3_Assignment;

import java.util.Scanner;

public class Exe_Class {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
//        System.out.println("Enter id ");
//        System.out.println("Enter name");
//        System.out.println("Enter Salary");

        Employee3 employee3=new Employee3_Impl();
        //System.out.println(employee3.Add_Employee_Without_Address(sc.nextInt(),sc.next(), sc.nextInt()));


//      List<Employee_Bean3> list= employee3.All_Employee_Details();
//        System.out.println(list);

      //  System.out.println(employee3._all_Employee_Salary_Less_Than_80k());

//        System.out.println("Enter id ");
//        System.out.println(employee3.Search_Employee(sc.nextInt()));

     //   System.out.println(employee3.bounus_Add_500());

        System.out.println("Enter id ");
        System.out.println(employee3.GetSalary(sc.nextInt()));



    }
}

/*
* Question:
Create the Database and tables as follows:

create database db3;
 create table Employee3( eid int primary key ,
name varchar(15) ,
address varchar(15) ,
salary int );

Create DAO pattern and solve this question, Get input from user
using Scanner class and use Prepared Statement to do the
following :

● Develop a JDBC application to get the salary of a particular employee, whose Id is given
by the user.
● Develop a JDBC application to get all employee’s all details from the table
● Develop a JDBC application to provide the bonus to all the employees as 500/.
● Develop a JDBC application to insert employee details without address, input should be
given by the user.
● Develop a JDBC application to search Employees based on Id.
● Develop a JDBC application to list out all the Employee Details whose salary is less than
80000;
* */