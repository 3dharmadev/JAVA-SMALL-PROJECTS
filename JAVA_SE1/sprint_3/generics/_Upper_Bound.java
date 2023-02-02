package java111.sprint_3.generics;

import java.util.ArrayList;
import java.util.List;

public class _Upper_Bound {
    public static void main(String[] args) {
        //wildcard = unknown
         List<Rectangle> rectangleList=new ArrayList<>();
         rectangleList.add(new Rectangle());
        drawShape(rectangleList);

        List<Circle> circleList=new ArrayList<>();
        circleList.add(new Circle());
        drawShape(circleList);

    }
    static void drawShape(List<? extends Shape> list){
        for (Shape s: list) {
            System.out.println(s);
        }
    }
}
abstract class Shape{
    abstract void draw();
}
class Circle extends Shape{
   @Override
     void draw(){
        System.out.println("draw circle");
    }
}
class Rectangle extends Shape{
    @Override
    void draw() {
        System.out.println("draw rectangle");
    }
}