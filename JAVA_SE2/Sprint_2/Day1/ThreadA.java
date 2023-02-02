package SB_101.Sprint_2.Day1;

public class ThreadA implements Runnable {
    @Override
    public void run() {
        for (int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"is running"+i);
        }

        System.out.println("end of ThreadA");
    }

}
