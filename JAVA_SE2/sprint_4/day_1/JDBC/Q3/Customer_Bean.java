package SB_101.sprint_4.day_1.JDBC.Q3;

public class Customer_Bean {
    private int customerId;
    private String customerName;
    private String address;
    private int roomNumber;

    public Customer_Bean() {
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return "Customer_Bean{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", address='" + address + '\'' +
                ", roomNumber=" + roomNumber +
                '}';
    }
}

/*Customer:
customerId: int primary key,
customerName: varchar(12) not null
address: varchar(20)
roomNumber: int
Room:*/