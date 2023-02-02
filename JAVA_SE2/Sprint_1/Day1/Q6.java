package SB_101.Sprint_1.Day1;
/*Q6/- Create a Product1 bean class having the following properties:
productId: int,
productName: String,
quantity: int,
price: int
Day1 Assignment 3
Inside the main method of the Demo class, create a List of 5 products and sort that
list by using price (in descending order)
Note: for sorting, make use of the Lambda expression.*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q6 {
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

        Collections.sort(list,(o1,o2)-> o1.getPrice() > o2.getPrice() ? 1:-1);

        System.out.println(list);
    }
}
class Product{
    private int productId;
    private String productName;
    private int quantity;
    private int price;

    public Product(int productId, String productName, int quantity, int price) {
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
