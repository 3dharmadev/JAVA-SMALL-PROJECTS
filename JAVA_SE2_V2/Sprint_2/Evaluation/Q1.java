package SB101_V2.Sprint_2.Evaluation;

public class Q1 {
    public static void main(String[] args) {
     Common common=new Common();
     ProducerThread producerThread=new ProducerThread(common);
     Thread t1=new Thread(producerThread);

     ConsumerThread consumerThread=new ConsumerThread(common);
     Thread t2= new Thread(consumerThread);

     t1.start();
     t2.start();


    }
}
