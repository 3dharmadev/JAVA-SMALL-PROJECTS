package SB101_V2.Sprint_2.Evaluation;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Q2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service= Executors.newFixedThreadPool(3);

        Student[] students={
                new Student(13,"meghu","bhubaneswar",4000),
                new Student(2,"ramu","jagatpur",40100),
                new Student(3,"shyamu","puri",4200),
                new Student(5,"kanhu","cuttack",4010)
        };

        for (Student std:students) {
            Future<String> stringFuture=service.submit(std);
            System.out.println(stringFuture.get());
        }

        service.shutdown();

    }

}
/*Create a Thread Pool of 3 Threads, and submit the 6 tasks using the Callable
interface. Each task should accept a Student object (roll, name, address, marks )through
the constructor and return the result of that student with his roll number.
Example:
If supplied Student object is: new Student(10, “Varun”, “Pune”, 450);

Then the thread should return: “Roll 10 student is Fail”*/