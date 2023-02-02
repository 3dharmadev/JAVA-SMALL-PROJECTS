package SB_101.Sprint_2.Day2;

public class ThreadB extends Thread {

    Thread tr;
    public ThreadB(Thread tr){
        this.tr=tr;
    }
    @Override
    public void run() {
        try {
            tr.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 50; i < 60; i++) {
           // System.out.println("Priority B "+Thread.currentThread().getPriority());
            System.out.println(Thread.currentThread().getName() + "is running" + i);
        }

        System.out.println("end of ThreadA");
    }
}