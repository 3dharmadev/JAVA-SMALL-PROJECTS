package SB101_V2.Sprint_2.Day1;

public class AkshayThread implements Runnable{
    @Override
    public void run() {
        int i=1;
        while(i<=10){
            System.out.println(Thread.currentThread().getName());
            i++;
        }
        System.out.println("End of the AkashayThread...");
    }
}
