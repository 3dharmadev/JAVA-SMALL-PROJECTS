package SB_101.Sprint_2.Day2;

public class ThreadA extends Thread {
    @Override
    public void run() {
        for (int i=0;i<10;i++){
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            //  System.out.println("Priority B"+Thread.currentThread().getPriority());
           System.out.println(Thread.currentThread().getName()+"is running"+i);
        }

        System.out.println("end of ThreadA");
    }

}
