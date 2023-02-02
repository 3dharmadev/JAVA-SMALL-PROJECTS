package SB_101.Sprint_2.Evaluation2;

public class Common {
    int val;
    boolean flag=false;
    public synchronized void produce(int i){
        if (flag==true){
            val=i;
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
        return val;
    }
}

