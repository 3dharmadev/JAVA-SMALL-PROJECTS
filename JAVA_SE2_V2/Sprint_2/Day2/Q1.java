package SB101_V2.Sprint_2.Day2;

public class Q1 {
    public static void main(String[] args) {
      UltimateThread ultimateThread=new UltimateThread();
      Thread t1=new Thread(ultimateThread);
      t1.setName("Dhoni Thread");
      t1.setPriority(5);
      Thread t2=new Thread(ultimateThread);
      t2.setName("Kohli Thread");
      t2.setPriority(10);

      t1.start();
      t2.start();

    }
}
class UltimateThread implements Runnable{

    @Override
    public void run() {
        for(int i=1;i<=10;i++) System.out.println("Priority is-"+Thread.currentThread().getPriority()+" , no."+i+" name-"+Thread.currentThread().getName());
    }
}

/*## Problem 1:

**Create a multithreaded application in which start 2 threads along with the main thread:**

- Both threads will print their priority along with the thread name 10 times.
- From the main method set the name of both the thread as Dhoni thread for thread 1 and Kohli thread for thread 2,
- Set the priority for thread1 as 5 and thread2 as 10.

**Note:** Both threads should run on a single object.*/