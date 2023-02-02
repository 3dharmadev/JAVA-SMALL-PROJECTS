package SB_101.Day_2_Assignment;


import java.util.Scanner;

public class Q2_EXE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      /*  System.out.println("Enter  Productid");
        int id= sc.nextInt();
        System.out.println("Enter ProductName");
        String name= sc.next();
        System.out.println("Enter price");
        int price= sc.nextInt();

        System.out.println("Enter  Quantity");
        int Quantity= sc.nextInt();

        Product  product=new Product();
        Product_Beaan product_bean=new Product_Beaan();
        product_bean.setPid(id); product_bean.setPname(name); product_bean.setPrice(price);
        product_bean.setQuantity(Quantity);
        System.out.println( product.addProduct(product_bean)); */


      /* System.out.println("Enter  Productid");
        int id= sc.nextInt();
        System.out.println("Enter ProductName");
        String name= sc.next();
        Product  product=new Product();
        System.out.println(product.addID_productName(id,name)); */





     /*   Product  product=new Product();
        System.out.println(product.deleteProductLessThan_Two()); */

        System.out.println("Enter ProductName");
        String name= sc.next();
        System.out.println("Enter price");
        int price= sc.nextInt();
        System.out.println("Enter  Quantity");
        int Quantity= sc.nextInt();


        Product product=new Product();
        System.out.println(product.Update_price_Quantity(price,Quantity,name));


        sc.close();
    }
}
