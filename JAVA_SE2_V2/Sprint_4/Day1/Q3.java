package SB101_V2.Sprint_4.Day1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Q3 {
     public static void main(String[] args) {

          Scanner sc=new Scanner(System.in);
          DaoImpl dao=new DaoImpl();
         /* Product product=new Product();
          System.out.println("Enter product ID");
          product.setPid(sc.nextByte());
          System.out.println("Enter product Name");
          product.setpName(sc.next());
          System.out.println("Enter  product price");
          product.setPrice(sc.nextInt());
          System.out.println("Enter Product Quantity");
          product.setQuantity(sc.nextInt());
          DaoImpl dao=new DaoImpl();
        String ans=  dao.insertDataIntoProduct(product); */

//      Product product=new Product();
//          System.out.println("Enter product ID");
//          product.setPid(sc.nextByte());
//          System.out.println("Enter product Name");
//          product.setpName(sc.next());
//
//          String ans=  dao.insertDataWithoutQuantityAndPrice(product);
//          System.out.println(ans);
        System.out.println("Enter price then quantity then id in sequential order");
         System.out.println(dao.updatePriceQuantity(sc.nextInt(),sc.nextInt(), sc.nextByte()));

     }
}

class DaoImpl{

     String insertDataIntoProduct(Product product){
          String message="Not inserted...";
          try(Connection conn=Q2.getConnection()) {
             PreparedStatement ps=  conn.prepareStatement("insert into Product values(?,?,?,?)");
               ps.setInt(1,product.getPid());
               ps.setString(2,product.getpName());
               ps.setInt(3,product.getQuantity());
               ps.setInt(4,product.getPrice());
              int ans= ps.executeUpdate();
              if(ans>0) message="Inserted successfully...";
          }
          catch (SQLException e){
               message=e.getMessage();
               System.out.println(e.getMessage());
          }
          return message;
     }
      String insertDataWithoutQuantityAndPrice(Product product){
           String message="Not inserted...";


                try(Connection conn=Q2.getConnection()) {
                     PreparedStatement ps=  conn.prepareStatement("insert into Product(pid,pname) values(?,?)");
                     ps.setInt(1,product.getPid());
                     ps.setString(2,product.getpName());
                     int ans= ps.executeUpdate();
                     if(ans>0) message="Inserted successfully...";
           }catch (SQLException e){
                message=e.getMessage();
                System.out.println(e.getMessage());
           }

          return message;
      }

      String updatePriceQuantity(int price,int quantity,int id){
         String message="Unable to update...";

         try(Connection connection=Q2.getConnection()){
            PreparedStatement ps=  connection.prepareStatement("update product set price=? , quantity=? where pid=?");
           ps.setInt(1,price);
           ps.setInt(2,quantity);
           ps.setInt(3,id);
           int res=ps.executeUpdate();
           if(res>0) message="updated successfully";
         }
         catch (SQLException e){
             message=e.getMessage();

         }

         return message;

      }

      String deleteProductQuantityLessThan2(){
         String message="Not Query less than quantity 2..";
         try(Connection connection=Q2.getConnection()){
          PreparedStatement ps=   connection.prepareStatement("delete from product where quantity<2");
          int res=   ps.executeUpdate();
          if(res>0) message="successfully deleted"+res+" record..";
         }
         catch (SQLException e) {
            message= e.getMessage();
         }

         return message;
      }


}

/*● Write a Jdbc application to insert 5 different types of Products by taking input from the User.
● Write a Jdbc application to insert a new Product without quantity and price by taking input from   the user.
● Write a JDBC application to update the price and quantity of a product by taking the input from the user.
● Write a Jdbc application to delete all the Products whose quantity is less than 2.*/