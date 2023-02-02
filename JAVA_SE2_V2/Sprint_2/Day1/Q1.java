package SB101_V2.Sprint_2.Day1;

public class Q1 {
    public static void main(String[] args) {
        Thread t1=new Thread(new SalmanThread());
        Thread t2= new Thread(new HritikThread());
        Thread t3=new Thread(new AkshayThread());
        t1.setName("Salaman Thread ");
        t2.setName("Hrithik Thread ");
        t3.setName("Akshay Thread ");
        t1.start();
        t2.start();
        t3.start();
    }
}
