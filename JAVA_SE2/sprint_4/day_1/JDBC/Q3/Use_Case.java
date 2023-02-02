package SB_101.sprint_4.day_1.JDBC.Q3;

import java.util.Scanner;

public class Use_Case {
    public static void main(String[] args) throws RoomException {
        Scanner sc = new Scanner(System.in);
        Room_Bean room_bean= new Room_Bean();
       /* System.out.println("Enter Number");
        room_bean.setRoomNumber(sc.nextInt());
        System.out.println("Enter Type");
        room_bean.setRoomType(sc.next());
        System.out.println("Enter PricePerNight");
        room_bean.setPricePerNight(sc.nextDouble());
        System.out.println("Enter MaximumPerson can stay in that room");
        room_bean.setMaximumPerson(sc.nextInt());
        System.out.println("Enter room is empty in true false");
        room_bean.setEmpty(sc.nextBoolean()); */
        Room room=new Room_Imp();


            //System.out.println(room.addRoom(room_bean));


//        System.out.println("Enter Type");
//        System.out.println(room.getRoomByRoomType(sc.next()));

       // System.out.println(room.getEmptyRoom());

        Customer_Bean customer_bean=new Customer_Bean();
       /*
        System.out.println("Enter customer id");
        customer_bean.setCustomerId(sc.nextInt());
        System.out.println("Enter customer name");
       customer_bean.setCustomerName(sc.next());
        System.out.println("Enter customer address");
        customer_bean.setAddress(sc.next());
        System.out.println("Enter Room Number");
        int roomNumber=sc.nextInt();

        System.out.println(room.addCustomerToRoom(customer_bean,roomNumber)); */

       /* System.out.println("Enter customer id");
        System.out.println("Enter Room Number");
        System.out.println(room.removeCustomerFromRoom(sc.nextInt(), sc.nextInt())); */



//        System.out.println("Enter Room Number");
//        System.out.println(room.getCustomerFromParticularRoom(sc.nextInt()));


        System.out.println(room.getAllRoomDetails());



        sc.close();
    }
}
