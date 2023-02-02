package SB101_V2.Sprint_2.Day4;

import java.util.concurrent.*;

public class Q2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service= Executors.newFixedThreadPool(2);

        MyCalllable[] myCalllable={
          new MyCalllable(400,12,"deba"),
                new MyCalllable(500,10,"deba"),
                new MyCalllable(300,11,"deba"),
                new MyCalllable(600,9,"deba"),
                new MyCalllable(333,8,"deba"),
        };

        for (MyCalllable call : myCalllable) {
            Future<String> stringFuture=service.submit(call);
            System.out.println(stringFuture.get());
        }
        service.shutdown();


    }
}
