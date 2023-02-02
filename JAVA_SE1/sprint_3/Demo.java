package java111.sprint_3;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of student object you want create");
        int size=sc.nextInt();
        sc.nextLine();

        Student_bean[] student_bean= new Student_bean[size];

        for (int i=0;i<size;i++){
            student_bean[i]=new Student_bean();

            System.out.println("Enter name of student"+" No.- "+(i+1));
            String name=sc.nextLine();
            student_bean[i].setName(name);

            System.out.println("Enter Roll number of student"+" No.- "+(i+1));
            int roll=sc.nextInt();
            student_bean[i].setRoll(roll);

            sc.nextLine();
            System.out.println("Enter address of the student"+" No.- "+(i+1));
            String address=sc.nextLine();
            student_bean[i].setAddress(address);

            System.out.println("Enter total marks of the student"+" No.- "+(i+1));
            int marks=sc.nextInt();
            student_bean[i].setMarks(marks);
            sc.nextLine();
        }
     int Average = 0;
    for (int i=0;i<size;i++){
         String name=  student_bean[i].getName();
         int roll= student_bean[i].getRoll();
         String address=student_bean[i].getAddress();
         int total_marks=student_bean[i].getMarks();
        Average+=total_marks;
        System.out.println("Student"+(i+1)+"Name- "+name+"  Roll Number- "+roll+"  Address- "+address+"  Marks- "+total_marks);

    }

        System.out.println("Average of total student marks"+Average/size);
     sc.close();
    }
}

