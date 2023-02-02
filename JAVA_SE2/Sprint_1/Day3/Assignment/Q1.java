package SB_101.Sprint_1.Day3.Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Q1 {
    public static void main(String[] args) {
        List<Product> products=new ArrayList<>();
        products.add(new Product(1,"Aloo",120,10));
        products.add(new Product(2,"Tomato",400,20));
        products.add(new Product(4,"Jeera",444,40));
        products.add(new Product(6,"Ssr",555,15));
        products.add(new Product(12,"eeew",2332,102));

        List<Product> filteredProduct = products.stream().filter(s-> s.getQuantity()>10 )
                .sorted((e1,e2)->  e2.getPrice() < e1.getPrice() ? 1:-1 )
                        .collect(Collectors.toList());
        System.out.println(filteredProduct);

    }
}
class Product{
    private int productId;
    private String productName;
    private int price;
    private int quantity;

    public Product(int productId, String productName, int price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
/*Q1/- Create a Product bean class with the following properties:
productId
productName
price
quantity
From the main method of the Demo class performs the following operations:
1. Create a List of 5 product objects.
2. From the product list filter the products whose quantity is more than 10 in a
separate List of Products.
3. Sort the Filtered List of Products by the price in ascending order.
4. Print all the products one by one from both Lists (original list and Filtered list)
Note: for filtering and printing and sorting make use of Stream or Lambda
expressions.
*/
