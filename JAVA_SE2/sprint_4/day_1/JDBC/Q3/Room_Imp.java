package SB_101.sprint_4.day_1.JDBC.Q3;

import SB_101.sprint_4.day_1.JDBC.JDBC_Config.JDBC_Conn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Room_Imp implements Room{
    @Override
    public String addRoom(Room_Bean room) throws RoomException {

        String message = "Not Inserted..!";

        try (Connection conn =  JDBC_Conn.Set_Connection()) {

            PreparedStatement ps = conn.prepareStatement("insert into room values(?,?,?,?,?)");

            ps.setInt(1, room.getRoomNumber());
            ps.setString(2, room.getRoomType());
            ps.setDouble(3, room.getPricePerNight());
            ps.setInt(4,room.getMaximumPerson());
            ps.setBoolean(5,room.isEmpty());


            int x = ps.executeUpdate();

            if (x > 0)
                message = "Record Inserted Successfully..!";

        } catch (SQLException e) {
            e.printStackTrace();
            message = e.getMessage();
            throw new RoomException(e.getMessage());

        }

        return message;
    }

    @Override
    public Room_Bean getRoomByRoomType(String name) throws RoomException {

        Room_Bean room_bean = null;

        try (Connection conn=  JDBC_Conn.Set_Connection()){


            PreparedStatement ps= conn.prepareStatement("select * from room where roomtype=?");

            ps.setString(1, name);

            ResultSet rs= ps.executeQuery();


            if(rs.next()) {

                room_bean = new Room_Bean();

                room_bean.setRoomNumber(rs.getInt("roomNumber"));
                room_bean.setMaximumPerson(rs.getInt("maximumperson"));
                room_bean.setPricePerNight(rs.getDouble("pricepernight"));
                room_bean.setRoomType(rs.getString("roomtype"));
                room_bean.setEmpty(rs.getBoolean("empty"));
            }else
                throw new RoomException("Invalid Room Type Entered");


        } catch (SQLException e) {
            e.printStackTrace();
            throw new RoomException(e.getMessage());
        }

        return  room_bean;

    }

    @Override
    public List<Room_Bean> getEmptyRoom() throws RoomException {
        List<Room_Bean> list= new ArrayList<>();


        try (Connection conn =  JDBC_Conn.Set_Connection()) {

            PreparedStatement ps = conn.prepareStatement(" select * from room where empty=1");

            ResultSet rs =  ps.executeQuery();

            while(rs.next()) {

                Room_Bean room_bean=new Room_Bean();

                room_bean.setRoomNumber(rs.getInt("roomNumber"));
                room_bean.setMaximumPerson(rs.getInt("maximumperson"));
                room_bean.setPricePerNight(rs.getDouble("pricepernight"));
                room_bean.setRoomType(rs.getString("roomtype"));
                room_bean.setEmpty(rs.getBoolean("empty"));

                list.add(room_bean);
            }



        } catch (SQLException e) {
            e.printStackTrace();
            throw new RoomException(e.getMessage());
        }

        return list;

    }

    @Override
    public String addCustomerToRoom(Customer_Bean customer, int roomNumber) throws RoomException {
        String message = "Not Inserted..!";

        try (Connection conn =  JDBC_Conn.Set_Connection()) {

            PreparedStatement ps = conn.prepareStatement("insert into customer values(?,?,?,?)");

            /* customerId   | int(11)     | NO   | PRI | NULL    |       |
| customerName | varchar(12) | NO   |     | NULL    |       |
| address      | varchar(20) | YES  |     | NULL    |       |
| roomNumber*/

            ps.setInt(1, customer.getCustomerId());
            ps.setString(2, customer.getCustomerName());
            ps.setString(3, customer.getAddress());
            ps.setInt(4,roomNumber);


            int x = ps.executeUpdate();

            if (x > 0)
                message = "Record Inserted Successfully..!";

        } catch (SQLException e) {
            e.printStackTrace();
            message = e.getMessage();
            throw new RoomException(e.getMessage());

        }

        return message;
    }

    @Override
    public String removeCustomerFromRoom( int customerId,int roomNumber) throws RoomException {
        String message = "Person not removed..!";

        try (Connection conn =  JDBC_Conn.Set_Connection()) {

            PreparedStatement ps = conn.prepareStatement("delete from customer where customerid= ? and  roomnumber=?");


            ps.setInt(1, customerId);

            ps.setInt(2,roomNumber);


            int x = ps.executeUpdate();

            if (x > 0)
                message = "Person remove Successfully..!";

        } catch (SQLException e) {
            e.printStackTrace();
            message = e.getMessage();
            throw new RoomException(e.getMessage());

        }

        return message;
    }

    @Override
    public List<Customer_Bean> getCustomerFromParticularRoom(int roomNumber) throws RoomException {

        List<Customer_Bean> list= new ArrayList<>();


        try (Connection conn =  JDBC_Conn.Set_Connection()) {

            PreparedStatement ps = conn.prepareStatement("select * from customer where roomnumber=?");
            ps.setInt(1,roomNumber);

            ResultSet rs =  ps.executeQuery();

            while(rs.next()) {

                Customer_Bean customer_bean=new Customer_Bean();
                //customerId | customerName | address | roomNumber
                customer_bean.setCustomerId(rs.getInt("customerId"));
                customer_bean.setCustomerName(rs.getString("customerName"));
                customer_bean.setAddress(rs.getString("address"));
                customer_bean.setRoomNumber(rs.getInt("roomNumber"));


                list.add(customer_bean);
            }



        } catch (SQLException e) {
            e.printStackTrace();
            throw new RoomException(e.getMessage());
        }

        return list;
    }

    @Override
    public List<Room_Bean> getAllRoomDetails()  {
        List<Room_Bean> list= new ArrayList<>();


        try (Connection conn =  JDBC_Conn.Set_Connection()) {

            PreparedStatement ps = conn.prepareStatement("select * from room");

            ResultSet rs =  ps.executeQuery();

            while(rs.next()) {

                Room_Bean room_bean=new Room_Bean();

                room_bean.setRoomNumber(rs.getInt("roomNumber"));
                room_bean.setMaximumPerson(rs.getInt("maximumperson"));
                room_bean.setPricePerNight(rs.getDouble("pricepernight"));
                room_bean.setRoomType(rs.getString("roomtype"));
                room_bean.setEmpty(rs.getBoolean("empty"));

                list.add(room_bean);
            }



        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        return list;

    }
}
