package java111.sprint_3.super_downcasting_upcasting;

public class _Super_Keyword {
    public static void main(String[] args) {
       // new Lotus().printColor();
        Lotus l1=new Lotus();

    }
}

class Flower{
    String color="white";
    Flower(){
        super();
        System.out.println("Flower cons. called");
    }
}
class Lotus extends Flower{
    String color="blue";

    Lotus(){
        super();
        System.out.println("lotus cons. called");
    }

    /*void printColor(){
        System.out.println(this.color);
        System.out.println(color);
        System.out.println(super.color);
    }*/

}