package SB101_V2.Sprint_2.Day4;

import java.util.concurrent.*;

public class Q1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service= Executors.newFixedThreadPool(3);

        CheckNum[] checkNums={
          new CheckNum(10),
                new CheckNum(3),
                new CheckNum(1),
                new CheckNum(5),
                new CheckNum(6),
                new CheckNum(9)
        };

        for (CheckNum c:checkNums) {
            Future<String> stringFuture=service.submit(c);
            System.out.println(stringFuture.get());
        }
        service.shutdown();
    }
}

/*Create a ThreadPool of 3 threads, submit the 6 tasks using Callable, and
from each task check whether the supplied number is Odd or even, if the number
is Odd return “Odd Number” and if the number is even then return “Even Number”.
Note: Supply the number to the Callable task through the constructor of the
Callable task class. */

class CheckNum implements Callable<String>{

    int num;
    public CheckNum(int n){
        this.num=n;
    }

    @Override
    public String call() throws Exception {
        if(num%2==0)return "Even Number";
        else return "Odd Number";
    }
}