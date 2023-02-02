package SB101_V2.Sprint_2.Day2;

public class Q2 {
    public static void main(String[] args) {
        Thread1 thread1=new Thread1();
        Thread tr1=new Thread(thread1);

        Thread2 thread2=new Thread2(tr1);
        Thread tr2=new Thread(thread2);

        tr1.start();
        tr2.start();
    }
}

/*Create two threads, one thread to display all even numbers between 1 & 20, and another to
display odd numbers between 1 & 20.
Note: Display all even numbers followed by odd numbers from the main method.
Hint: use join*/

class Thread1 implements Runnable{
    @Override
    public void run() {
        for (int i=1;i<=20;i++) if(i%2==0) System.out.println(i);
    }
}

class Thread2 implements Runnable{
    Thread tr;
    public Thread2(Thread tr){
        this.tr=tr;
    }
    @Override
    public void run() {

        try {
            tr.join();
        } catch (InterruptedException e) {
           e.printStackTrace();
        }
        for (int i=1;i<=20;i++) if(i%2!=0) System.out.println(i);
    }
}