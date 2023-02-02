package SB_101.Sprint_2.Day3;

public class Sync_Method implements Runnable{


    public   synchronized void funA(){
        System.out.println("welcome....");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Admin");
    }

    @Override
    public void run() {
      funA();
    }
}
class Demo3{
    public static void main(String[] args) {
        Sync_Method  sync =new Sync_Method();
        Thread t1 =new Thread(sync);
        Thread t2 =new Thread(sync);

        t1.start();
        t2.start();
    }
}
