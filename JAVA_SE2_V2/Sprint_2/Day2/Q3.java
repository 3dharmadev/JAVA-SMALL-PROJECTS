package SB101_V2.Sprint_2.Day2;

public class Q3 {
    public static void main(String[] args) {
        Hrithik_Thread hrithikThread=new Hrithik_Thread();
           Thread tr1=new Thread(hrithikThread);
           tr1.setName("Hrithik Thread");



        Salman_Thread salmanThread=new Salman_Thread(tr1);
        Thread tr2=new Thread(salmanThread);
        tr2.setName("salman Thread");

        tr1.start();
        tr2.start();

    }
}

/*
*
* **Create a multithreaded application in which start 2 threads:**

1. Salman thread:
2. Hritik thread:
- Salman Thread should print all the even numbers starting from 0 to 20
- Hritik Thread should print all the odd numbers starting from 0 to 20.
- Both threads should print the number by taking a 1-second pause.

**Note:** Salman Thread should wait until the complete execution of the Hritik Thread. (make use of the Join method)*/


 class Salman_Thread implements Runnable{

     Thread tr;
      public  Salman_Thread(Thread tr){
         this.tr=tr;
     }
    @Override
    public void run() {

        try {
            tr.join();
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        for (int i=0;i<=20;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if(i%2==0) System.out.println(Thread.currentThread().getName()+" is running "+i);
        }

    }
}

class Hrithik_Thread implements Runnable{
    @Override
    public void run() {

        for (int i=0;i<=20;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(i%2!=0) System.out.println(Thread.currentThread().getName()+" is running "+i);
        }

    }
}
