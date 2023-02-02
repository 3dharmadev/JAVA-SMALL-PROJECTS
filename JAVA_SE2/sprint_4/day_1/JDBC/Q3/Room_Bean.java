package SB_101.sprint_4.day_1.JDBC.Q3;

public class Room_Bean {
    private int roomNumber;
    private String roomType;
    private double pricePerNight;
    private int maximumPerson;
    private boolean empty;


    public Room_Bean() {
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public int getMaximumPerson() {
        return maximumPerson;
    }

    public void setMaximumPerson(int maximumPerson) {
        this.maximumPerson = maximumPerson;
    }

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    @Override
    public String toString() {
        return "Room_Bean{" +
                "roomNumber=" + roomNumber +
                ", roomType='" + roomType + '\'' +
                ", pricePerNight=" + pricePerNight +
                ", maximumPerson=" + maximumPerson +
                ", empty=" + empty +
                '}';
    }
}
/*
roomNumber: int primary key,
RoomType: varchar(12) not null
pricePerNight: double
maximumPerson: int
empty:boolean*/