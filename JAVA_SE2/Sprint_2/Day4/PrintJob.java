package SB_101.Sprint_2.Day4;

public class PrintJob implements Runnable {
    String name;
    PrintJob(String name){
        this.name=name;
    }
    @Override
    public void run() {
        System.out.println(name+" job started by Thread : "+Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(name+" job completed by Thread "+Thread.currentThread().getName());
    }
}
