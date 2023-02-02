package SB_101.Sprint_2.Evaluation2;

public class Q1 {
    public static void main(String[] args) {
        Common c = new Common();
        Producer_Thread pt = new Producer_Thread(c);
        Consumer_Thread ct =new Consumer_Thread(c);
        pt.start();
        ct.start();
    }
}




/*-Create a multithreaded Producer-Consumer application, where the Producer
Thread will produce a number. And the Consumer thread should print the sum of
all the numbers till that produced number starts from 0.
Ex:
Producer Produced : 0
Consumer Calculated Sum is: 0
Producer Produced: 1
Consumer Calculated Sum is: 1
Producer Produced: 2
Consumer Calculated Sum is: 3
Producer Produced : 3
Consumer Calculated Sum is: 6
Producer Produced: 4
Consumer Calculated Sum is: 10
Producer Produced: 5
Consumer Calculated Sum is: 15*/