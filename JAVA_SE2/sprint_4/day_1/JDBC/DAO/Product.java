package SB_101.sprint_4.day_1.JDBC.DAO;
 

 import SB_101.sprint_4.day_1.JDBC.Model.Product_Bean;

 import java.util.List;

 
public interface Product {
	public String addProductt(Product_Bean product) throws  ProductException;
	
   public List<Product_Bean> getAllProducts() throws  ProductException;
	 public List<Product_Bean> getAllProductQuantityLessThan(int quantity)throws ProductException;
	  public String addProductQuantity(int productId, int Quantity)throws  ProductException;
	  public String deleteProductByProductName(String pname)throws  ProductException;
	  public Product_Bean getProductByProductName(String pname)throws  ProductException;
	 public String deleteProductWhoseNameStart(String name)throws  ProductException;

}

/*
 Product:
productId: int primary key,
productName: varchar(12) not null
price: int
quantity: int
Write a JDBC application using the DAO pattern to implement the following functionalities:
ProductDao(interface):
● public String addProduct(Product product) throws ProdcutException
● public List<Prodcut> getAllProducts() throws ProductException
● public List<Product> getAllProductQuantityLessThan(int quantity)throws ProductException.
● public String addProductQuantity(int productId, int Quantity)throws ProductException
● Public String deleteProductByProductName(String pname)throws ProductException
● public Product getProductByProductName(String pname)throws ProductException
● deleteProductWhoseNameStart(String name)throws ProductException
Note: ProductException should be checked Exception write the use cases for the above           functionalities.*/