package java111.sprint_3.collection_framekwork;

public class Car {
    double torque;
    String color;

    public Car(double torque,String color){
        this.torque=torque;
        this.color=color;
    }
    @Override
    public  boolean equals(Object that){
        if(this==that) return  true;
        Car car=(Car) that;
        if(this.torque==car.torque && this.color.equals(car.color)) return true;
        else return false;
    }
}
