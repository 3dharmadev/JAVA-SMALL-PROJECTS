package SB101_V2.Sprint_1.EVA;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Q1 {
    public static void main(String[] args) {

        /*Functional programming is a style of programming that emphasizes the
        evaluation of expressions rather than the execution of commands. It takes less code and time as well.
        Function interface contains only one abstract method through which using lambda expression we can use functional programming in java
        */

    Predicate<Product>  p2= s -> s.getQuantity()<5;
        System.out.println(p2.test(new Product(1,"pen",20,10)));


        Consumer<Product>  c1 = product -> {
            System.out.println("product name"+product.getName());
            System.out.println("product price "+product.getPrice());
            System.out.println("product quantity "+product.getQuantity());
        };
        c1.accept(new Product(1,"pen",20,10));

        Supplier<Product> s1 = () -> new Product(1,"pen",20,10);
        System.out.println(s1.get());

        Function<String,Product> f1 =s -> {
            String[] str = s.split(", ",4);
            int id= Integer.parseInt(str[0]);
            String name= str[1];
            double price=  Double.parseDouble(str[2]);

            int price2= (int) price;


            int quantity= Integer.parseInt(str[3]);
            System.out.println(Arrays.toString(str));
             return new Product(id,name,price2,quantity);
          //return  new Product(1,"pen",20,10);
        };
     Product product= f1.apply("1, Pen, 20.00, 100");
        System.out.println("Function "+product);
    }
}
class Product{

    private int id;
    private String name;
    private int price;
    private int quantity;

    public Product(int id, String name, int price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}

/*What do you mean by Functional programming and Functional interface?
Write the implementations of all the following Functional interfaces with examples
using the Lambda expression:

- Predicate<Product>: If the Product quantity is less than 5.
- Consumer<Product>: Print the Product's details.
- Supplier<Product>: Get the Product object with all details(productId, productName, price, quantity).
- Function<String, Product>: It takes the Product details in comma separated
String format.
 L**ike:** String prod= “1, Pen, 20.00, 100” , (Here the details are productId, productName, price and quantity)
 and return the Product Object based on this comma-separated String.*/