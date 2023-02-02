package SB101_V2.Sprint_4.Day2.Problem2_and_Problem3.model;

public class Student {
    private  int rollNo;
    private String studentName;
    private String address;
    private int marks;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
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
                "rollNo=" + rollNo +
                ", studentName='" + studentName + '\'' +
                ", address='" + address + '\'' +
                ", marks=" + marks +
                '}';
    }
}
/*rollNo int primary key,
studentName varchar(25),
address  varchar(20),
marks int*/