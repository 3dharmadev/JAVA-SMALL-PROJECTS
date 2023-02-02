package SB101_V2.Sprint_2.Evaluation;

public class Virat implements Runnable{
    int sum = 0;
    @Override
    public void run() {
        synchronized (this) {
            for(int i=1;i<=20;i++) {
                sum=sum+i;
            }
            System.out.println("Virat thread :"+sum);
        }
    }
}
