package SB_101.Day_2_Assignment;



import SB_101.sprint_4.day_1.JDBC.JDBC_Config.JDBC_Conn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Product {

    public String addProduct(Product_Beaan product) {
        String message = "Not Inserted..!";

        try (Connection conn = DB_Connect.Set_Connection()) {

            PreparedStatement ps = conn.prepareStatement("insert into  product values(?,?,?,?)");


            ps.setInt(1, product.getPid());
            ps.setString(2, product.getPname());
            ps.setInt(3, product.getPrice());
            ps.setInt(4, product.getQuantity());


            int x = ps.executeUpdate();

            if (x > 0)
                message = "Record Inserted Successfully..!";

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());

        }

        return message;
    }

    public String addID_productName(int ID,String productName) {
        String message = "Not Inserted..!";
        Product_Beaan product_beaan=new Product_Beaan();
        try (Connection conn = DB_Connect.Set_Connection()) {

            PreparedStatement ps = conn.prepareStatement("insert into  product values(?,?,?,?)");


            ps.setInt(1, ID);
            ps.setString(2, productName);
            ps.setInt(3, product_beaan.getPrice());
            ps.setInt(4, product_beaan.getQuantity());


            int x = ps.executeUpdate();

            if (x > 0)
                message = "Record Inserted Successfully..!";

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());

        }

        return message;
    }



    public String deleteProductLessThan_Two(){
        String message="Not deleted...";


        try (Connection conn =  DB_Connect.Set_Connection()) {

            PreparedStatement ps = conn.prepareStatement("  delete from product where quantity<2");
            int x = ps.executeUpdate();

            if (x > 0)
                message = "Record delete Successfully..!";



        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }


        return message;
    }

    public String Update_price_Quantity(int price,int quantity,String name) {
        String message = "Wrong name..!";

        try (Connection conn =  JDBC_Conn.Set_Connection()) {

            PreparedStatement ps = conn.prepareStatement("UPDATE product  set  price= ? , quantity= ? WHERE pname = ? ");

            ps.setInt(1, price);
            ps.setInt(2, quantity);
            ps.setString(3,name);

            int x = ps.executeUpdate();

            if (x > 0) message = "Price and Quantity Updated Successfully..!";

        } catch (SQLException e) {
            e.printStackTrace();
            message = e.getMessage();
        }

        return message;
    }



}
/*
create table product( pid int primary key ,
pname varchar(10) not null ,
quantity int ,
price int);

Write a Jdbc application to insert 5 different types of Products by taking input from
the User.
● Write a Jdbc application to insert a new Product without quantity and price by taking
input from the user.
● Write a Jdbc application to update the price and quantity of a product by taking the
input from the user.
● Write a Jdbc application to delete all the Products whose quantity is less than 2.
*/