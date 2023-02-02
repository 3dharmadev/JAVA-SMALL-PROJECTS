package SB_101.Sprint_2.Evaluation2;

import java.util.concurrent.Callable;

public class Student implements Callable<String> {

   private int roll;
    private String  name;
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
    public String call() throws Exception {
        if(this.marks<450) {
            System.out.println(Thread.currentThread().getName()+" Roll "+this.roll+" student is Fail");
            return this.name;

        }
      else {
            System.out.println(Thread.currentThread().getName()+" Roll "+this.roll+" student is Pass");
            return this.name;

        }
    }
}
