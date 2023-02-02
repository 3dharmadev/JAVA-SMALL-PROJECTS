package SB_101.Sprint_2.Day4;

import java.util.concurrent.Callable;

public class MyCalllable implements Callable<Integer> {

    int num;
    public MyCalllable(int num){
        this.num=num;
    }
    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName()+" .. is responsible to find the sum of "+num+" numbers");
        int sum=0;
        for (int i=0;i<=num;i++){
            sum+=i;
        }
        return sum;
    }
}
