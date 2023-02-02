package SB_101.sprint_4.day_1.JDBC.Q3;

import java.util.List;

public interface Room {
                public String addRoom(Room_Bean room) throws RoomException;
              public Room_Bean getRoomByRoomType(String name)throws RoomException;
              public List<Room_Bean> getEmptyRoom()throws RoomException;
            public String addCustomerToRoom(Customer_Bean customer, int roomNumber)throws RoomException;
              public String removeCustomerFromRoom(int customerId, int roomNumber)throws RoomException;
            public List<Customer_Bean> getCustomerFromParticularRoom(int roomNumber) throws RoomException;
              public List<Room_Bean> getAllRoomDetails();
}


/*stablish one-to-many relationships between the Room and Customer table
● Write a JDBC application using the DAO pattern to implement the following functionalities:
RoomDao(interface):
● public String addRoom(Room room) throws RoomException
● public Room getRoomByRoomType(String name)throws RoomException
● public List<Room> getEmptyRoom()throws RoomException
● public String addCustomerToRoom(Customer customer, int roomNumber)throws RoomException
● public String removeCustomerFromRoom(int customerId, int roomNumber)throws   RoomException
● public List<Customer> getCustomerFromParticularRoom(int roomNumber) throws      RoomException
● public List<Room> getAllRoomDetails()
Note: RoomException should be checked Exception write the use cases for the above functionalities.*/