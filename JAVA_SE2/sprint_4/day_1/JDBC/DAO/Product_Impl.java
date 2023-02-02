package SB_101.sprint_4.day_1.JDBC.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import SB_101.sprint_4.day_1.JDBC.Model.Product_Bean;
import SB_101.sprint_4.day_1.JDBC.JDBC_Config.JDBC_Conn;


public class Product_Impl implements Product{

	public String addProductt(Product_Bean product) throws ProductException {
		String message = "Not Inserted..!";

		try (Connection conn = JDBC_Conn.Set_Connection()) {

			 PreparedStatement ps = conn.prepareStatement("insert into  Product values(?,?,?,?)");

			 
			ps.setInt(1, product.getProductid());
			ps.setString(2, product.getProductName());
			ps.setInt(3, product.getPrice());
			ps.setInt(4, product.getQuantity());
		 
			 
			int x = ps.executeUpdate();

			if (x > 0)
				message = "Record Inserted Sucessfully..!";
		 
		} catch (SQLException e) {
			e.printStackTrace();
			 throw new ProductException(e.getMessage());
			 
		} 
		
		return message;
	}

	@Override
	public List<Product_Bean> getAllProducts() throws ProductException {
		 
		List<Product_Bean> list= new ArrayList<>();
		 

		try (Connection conn =  JDBC_Conn.Set_Connection()) {

			PreparedStatement ps = conn.prepareStatement("select * from product");
	    	 
		    	ResultSet rs =  ps.executeQuery();
		    	
		    	while(rs.next()) {

		    		 Product_Bean product=new Product_Bean();
		    		
		    		product.setProductid(rs.getInt("Productid"));
		    		product.setProductName(rs.getString("productName"));
		    		product.setPrice( rs.getInt("price"));
		    		product.setQuantity(rs.getInt("quantity"));
		    		
		    	list.add(product);
		    	}
		 
				

		} catch (SQLException e) {
			e.printStackTrace();
			   throw new ProductException(e.getMessage());
		}

		return list;
	}

	@Override
	public List<Product_Bean> getAllProductQuantityLessThan(int quantity) throws ProductException {
		List<Product_Bean> list= new ArrayList<>();
		 

		try (Connection conn =  JDBC_Conn.Set_Connection()) {

			PreparedStatement ps = conn.prepareStatement("select * from product where quantity < ?");
			        ps.setInt(1, quantity);
		    	ResultSet rs =  ps.executeQuery();
		     
		    	while(rs.next()) {

					Product_Bean product=new Product_Bean();
		    		
		    		product.setProductid(rs.getInt("Productid"));
		    		product.setProductName(rs.getString("productName"));
		    		product.setPrice( rs.getInt("price"));
		    		product.setQuantity(rs.getInt("quantity"));
		    		
		    	list.add(product);
		    	}
		 
				

		} catch (SQLException e) {
			e.printStackTrace();
			   throw new ProductException(e.getMessage());
		}

		return list;
	}

	@Override
	public String addProductQuantity(int productId, int Quantity) throws ProductException {

String message="Not inserted...";
		 

		try (Connection conn =  JDBC_Conn.Set_Connection()) {

			PreparedStatement ps = conn.prepareStatement(" insert into product( productId,quantity,productName) values(?,?,'MTS')");
			        ps.setInt(1, productId);
			        ps.setInt(2, Quantity);
			        
			        int x = ps.executeUpdate();

					if (x > 0)
						message = "Record Inserted Sucessfully..!";
		 
				

		} catch (SQLException e) {
			e.printStackTrace();
			   throw new ProductException(e.getMessage());
		}

	 
		return message;
	}

	@Override
	public String deleteProductByProductName(String pname) throws ProductException {
		String message="Not deleted...";
		 

		try (Connection conn =  JDBC_Conn.Set_Connection()) {

			PreparedStatement ps = conn.prepareStatement("  delete from product where productName=?");
			        ps.setString(1, pname);
			         
			        
			        int x = ps.executeUpdate();

					if (x > 0)
						message = "Record delete Sucessfully..!";
		 
				

		} catch (SQLException e) {
			e.printStackTrace();
			   throw new ProductException(e.getMessage());
		}

	 
		return message;
	}

	@Override
	public Product_Bean getProductByProductName(String pname) throws ProductException {
		String message="Not deleted...";

		Product_Bean product=null;
		
		try (Connection conn =  JDBC_Conn.Set_Connection()) {

			PreparedStatement ps = conn.prepareStatement("select * from product where productname=?");
			        ps.setString(1, pname);
			         
			    	ResultSet rs =  ps.executeQuery();
			    	
			        if(rs.next()) {

			        	product=new Product_Bean();
			    		
			    		product.setProductid(rs.getInt("Productid"));
			    		product.setProductName(rs.getString("productName"));
			    		product.setPrice( rs.getInt("price"));
			    		product.setQuantity(rs.getInt("quantity"));
			    		
			    	}
			 
		 
				

		} catch (SQLException e) {
			e.printStackTrace();
			   throw new ProductException(e.getMessage());
		}

	 
		return product;
	}

	@Override
	public String deleteProductWhoseNameStart(String name) throws ProductException {
		String message="Not deleted...";
		 

		try (Connection conn =  JDBC_Conn.Set_Connection()) {

			PreparedStatement ps = conn.prepareStatement(" delete from product where productname LIKE ?%");
			        ps.setString(1, name);
			         
			        
			        int x = ps.executeUpdate();

					if (x > 0)
						message = "Record delete Successfully..!";
		 
				

		} catch (SQLException e) {
			e.printStackTrace();
			   throw new ProductException(e.getMessage());
		}

	 
		return message;
	}


}
