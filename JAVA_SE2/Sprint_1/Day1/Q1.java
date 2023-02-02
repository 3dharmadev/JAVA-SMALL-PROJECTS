package SB_101.Sprint_1.Day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
*1. Comparable works with single type sorting sequences while Comparator will work with multiple sorting sequences
* Example if we use comparable we need to modify inside that class only while working with comparator we works outside
* of the class that makes multiple sorting sequence .
* 2.It affects original class cause we modify original class to sorting the type while comparator better to safe your class
* without modifying it.
* 3.Comparable provides compareTo method while Comparator provides compare methods to work with.
* 4.we can sort 
*
* */
public class Q1 {
    public static void main(String[] args) {
        
        
        Product1 p1= new Product1(1,"Milk",10,450);
        Product1 p2= new Product1(2,"Rice",1,900);
        Product1 p3= new Product1(3,"Hand wash",10,160);
        Product1 p4= new Product1(4,"Soap",5,50);
        Product1 p5= new Product1(5,"Software",1,4500);


        List<Product1> list=new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
     //this is the example of comparator sorting , here without creating long large class we can create anonymous class using LE
        Collections.sort(list,(o1, o2)-> o1.getPrice() > o2.getPrice() ? 1:-1);

        System.out.println(list);
    }
}
class Product1 {
    private int productId;
    private String productName;
    private int quantity;
    private int price;

    public Product1(int productId, String productName, int quantity, int price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product1{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}