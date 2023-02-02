package SB101_V2.Sprint_2.Day3;

public class Common {
int val;
boolean flag=true;
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
    if (flag==true){
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
