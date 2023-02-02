package SB101_V2.Sprint_2.Day1;

public class SalmanThread implements Runnable {

    @Override
    public void run() {
        int sum=0;
        for (int i=1;i<=10;i++){
            sum+=i;
        }
        System.out.println(Thread.currentThread().getName()+"Sum of first 10 numbers is - "+sum);
        System.out.println("End of SalamanThread....");
    }
}
