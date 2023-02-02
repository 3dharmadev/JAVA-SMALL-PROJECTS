package SB_101.Sprint_1.Day3;

import java.util.function.Consumer;

public class MyConsumer implements Consumer<Student> {
    @Override
    public void accept(Student s) {
        System.out.println("Welcome : "+s.getName());
        System.out.println("Roll number : "+s.getRoll());
        System.out.println("Marks number : "+s.getMarks());
    }
}
