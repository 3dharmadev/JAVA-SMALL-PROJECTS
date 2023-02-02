package SB_101.Sprint_2.Day2;

public class New_example1 {
    public static void main(String[] args) {

        ThreadX tx = new ThreadX();
        tx.start();
        for (int i=10;i<20;i++){
            System.out.println("inside main"+i);
        }
        System.out.println("End of main");
    }
}

class ThreadX extends  Thread{
    @Override
    public void run() {

        for (int i = 50; i < 60; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + "is running" + i);
        }

    }
}
