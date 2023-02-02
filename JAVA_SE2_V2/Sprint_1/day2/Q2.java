package SB101_V2.Sprint_1.day2;

public class Q2 {

    public static void main(String[] args) {
       // Demo2 d2 = new Student()::studentDetails; //using non static

     //   Demo2 d2 = Student::studentDetails; // make the same method static

        Demo2 d2 = Student::new; //using constructor

     d2.printDetail(new Student(950,"Debabrata",629));

    }
}

