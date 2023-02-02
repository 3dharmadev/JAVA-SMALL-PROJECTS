package SB_101.Sprint_2.Day3.Assignment3;

public class Q1 {
    public static void main(String[] args) {
      ThreadA ta =new ThreadA();
      Thread t1 =new Thread(ta);

      t1.start();

      synchronized (t1){
          try {
              t1.wait();
          } catch (InterruptedException e) {
              throw new RuntimeException(e);
          }
      }
        System.out.println(ta.multi);

    }
}

/*Q1)Make a thread that will calculate a product of 1 to 10 and another thread (main
thread) will print the calculated value of the first thread.
Note: make use of the wait and notify method.
*/
class ThreadA implements Runnable{
    int multi=1;
    @Override
    public void run() {

        synchronized (this){
            for (int i=1;i<=10;i++){
                multi*=i;
            }
            this.notify();
        }

    }
}