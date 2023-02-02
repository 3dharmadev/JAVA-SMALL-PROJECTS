package SB101_V2.Sprint_1.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q3 {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		
		list.add(new Product(1, "Chacola", 12, 122222));
		list.add(new Product(2, "Rice", 11, 34953));
		list.add(new Product(3, "Pizza", 12, 12000));
		list.add(new Product(4, "Mleic", 15, 4362));
		list.add(new Product(1, "Chacola", 12, 122222));
		
		Collections.sort(list, (p1,p2)-> p1.getPrice()>p2.getPrice()? -1:1);
		
		 
		for (Product product : list) {
			System.out.println(product);
		}
		
		
       
	}

}
/*
Create a Product bean class having the following properties:

```java
class Product{
productId: int
productName: String
quantity: int
price: int
}
```

Inside the main method of the Demo class, create a List of 5 products and sort that list by using price (in descending order)

**Note:** for sorting, make use of the Lambda expression.*/

class Product {
	
	private int productId;
	private String productNameString;
	private int quantity;
	private int price;
	
	
	
	
	
	public Product(int productId, String productNameString, int quantity, int price) {
		super();
		this.productId = productId;
		this.productNameString = productNameString;
		this.quantity = quantity;
		this.price = price;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductNameString() {
		return productNameString;
	}
	public void setProductNameString(String productNameString) {
		this.productNameString = productNameString;
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
		return "Product [productId=" + productId + ", productNameString=" + productNameString + ", quantity=" + quantity
				+ ", price=" + price + "]";
	}
	
	
	
}