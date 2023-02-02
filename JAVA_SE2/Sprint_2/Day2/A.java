package SB_101.Sprint_2.Day2;

public class A {
    public static void print0To10(){
        for(int i=0;i<=10;i++){
            System.out.println(Thread.currentThread().getName()+"printing  "+i);
        }
    }

    public static void print50To60(){
        for(int i=50;i<=60;i++){
            System.out.println(Thread.currentThread().getName()+"printing  "+i);
        }
    }
}
