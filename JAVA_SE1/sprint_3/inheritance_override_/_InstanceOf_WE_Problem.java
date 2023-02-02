package java111.sprint_3.inheritance_override_;

public class _InstanceOf_WE_Problem {
    public static void main(String[] args) {
           takePerson(new Professional());
           takePerson(new Student_1());
    }
    static  void takePerson(Person person){
       if (person instanceof Professional){
         Professional prof = (Professional) person;
         prof.wfh();
       }
       if(person instanceof Student_1){
           Student_1 std=(Student_1) person;
           std.goToCollege();
       }
    }
}


class Person{}

class Professional extends Person{
     void wfh(){
         System.out.println("wfh");
     }
}

class Student_1 extends  Person{
       void goToCollege(){
           System.out.println("go to college");
       }
}