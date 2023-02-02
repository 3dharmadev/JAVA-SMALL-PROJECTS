package SB101_V2.Sprint_2.Day4;

import java.util.concurrent.Callable;

/*Create a ThreadPool of 2 threads, submit the 6 tasks using Callable,
and perform the following activity from each task:
● Each task should get the student object (roll, name, marks) and return
the result of the Student with their name, for example: if marks are greater
than 500 then return Pass or return fail.
Note: Supply the number to the Callable task through the constructor of
the Callable task class.*/
public class MyCalllable implements Callable<String> {

    int marks, roll;
    String name;

    public MyCalllable(int marks, int roll, String name) {
        this.marks = marks;
        this.name = name;
        this.roll = roll;
    }

    @Override
    public String call() throws Exception {
        if (marks >=500) return "Pass";
        else return "Fail";
    }
}
