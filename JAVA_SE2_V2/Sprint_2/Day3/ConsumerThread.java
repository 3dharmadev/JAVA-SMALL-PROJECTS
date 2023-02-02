package SB101_V2.Sprint_2.Day3;

public class ConsumerThread extends Thread{
    Common c;
    public ConsumerThread(Common c){
        this.c=c;
    }

    @Override
    public void run() {

        while (true){

           int i= c.consume();
            System.out.println("Consumer consume "+i );
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
