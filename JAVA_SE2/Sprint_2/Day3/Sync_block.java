package SB_101.Sprint_2.Day3;

public class Sync_block {
    public static void main(String[] args) {

    }
}
class A implements  Runnable{

    B b1 = new B();
    public  void funA(){
        System.out.println("welcome....");

        synchronized (b1){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Admin");
        }
    }

    @Override
    public void run() {
        funA();
    }
}