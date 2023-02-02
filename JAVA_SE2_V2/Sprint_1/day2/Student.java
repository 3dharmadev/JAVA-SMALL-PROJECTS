package SB101_V2.Sprint_1.day2;

public class Student {
    private  int marks;
    private  String name;
    private  int roll;

    public Student(int marks, String name, int roll) {
        this.marks = marks;
        this.name = name;
        this.roll = roll;
    }

    public Student( Student student) {
        System.out.println( "Student{" +
                "marks=" + marks +
                ", name='" + name + '\'' +
                ", roll=" + roll +
                '}');
    }

    public Student() {
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }


    public  void studentDetails(Student student) {
        System.out.println( "Student{" +
                "marks=" + marks +
                ", name='" + name + '\'' +
                ", roll=" + roll +
                '}');

    }

    @Override
    public String toString() {
        return "Student{" +
                "marks=" + marks +
                ", name='" + name + '\'' +
                ", roll=" + roll +
                '}';
    }
}
