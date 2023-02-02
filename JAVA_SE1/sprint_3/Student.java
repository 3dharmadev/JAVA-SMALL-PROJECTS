package java111.sprint_3;

/*
 a. Create a Student JavaBean class with the following fields:
name: String, marks: Integer
b. Create a Main class and perform the following operation in it’s main method:
Get the number of students from the user and store the students in some data
structure.
c. Initialise all the student objects by taking details from the user, use
parameterized constructors (and not the setters).
d. Print all the Student objects (use the toString() method).
e. Print the average of all the Student marks.
*/

import java.util.Scanner;

public class Student {

   private String name;
   private Integer marks;

   public Student(String name,Integer marks){
       this.name=name;
       this.marks=marks;
   }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}

class  Main_C{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of student you want to create");
          int size  = sc.nextInt();
        sc.nextLine();
        int average=0;
          Student[] student=new Student[size];

          for (int i=0;i<size;i++){
              System.out.println("Enter name ");
              String name=sc.nextLine();

              System.out.println("Enter marks");
              Integer marks=sc.nextInt();
              average+=marks;

             student[i]=new Student(name,marks);
              sc.nextLine();
          }
          for (int i=0;i<size;i++){
              System.out.println(student[i]);
          }

        System.out.println("Average of marks "+average/size);

    }
}
