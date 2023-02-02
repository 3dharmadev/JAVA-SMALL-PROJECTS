package SB_101.Sprint_2.Day1;

public class Demo implements Runnable{
    @Override
    public void run() {
        System.out.println("run starts .....");
        for (int i=30;i<40;i++) System.out.println("inside  run : "+i);
        System.out.println("run ends .....");
    }

    public static void main(String[] args) {
        System.out.println("main starts .....");


        Demo demo = new Demo();
        Thread t1=new Thread(demo);

        t1.start();


   for (int i=0;i<10;i++) System.out.println("inside of main method: "+i);
        System.out.println("main ends .....");
    }
}
