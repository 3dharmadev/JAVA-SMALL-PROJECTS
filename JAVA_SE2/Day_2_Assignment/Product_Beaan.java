package SB_101.Day_2_Assignment;

public class Product_Beaan {
    private int pid;
    private String pname;
    private int quantity=0;
    private int price=0;

    public Product_Beaan() {
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product_Beaan{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
