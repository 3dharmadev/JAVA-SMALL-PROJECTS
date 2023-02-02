package SB_101.Sprint_2.Evaluation2;

public class RohitThread extends Thread{
    int prod = 1;
    @Override
    public void run() {
        for(int i=1;i<=10;i++) {
            prod=prod*i;
        }
        System.out.println("Rohit thread :"+prod);
    }
}
