package SB101_V2.Sprint_2.Day3;

public class Q1 {
    public static void main(String[] args) {

        Thread_Of1 thread_of1=new Thread_Of1();

        Thread t1=new Thread(thread_of1);
        t1.setName("First One");

        Thread_Of1 thread_of1_2=new Thread_Of1();

        Thread t2=new Thread(thread_of1_2);

        t2.setName("Second One");

        t1.start();
        t2.start();
    }
}

/*Execute the following functionality by 2 threads using a synchronized block:

```java
for(int i=1; i<=10;i++){

System.out.println(Thread.currentThread().getName()+”is running ”+i);

}
```

- Set the proper name for both threads.
- Acquire the Class level lock of the same class to execute the above functionality*/

class Thread_Of1 implements Runnable{

    @Override
    public void run() {
        synchronized (Thread_Of1.class){
            for(int i=1; i<=10;i++){

                System.out.println(Thread.currentThread().getName()+"is running "+i);

            }
        }
    }
}