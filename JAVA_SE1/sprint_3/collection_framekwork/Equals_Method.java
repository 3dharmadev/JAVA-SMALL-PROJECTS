package java111.sprint_3.collection_framekwork;

public class Equals_Method {
    public static void main(String[] args) {
        Object o;
        Integer i=10;
        Integer j=10;
        String m="a";
        String n="a";
        System.out.println(m==n);
        System.out.println(i.equals(j));
        Car car1= new Car(245.0,"white");
        Car car2 = new Car(245.0,"white");
        System.out.println(car1.equals(car2));

    }
}
