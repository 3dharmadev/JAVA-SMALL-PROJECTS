package SB101_V2.Sprint_2.Day1;

public class Q3 {
    public static void main(String[] args) {
       MyThread myThread= new MyThread();
        Thread t1=new Thread(myThread);
        t1.setName("FirstThread");
        Thread t2=new Thread(myThread);
        t2.setName("SecondThread");

        t1.start();
        t2.start();
    }
}
/*Create a multithreaded application in which 2 different threads run on
a single object of a class which will print both thread names 10 times.*/

class MyThread implements Runnable{

    @Override
    public void run() {
        for (int i=1;i<=10;i++) System.out.println(Thread.currentThread().getName()+" is running "+i+" times");
    }
}