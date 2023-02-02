package SB101_V2.Sprint_2.Evaluation;



public class ConsumerThread implements Runnable {

    Common common;
    public ConsumerThread(Common common){
        this.common=common;
    }
    int sum=0;
    @Override
    public void run() {
        while (true){
            int i=common.consume();
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
