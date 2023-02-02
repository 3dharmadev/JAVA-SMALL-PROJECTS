package SB101_V2.Sprint_2.Day1;

public class Q4 {

    public static void main(String[] args) {
        Thread t1=new TA();
        t1.setName("1ST THREAD");
        Thread t2=new TA();
        t2.setName("2nd Thread");
        Thread t3=new TA();
        t3.setName("3rd Thread");

        t1.start();
        t2.start();
        t3.start();
    }

}
//Develop a multithreaded Java Application to start 3 threads by extending the Thread class.

class TA extends Thread{
    @Override
    public void run() {
           for (int i=1;i<=10;i++) System.out.println(Thread.currentThread().getName()+"is running "+i);
    }
}