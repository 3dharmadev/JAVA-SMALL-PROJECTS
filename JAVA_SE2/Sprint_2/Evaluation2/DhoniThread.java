package SB_101.Sprint_2.Evaluation2;

public class DhoniThread extends Thread {
    @Override
    public void run() {
        synchronized (this) {
            for(int i=1;i<=10;i++) {
                System.out.println("Dhoni thread :"+i);
            }
        }
    }
}
