package SB101_V2.Sprint_2.Evaluation;

public class Common {
    int value;

    boolean flag=false;

    public synchronized void produce(int i)  {
        if(flag==true){
            value=i;
            System.out.println("producer produces :"+i);
            flag=false;
           this.notify();
            try {
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public synchronized int consume(){
        if(flag==true){
            try {
                this.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        flag=true;

        this.notify();
        return value;
    }


}
