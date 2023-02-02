package SB101_V2.Sprint_2.Day3;

import SB_101.Sprint_2.Day4.Common;
import SB_101.Sprint_2.Day4.ConsumerThread;
import SB_101.Sprint_2.Day4.ProducerThread;

public class Q3 {
    public static void main(String[] args) {
       Common c = new Common();
         ProducerThread pr = new ProducerThread(c);
        ConsumerThread cr = new ConsumerThread(c);

        pr.start();
        cr.start();
    }
}

/*Develop a Producer- consumer problem using the wait and notify method in such a way that:

- Producer thread should produce a number continuously
- Consumer thread should consume the produced number of Producer thread and print that number.

**Note:**

No number should be generated twice and no number should be printed twice.

that means, first of all, the producer thread should produce a number after this it has to
 notify the consumer thread and it(the producer thread) goes into the wait state.

meanwhile, The consumer thread should print the produced value on the console and go into
 the wait state. before going to the wait state it should notify the producer thread so that the producer thread
 will generate a new number and this process continues.*/