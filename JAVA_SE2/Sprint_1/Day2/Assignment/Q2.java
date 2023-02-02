package SB_101.Sprint_1.Day2.Assignment;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Q2 {
    public static void main(String[] args) {

       Predicate<Integer> i1 = integer -> integer>=10;
      boolean   res = i1.test(200);//this will return condition satisfies or not
        System.out.println(res);


        Consumer<String> c1 = s -> System.out.println("Welcome "+s.toUpperCase());
        c1.accept("Debabrata"); //it will accept parameter what you have passed and you can do various operation with it but it doesnot return a value

        Supplier<String> s1 = () -> "This is string from LE";
        System.out.println(s1.get());  // this will return what ever you passed as parameter

        Function<Integer,String> f1 = integer -> integer>500 ? "Pass":"Fail";

        String res2= f1.apply(500); //function interfacw will take two data type one is for checking the logic then another one is for return the logic
        System.out.println(res2);
    }
}
