package SB101_V2.Sprint_2.Day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) throws InterruptedException {


        ChildThread thread=new ChildThread();
        Thread t1= new Thread(thread);
        List<String> cities=  thread.Cities(new ArrayList<>());
        t1.start();

        t1.join();

        cities.forEach(s -> System.out.println(s));

    }
}

/*## Problem 4 :

**Develop a multithreaded application in which**

- From the main method create an empty List of cities and pass this empty city list to the child thread.
- The child thread should add 4 cities inside this List by taking input from the user.
- Once the child Thread added the cities to that List then the main thread should print all
- the cities added by the child thread one by one.*/

 class ChildThread implements Runnable{

     List<String> cities;
     public void run() {

         Scanner scanner=new Scanner(System.in);

         System.out.println("Add 4 cities name one by one");
         String c1=scanner.next();
         String c2=scanner.next(); String c3=scanner.next(); String c4=scanner.next();
         cities.add(c1); cities.add(c2); cities.add(c3); cities.add(c4);

     }

     List<String> Cities(List<String> cities){
      this.cities=cities;
         return cities;
     }
 }