package SB_101.Sprint_2.Day3;

public class MyThread extends Thread{
    int total=0;
    @Override
    public void run(){

        synchronized (this){
            System.out.println("child thread executing");
            for (int i=0;i<=100;i++){
                total+=i;
            }
            System.out.println("Done");
            this.notify();
        }

    }

}

class Main{
    public static void main(String[] args) throws InterruptedException {
        MyThread mt =new MyThread();
        mt.start();
      synchronized (mt){
          System.out.println("Main thread calls the wait method");
          mt.wait(2000);
          System.out.println("Main method gets the notification");
      }
        System.out.println(mt.total);
    }
}