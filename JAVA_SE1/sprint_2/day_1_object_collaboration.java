package java111.sprint_2;

public class day_1_object_collaboration {

    public static void main(String[] args) {
        Student student = new Student();
        student.age=10;
        student.name="Debabrata Satapathy";

        Address addressOfStudent = new Address();
        addressOfStudent.city="Bangaluru";
        addressOfStudent.country="India";
        student.studentAddress=addressOfStudent;
        System.out.println(student.studentAddress.city);
    }
}

class Student{
    String name;
    int age;
    //composition : One object is made up of another object.
    Address studentAddress;


}
class Address{
    String city;
    String country;
}
class  Employee{
    String empId;
    Address EmployeeAddress;
}