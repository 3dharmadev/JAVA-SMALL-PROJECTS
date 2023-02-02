package SB101_V2.Sprint_2.Day1;

public class Q5 {
    public static void main(String[] args) {
        ByRunnable b1=new ByRunnable();
        Thread t1=new Thread(b1);
        Thread t2=new Thread(b1);
        t1.setName("First");
        t2.setName("Second");

        t1.start();
        t2.start();
    }
}

/*Develop a multithreaded Java Application to start 2 threads by implementing a Runnable interface.*/
class ByRunnable implements Runnable{
    @Override
    public void run() {
            for (int i=1;i<=10;i++) System.out.println(Thread.currentThread().getName()+"is running "+i);
    }
}