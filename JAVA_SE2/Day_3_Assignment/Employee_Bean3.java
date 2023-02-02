package SB_101.Day_3_Assignment;

public class Employee_Bean3 {
   private int eid;
   private  String name;
   private String address="India";
   private int salary;


    public Employee_Bean3() {
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return "Employee_Bean3{" +
                "eid=" + eid +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}

/* create table Employee3( eid int primary key ,
name varchar(15) ,
address varchar(15) ,
salary int );*/