package SB101_V2.Sprint_2.Evaluation;

public class Dhoni implements Runnable{
    @Override
    public void run() {
        synchronized (this) {
            for(int i=1;i<=10;i++) {
                System.out.println("Dhoni thread :"+i);
            }
        }
    }
}
