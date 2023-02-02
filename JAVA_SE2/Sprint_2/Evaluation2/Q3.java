package SB_101.Sprint_2.Evaluation2;

public class Q3 {
    public static void main(String[] args) {
        DhoniThread dhoni = new DhoniThread();
        RohitThread rohit = new RohitThread();
        ViratThread virat = new ViratThread();

       Thread t1 =new Thread(rohit);

        t1.start();

        try {
            t1.join( );
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Thread t2=new Thread(virat);

        t2.start();
        try {
            t2.join( );
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Thread t3=new Thread(dhoni);
        t3.start();
        try {
            t3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
