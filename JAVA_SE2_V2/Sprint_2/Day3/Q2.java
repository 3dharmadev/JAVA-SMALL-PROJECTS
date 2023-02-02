package SB101_V2.Sprint_2.Day3;


public class Q2 {
    public static void main(String[] args) throws InterruptedException {
       Thread_Q2 thread_q2=new Thread_Q2();

       Thread t1= new Thread(thread_q2);
       t1.start();

       synchronized (t1){
           t1.wait();
       }

        System.out.println(thread_q2.product);

    }
}
/*Make a thread that will calculate a product of 1 to 10 and another thread (main
thread) will print the calculated value of the first thread.
Note: make use of the wait and notify method.*/

class Thread_Q2 implements Runnable{
    int product=1;
    @Override
    public void run() {

        synchronized (this){
            for (int i=1;i<=10;i++)product*=i;
            this.notify();
        }
    }
}