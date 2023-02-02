package SB101_V2.Sprint_1.day3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Q2 {
    public static void main(String[] args) {
        List<Product> products= new ArrayList<>();

        products.add(new Product(1,"Aloo",120,10));
        products.add(new  Product(2,"Tomato",400,20));
        products.add(new  Product(4,"Jeera",444,40));
        products.add(new  Product(6,"Ssr",555,15));
        products.add(new  Product(12,"eeew",2332,102));


        List<Product> filteredProducts=
                products.stream().filter(product -> product.getQuantity()>10)
                        .sorted((o1, o2) -> o2.getPrice()<o1.getPrice()?1:-1)
                        .collect(Collectors.toList());

        for (Product product :filteredProducts) {
            System.out.println(product);
        }

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