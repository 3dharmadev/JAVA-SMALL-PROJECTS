package SB_101.Sprint_2.Evaluation2;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Q4 {
    public static void main(String[] args) throws IOException {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1,"Debabrata",120000,"dbsatapathy373@gmail.com","rock1232",new Address("Odisha","Cuttack","753014")));
        employeeList.add(new Employee(2,"Satya",1200020,"dbe73@gmail.com","rock1232",new Address("Odisha","BBSR","751014")));
        employeeList.add(new Employee(3,"ram",120010,"dbsatapathy373@gmail.com","rock1232",new Address("Odisha","Cuttack","753014")));
        employeeList.add(new Employee(5,"sd",1223,"dbsatawwwlhy373@gmail.com","ro3332",new Address("Odisha","Cuttack","753014")));
        employeeList.add(new Employee(6,"wqq",1200,"dbsat3@gmail.com","rock32",new Address("Odisha","Cuttack","753014")));


        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employeedata.txt"));

        oos.writeObject(employeeList);



    }
}

/*Consider the following Bean classes:

```java
class Address{
state: String
city: String
pincode: String
}
class Employee{
empId: int
empName: String
salary: int
email: String
password: String
address: Address //has-A relationship
}
```

Inside the Demo1 class Serialize the List of 5 Employee objects with all details
inside a file called “employeedata.txt”
● Make sure that the employee’s password should not be serialized.
● Inside the Demo2 class Deserialize the List of Employees from the “employeedata.txt”
● After Deserialization, add one more Employee object inside that List and
Serialize it back to the “employeedata.txt” file.
*/
class Address implements Serializable{
   private String  state;
   private String city;
   private  String pincode;

   public Address(String state, String city, String pincode) {
      this.state = state;
      this.city = city;
      this.pincode = pincode;
   }

   @Override
   public String toString() {
      return "Address{" +
              "state='" + state + '\'' +
              ", city='" + city + '\'' +
              ", pincode='" + pincode + '\'' +
              '}';
   }
}

class Employee implements Serializable{
  private int  empId;
  private String  empName;
 private int   salary;
   private String email;
  transient  String  password;
     Address address;//has-A relationship

   public Employee(int empId, String empName, int salary, String email, String password, Address address) {
      this.empId = empId;
      this.empName = empName;
      this.salary = salary;
      this.email = email;
      this.password = password;
      this.address = address;
   }

   @Override
   public String toString() {
      return "Employee_I{" +
              "empId=" + empId +
              ", empName='" + empName + '\'' +
              ", salary=" + salary +
              ", email='" + email + '\'' +
              ", password='" + password + '\'' +
              ", address=" + address +
              '}';
   }
}