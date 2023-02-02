package SB101_V2.Sprint_1.day3;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Q1 {
    public static void main(String[] args) {
        Predicate<Integer> integerPredicate= integer -> integer>=300;
        System.out.println(integerPredicate.test(500));

        Consumer<String> consumer= s -> System.out.println("Welcome "+s.toUpperCase());
        consumer.accept("debabrata");

        Supplier<String> integerSupplier=() -> "This message from supplier";
        System.out.println(integerSupplier.get());

        Function<Integer,String> stringIntegerFunction= integer -> integer>400? "pass":"fail";
       String res= stringIntegerFunction.apply(1100);
        System.out.println(res);



    }
}
