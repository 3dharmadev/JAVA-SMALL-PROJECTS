package SB_101.Sprint_1.Day1;

public class Q7 {
    public static void main(String[] args) {
        Intr i1 = a ->  Integer.parseInt(a);
        int i= i1.convertToInteger("200");
        System.out.println(i);

        //above example we are creating anonymous class using LE but in below
        // example we can do the same using method reference that means instead
        //of creating it just refer to the already build method
        Intr i2=Integer::parseInt;
      int res=  i2.convertToInteger("2200");
        System.out.println(res);

        //here again we again refering to print class to println method which will
        // print the passed paramter
        Intr2 i3 = System.out::println;
        i3.printSomething("WEEEELW ddjdjdj");

    }
}
/*Q7/-Explain about the Method Reference, How many ways we can refer to an
existing
implementation explain with examples*/

@FunctionalInterface
interface Intr{
    public int convertToInteger(String a);
}

@FunctionalInterface
interface Intr2{
    public void printSomething( String a);
}