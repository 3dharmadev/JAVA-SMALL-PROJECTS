package SB_101.Sprint_2.Day1;

public class ThreadB implements Runnable {
    @Override
    public void run() {
        for (int i = 50; i < 60; i++) {
            System.out.println(Thread.currentThread().getName() + "is running" + i);
        }

        System.out.println("end of ThreadA");
    }
}