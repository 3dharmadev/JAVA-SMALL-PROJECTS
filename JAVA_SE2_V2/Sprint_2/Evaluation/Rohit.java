package SB101_V2.Sprint_2.Evaluation;

public class Rohit implements Runnable{
    int product = 1;
    @Override
    public void run() {
        for(int i=1;i<=10;i++) {
            product*=i;
        }
        System.out.println("Rohit thread :"+product);
    }
}
