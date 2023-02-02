package SB_101.Sprint_2.Day2;

public class Join_Example implements Runnable{
    int sum=0;
    public void run(){
        for (int i=0;i<=10;i++) {
            System.out.println("inside A thread");
            sum+=i;
        }
    }
}

class Main{
    public static void main(String[] args)  {
          Join_Example j = new Join_Example();
          Thread t = new Thread(j);
          t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        int res = j.sum;
        for(int i=80;i<90;i++){

            System.out.println("inside main thread...");
            System.out.println(res);

        }

    }
}