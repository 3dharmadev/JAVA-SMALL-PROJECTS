package SB_101.Sprint_2.Evaluation2;

public class ViratThread extends Thread {
    int sum = 0;
    @Override
    public void run() {

            for(int i=1;i<=20;i++) {
                sum=sum+i;
            }
            System.out.println("Virat thread :"+sum);

    }
}
