package SB_101.Sprint_2.Day4;

public class A {
    public synchronized void funA(B b1){
        System.out.println("Thread t1 acquires the lock of a1 ");
        System.out.println("FunA of A starts");

        System.out.println("Thread t1 needs lock of b1 to call fun2");
        b1.fun2();

        System.out.println("FunA of A ends");
    }

    public synchronized void fun1(){
        System.out.println("inside fun1 of A");
    }
}
