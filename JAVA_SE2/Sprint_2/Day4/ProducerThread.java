package SB_101.Sprint_2.Day4;

public class ProducerThread extends Thread{
    Common c;
    public ProducerThread(Common c){
        this.c=c;
    }

    @Override
    public void run() {
         int i=0;
         while (true){
             c.produce(i);
             i=i+1;
             try {
                 Thread.sleep(1000);
             } catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }
         }
    }
}
