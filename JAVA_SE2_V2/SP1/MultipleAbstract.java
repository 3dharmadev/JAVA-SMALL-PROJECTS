package SB101_V2.SP1;


import java.util.function.Supplier;

interface Intr{
    void sayHello(String name);

}
public class MultipleAbstract{
    public static Intr fun1(){
         Intr i1= n -> System.out.println("Welcome "+n);
         return i1;
    }
    public static void main(String[] args) {
        //anonymous inner class
        Intr i1 = name -> System.out.println("Welcome "+name);
        i1.sayHello("Amit");

        Intr i2 = fun1();
        i2.sayHello("Admin");

        Supplier<String> stringSupplier= () -> "heelo world";
       String str= stringSupplier.get();
        System.out.println(str);

    }
}

