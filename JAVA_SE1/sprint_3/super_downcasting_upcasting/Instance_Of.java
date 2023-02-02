package java111.sprint_3.super_downcasting_upcasting;



public class Instance_Of {
    public static void main(String[] args) {
        KTM ktm=new KTM();
        System.out.println("MEE" instanceof String);
        System.out.println(ktm instanceof  KTM);
        System.out.println(ktm instanceof Bike);

        Everything everything=new Everything();
        System.out.println(everything instanceof Object);

    }

    static  class  Everything{}
}
