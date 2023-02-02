package SB_101.Sprint_2.Day1.Assignment;

public class Q7 {
    public static void main(String[] args) {
        ThreadA ta=new ThreadA();
        ThreadA tb=new ThreadA();

        Thread tr1 = new Thread(ta);
        Thread tr2 = new Thread(tb);
        tr1.setPriority(8);
        tr2.setPriority(10);

        tr1.setName("Dhoni");
        tr2.setName("Kholi");

        tr1.start();
        tr2.start();
       Thread.currentThread().setName("Main");
        for (int i=100;i<110;i++) System.out.println(i+"->"+Thread.currentThread().getName());
    }
}
/*) Create an application in which start 2 threads along with main thread :
 Both threads will print their priority along with the thread name 10 times.
From the main method set the name of both the thread as Dhoni thread for thread 1
And Kohli thread for thread 2,
Set the priority for thread1 as 8 and thread2 as 10.
Note: Both threads should run on a single object.*/

 class ThreadA implements Runnable{

     @Override
     public void run() {
         for (int i=10;i<20;i++){
             System.out.println(i+" "+Thread.currentThread().getName());
         }
         System.out.println("End of "+Thread.currentThread().getName());
     }
 }

class ThreadB implements Runnable{

    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println(i+" "+Thread.currentThread().getName());
        }
        System.out.println("End of  "+Thread.currentThread().getName());
    }
}