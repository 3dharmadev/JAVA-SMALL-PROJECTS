package SB_101.Sprint_2.Evaluation2;

public class Consumer_Thread extends Thread {
    Common c;
    public Consumer_Thread(Common c){
        this.c=c;
    }
    int sum=0;

    @Override
    public void run() {

        while (true){
            int i= c.consume();
            sum+=i;
            System.out.println("Consumer Calculated Sum is: "+sum);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
