package SB101_V2.Sprint_2.Day2;

public class SalmanThread implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<=20;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(i%2!=0) System.out.println(Thread.currentThread().getName()+i);
        }

    }
}
