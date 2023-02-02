package java111.sprint_3.super_downcasting_upcasting;

public class _Upcasting_Better_Example {
    public static void main(String[] args) {
        Bike bike=new KTM();
        bike.run();
        new KTM().run();
        KTM ktm=new KTM();
        ktm.run();
    }
}

  class  Bike{

    void run() {
        System.out.println(" bike running");
    }
}
    class KTM extends Bike{
    @Override
    void run() {
        System.out.println("KTM bike running");
    }
}