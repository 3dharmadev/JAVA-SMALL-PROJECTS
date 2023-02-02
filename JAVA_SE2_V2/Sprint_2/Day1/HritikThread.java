package SB101_V2.Sprint_2.Day1;

public class HritikThread implements Runnable{
    @Override
    public void run() {
       int multi=1;
       for (int i=1;i<=10;i++) multi*=i;

        System.out.println(Thread.currentThread().getName()+"the multiplication of the first 10 number is "+multi);
        System.out.println("End of HrithikThread...");
    }
}
