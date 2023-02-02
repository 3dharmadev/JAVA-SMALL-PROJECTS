package SB101_V2.Sprint_2.Evaluation;

public class ProducerThread implements Runnable{
    Common common;
    public ProducerThread(Common common){
        this.common=common;
    }

    @Override
    public void run() {
        int i=0;
        while(true){
            common.produce(i);
            i+=1;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
