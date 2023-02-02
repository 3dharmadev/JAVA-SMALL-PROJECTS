package SB_101.Sprint_2.Evaluation2;

import SB_101.Sprint_2.Day4.MyCalllable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Q2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService threadPool = Executors.newFixedThreadPool(3);
         Student[] students={
                 new Student(1,"deba","cuttack",4000),
                 new Student(2,"rama","cuttack",40100),
                 new Student(3,"maheswar","puri",4020),
                 new Student(5,"deba","cuttack",4010)
         };
        for (Student s:students){
            Future<String> f= threadPool.submit(s);

            System.out.println(f.get());
        }

        threadPool.shutdown();
    }
}
/*Create a Thread Pool of 3 Threads, and submit the 6 tasks using the Callable
interface. Each task should accept a Student object (roll, name, address, marks )through
the constructor and return the result of that student with his roll number.
Ex:
If supplied Student object is : new Student(10, “Varun”, “pune”, 450);
Then the thread should return: “Roll 10 student is Fail”
*/