package SB101_V2.Sprint_1.EVA;


public class Q5 implements Intr,Intr2{

    public Q5(String str){

        System.out.println("Using constructor reference"+str);

    }
    public static void printhe(String str){
        System.out.println("Using static method "+str);
    }

    public void Printme(String str){
        System.out.println("Using non static way your name is"+str);
    }

    public static void main(String[] args) {
        Intr i1 = a ->  Integer.parseInt(a.trim());// using LE
        int i= i1.convertToInteger("200");
        System.out.println(i);

        //above example we are creating anonymous class using LE but in below
        // example we can do the same using method reference that means instead
        //of creating it just refer to the already build method
        Intr i2=Integer::parseInt;//using predefined jar method
        int res=  i2.convertToInteger("2200");
        System.out.println(res);

        //using constructor
        Intr2 intr2= Q5::new;

        Intr2 intr211= Q5::printhe;
        intr211.printSomeThing("debabrata ");


        //using non static way
        Intr2 intr21 = new Q5("debabrata")::Printme;






    }

    @Override
    public int convertToInteger(String a) {
         return Integer.parseInt(a.trim());
    }

    @Override
    public void printSomeThing(String name) {
        System.out.println("Your name is"+name);
    }
}

interface Intr{

    public int convertToInteger(String a);

}

interface Intr2{
    void printSomeThing(String name);
}

