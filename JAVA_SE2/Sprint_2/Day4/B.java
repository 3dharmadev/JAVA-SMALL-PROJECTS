package SB_101.Sprint_2.Day4;

public class B {
    public synchronized void funB(A a1){
        System.out.println("Thread t2 acquires the lock of b1");
        System.out.println("FunB of B starts");
        System.out.println("Thread t2 needs lock of a1 to call fun1");
        a1.fun1();

        System.out.println("FunB of B ends");
    }

    public synchronized void fun2(){
        System.out.println("inside fun2 of B");
    }
}
