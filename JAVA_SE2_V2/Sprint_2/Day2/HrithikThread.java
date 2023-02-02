package SB101_V2.Sprint_2.Day2;

public class HrithikThread implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
            for (int i=0;i<=20;i++){
                if(i%2==0) System.out.println(Thread.currentThread().getName()+i);
            }

    }
}
