package SB_101.Sprint_1.Day3;

import java.util.function.Supplier;

public class MySupplier implements Supplier<String> {
    @Override
    public String get() {
        return "This message from External class";
    }
}
