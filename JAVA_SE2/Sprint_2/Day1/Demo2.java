package SB_101.Sprint_2.Day1;

public class Demo2 {
    public static void main(String[] args) {
    /*   ThreadA ta =new ThreadA();
       ThreadB tb = new ThreadB();

       Thread tr1 = new Thread(ta);
       Thread tr2 = new Thread(tb);

       tr1.setName("Dhoni");
       tr2.setName("Kholi");

       tr1.start();
       tr2.start(); */

        Thread tr1 = new Thread(()->{
            for (int i=0;i<10;i++){
                System.out.println(Thread.currentThread().getName()+"is running"+i);
            }
        });

        Thread tr2 = new Thread(()->{
            for (int i=50;i<60;i++){
                System.out.println(Thread.currentThread().getName()+"is running"+i);
            }
        });


        tr1.setName("Dhoni");
        tr2.setName("Kholi");

        tr1.start();
        tr2.start();
    }
}
