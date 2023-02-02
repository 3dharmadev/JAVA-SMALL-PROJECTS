package SB_101.Sprint_2.Day2.Assignment_Day2;

public class Q1 {

    public static void main(String[] args) {
     Thread1 t1 = new Thread1();

     Thread t11 =new Thread(t1);

     Thread2 t2 = new Thread2(t11);
        Thread t22 =new Thread(t2);



     t11.start();
     t22.start();

    }
}

class Thread1 implements Runnable{

    @Override
    public void run() {
        for (int i=1;i<=20;i++){
            if(i%2==0) System.out.println(i);
        }
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
            throw new RuntimeException(e);
        }
        for (int i=1;i<=20;i++){
            if(i%2!=0) System.out.println(i);
        }
    }
}

/*Q1/- Create two threads, one thread to display all even numbers between 1 & 20, another to
display odd numbers between 1 & 20.
Note: Display all even numbers followed by odd numbers from the main method.
Hint: use join
*/