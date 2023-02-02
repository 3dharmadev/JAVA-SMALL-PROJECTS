package SB101_V2.Sprint_2.Day2;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        A a1=new A();

        Thread t1=new Thread(a1);
        Thread t2=new Thread(a1);
        Thread t3=new Thread(a1);

        t1.start();
        t2.start();
        t3.start();



    }
}
//Call the above sayHello method of a single A class
// object from the 3 threads in such a way that we should get the regular output

 class A implements Runnable{

    public synchronized void sayHello(String name){

        System.out.println("Welcome :");

        try{
            Thread.sleep(2000);

        }catch(Exception e){
            e.printStackTrace();
        }

        System.out.println(name);

    }



     @Override
     public void run() {
         Scanner sc=new Scanner(System.in);
        sayHello(sc.next());
        sc.close();
     }
 }