package SB_101.Sprint_2.Day2;

public class Demo2 {
    public static void main(String[] args)  {
     /*  ThreadA ta =new ThreadA();
       ThreadB tb = new ThreadB();

       Thread tr1 = new Thread(ta);
       Thread tr2 = new Thread(tb);

       tr1.setName("Dhoni");
       tr2.setName("Kholi");

       tr1.start();
       tr2.start(); */
     /*   Thread tr1 = new Thread(()->{
            for (int i=0;i<10;i++){
                System.out.println(Thread.currentThread().getName()+"is running"+i);
            }
        });

        Thread tr2 = new Thread(()->{
            for (int i=50;i<60;i++){
                System.out.println(Thread.currentThread().getName()+"is running"+i);
            }
        }); */

      /*  Thread tr1 = new Thread(A::print0To10);
        Thread tr2 = new Thread(A::print50To60);

        tr1.setName("Dhoni");
        tr2.setName("Kholi");

        tr1.start();
        tr2.start(); */

       /* ThreadA ta =new ThreadA();


        Thread tr1 = new Thread(ta);


        tr1.setName("Dhoni");

        tr1.start();
        for(int i=80;i<90;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()+"is running"+i);

        } */

          ThreadA ta =new ThreadA();
       ThreadB tb = new ThreadB(ta);

       ta.setName("Dhoni");
       tb.setName("Kholi");

       ta.start();
       tb.start();
    }
}
