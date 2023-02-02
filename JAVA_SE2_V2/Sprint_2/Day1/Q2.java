package SB101_V2.Sprint_2.Day1;

public class Q2 {

    public static void main(String[] args) {

        Thread t1=new Thread(A::funA);
        t1.setName("Dhoni");
        Thread t2=new Thread(new A()::funB);
        t2.setName("Kohli");


        t1.start();
        t2.start();
    }
}
/*Consider the following class:

```java
class A{

public static void funA(){

for(int i=1;i <=10; i++){

System.out.println(Thread.currentThread().getName()+” is running”);

}

}

public void funB(){

for(int i=20;i <=30; i++){

System.out.println(Thread.currentThread().getName()+” is running”);

}

}

}
```

- Develop a multithreaded application to run funA and funB as two different threads using Method Reference.
- Set the name of Thread 1 as Dhoni thread and Thread 2 as Kohli thread.*/


class A{

    public static void funA(){

        for(int i=1;i <=10; i++){

            System.out.println(Thread.currentThread().getName()+"is running");

        }

    }

    public void funB(){

        for(int i=20;i <=30; i++){

            System.out.println(Thread.currentThread().getName()+"is running");

        }

    }

}