package java111.sprint_3.collection_framekwork;

public class Student1 implements Comparable <Student1>{
    private int roll;
    private  String name;
    private int marks;
    public Student1(int roll,String name,int marks){
        this.roll=roll;
        this.name=name;
        this.marks=marks;
    }


    @Override
    public int compareTo(Student1 student1){
        if(this.getRoll() > student1.getRoll()) return +1;
        if(this.getRoll() < student1.getRoll()) return -1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
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

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
