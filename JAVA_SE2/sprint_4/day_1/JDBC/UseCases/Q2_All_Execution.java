package SB_101.sprint_4.day_1.JDBC.UseCases;

import java.util.Scanner;


import SB_101.sprint_4.day_1.JDBC.DAO.ProductException;

public class Q2_All_Execution {

	public static void main(String[] args) throws ProductException {
		 Scanner sc = new Scanner(System.in);
			
		/*Add_Product Execution
		 System.out.println("Enter  Productid");
			int id= sc.nextInt();
			 System.out.println("Enter getProductName");
				String name= sc.next();
				System.out.println("Enter price");
				int price= sc.nextInt();
				
				System.out.println("Enter  Quantity");
				int Quantity= sc.nextInt();


				Product p= new Product_Impl();

		Product_Bean product_bean=new Product_Bean();
		product_bean.setProductName(name); product_bean.setProductid(id); product_bean.setPrice(price);
		product_bean.setQuantity(Quantity);

             String str=  p.addProductt(product_bean);
		System.out.println(str);  */


		/* print all products
		Product p= new Product_Impl();

		List<Product_Bean> list=p.getAllProducts();
		System.out.println(list);  */


/* Quantity less than
		System.out.println("Enter  Quantity");
		int Quantity= sc.nextInt();
		Product p= new Product_Impl();

		List<Product_Bean> list= p.getAllProductQuantityLessThan(Quantity);
		System.out.println(list);
                 */

		/*
		System.out.println("Enter  Productid");
		int id= sc.nextInt();
		System.out.println("Enter  Quantity");
		int Quantity= sc.nextInt();

		Product p= new Product_Impl();

		String list= p.addProductQuantity(id,Quantity);
		System.out.println(list); */

	/*	System.out.println("Enter  Product name");
		String name= sc.next();

		Product p= new Product_Impl();

		String list= p.deleteProductByProductName(name);
		System.out.println(list); */

		/*System.out.println("Enter  Product name");
		String name= sc.next();

		Product p= new Product_Impl();

		Product_Bean bean= p.getProductByProductName(name);
		System.out.println(bean); */

		/*System.out.println("Enter Product First name to delete");
		String name= sc.next();

		Product p= new Product_Impl();

		String str= p.deleteProductByProductName(name);
		System.out.println(str); */














//				
//				p.deleteProductByProductName(name);
//				p.deleteProductWhoseNameStart(name);
				//p.addProductQuantity(id, Quantity);
				
				/*  public List<Execute_Class.Product> getAllProducts() throws  ProductException;
	 public List<Execute_Class.Product> getAllProductQuantityLessThan(int quantity)throws ProductException;
	  public String addProductQuantity(int productId, int Quantity)throws  ProductException;
	  public String deleteProductByProductName(String pname)throws  ProductException;
	  public Execute_Class.Product getProductByProductName(String pname)throws  ProductException;
	 public String deleteProductWhoseNameStart(String name)throws  ProductException;*/
			 
			
	}

}
