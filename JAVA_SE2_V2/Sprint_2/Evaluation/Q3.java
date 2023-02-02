package SB101_V2.Sprint_2.Evaluation;

public class Q3 {
    public static void main(String[] args) throws InterruptedException {
        Dhoni dhoni=new Dhoni();
        Thread t1=new Thread(dhoni);
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t1.join();

        Rohit rohit=new Rohit();
        Thread t2=new Thread(rohit);
        t2.start();
        t2.join();

        Virat virat=new Virat();
        Thread t3=new Thread(virat);
        t3.start();

    }
}
