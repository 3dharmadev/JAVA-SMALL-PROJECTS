package SB_101.Sprint_1.Day1;

import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        //TreeSet<Student> list=new TreeSet<>(new Comparator_Marks());
        List<Student> list=new ArrayList<>();
        list.add(new Student(1,"deba","cuttack",560));
        list.add(new Student(1,"deba","cuttack",560));
        list.add(new Student(1,"deba","cuttack",560));
        list.add(new Student(1,"deba","cuttack",560));
        list.add(new Student(1,"deba","cuttack",560));
        list.add(new Student(6,"deba","Bhubaneswar",560));
        list.add(new Student(7,"deba","cuttack",510));

        Set<Student> set = new HashSet<>(list);
        list.clear();
        list.addAll(set);
        Collections.sort(list,new Comparator_Marks());
        System.out.println(list);

    }

}
class Student{
    private int roll;
    private String name;
    private String address;
    private int marks;

    public Student(int roll, String name, String address, int marks) {
        this.roll = roll;
        this.name = name;
        this.address = address;
        this.marks = marks;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
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

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", marks=" + marks +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        if(obj instanceof Student)
        {
            Student temp = (Student) obj;
            if(this.roll==temp.roll&& this.name.equals(temp.name) && this.address.equals(temp.address) && this.marks==temp.marks)
                return true;
        }
        return false;
    }

     @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return ( this.name.hashCode() + this.address.hashCode() );
    }
}



/*Consider the following bean class:
Student:
roll: int
name: String
address: String
marks: int
Day1 Assignment 2
 Create a List of 5 Student objects with proper details.
 Remove the duplicate Student object from the List.
Sort the List of Students according to their marks, and if the marks are the same
then
sort them according to their name.
Print all the Student details from the List of Student object.
*/
class Comparator_Marks implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getMarks()>o2.getMarks()){
            return 1;
        }
        else if(o1.getMarks()<o2.getMarks()){
            return -1;
        }
        else{
           return o1.getName().compareTo(o2.getName());
        }
    }
}