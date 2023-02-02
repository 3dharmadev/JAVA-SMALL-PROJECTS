package SB_101.Sprint_2.Day4;

import java111.sprint_3.super_downcasting_upcasting.Instance_Of;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Demo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
       /*  Common c = new Common();
            ProducerThread pr = new ProducerThread(c);
            ConsumerThread cr = new ConsumerThread(c);

            pr.start();
            cr.start(); */
       /* A a1=new A();
        B b1=new B();
        ThreadA ta = new ThreadA(a1,b1);
        ThreadB tb = new ThreadB(a1,b1);

        ta.start();
        tb.start(); */
       /* ExecutorService pool = Executors.newFixedThreadPool(3);

        PrintJob[] jobs = {
                new PrintJob("Ram"),
                new PrintJob("shyam"),
                new PrintJob("krishna"),
                new PrintJob("brahman"),
                new PrintJob("khetriya")
        };

        for (PrintJob job:jobs){
            pool.submit(job);
        }

      pool.shutdown(); */

    ExecutorService threadPool = Executors.newFixedThreadPool(1);
        MyCalllable[] jobs = {
                new MyCalllable(10),
                new MyCalllable(20),
                new MyCalllable(30),
                new MyCalllable(40),
                new MyCalllable(50),
                new MyCalllable(60)
        };

        for (MyCalllable job:jobs){
         Future<Integer> f= threadPool.submit(job);

                System.out.println(f.get());
        }

        threadPool.shutdown();

    }
}
