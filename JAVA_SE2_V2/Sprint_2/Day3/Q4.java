package SB101_V2.Sprint_2.Day3;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
      Fibonacci fibonacci=new Fibonacci();
      Thread t1=new Thread(fibonacci);
      t1.start();

      Reverse reverse=new Reverse();
      Thread t2=new Thread(reverse);
      t2.start();
    }
}


class Fibonacci implements Runnable{

    @Override
    public void run() {
        int a=0, b=1, c=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit for fibonacci: ");
        int res=sc.nextInt();
        System.out.println("Fibonacci numbers are-");

        while(res>0){
            System.out.println(c+" ");
            a=b;
            b=c;
            c=a+b;
            res-=1;
        }
        sc.close();
    }
}

class Reverse implements  Runnable{

    @Override
    public void run() {
        System.out.println("Reversed - ");
        for(int i=10;i>=1;i--) System.out.print(i+" ");
    }
}