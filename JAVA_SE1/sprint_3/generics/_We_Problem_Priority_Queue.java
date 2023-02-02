package java111.sprint_3.generics;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class _We_Problem_Priority_Queue {
    public static void main(String[] args) {
        CustomerOrder c1=new CustomerOrder(1,100.0,"customer1");
        CustomerOrder c2=new CustomerOrder(2,50.5,"customer2");
        CustomerOrder c3=new CustomerOrder(3,300.3,"customer3");
        Queue<CustomerOrder> customerOrders = new PriorityQueue<>(new CustomerOrderComparator());
        customerOrders.add(c1);
        customerOrders.add(c2);
        customerOrders.add(c3);
         while (!customerOrders.isEmpty())
             System.out.println(customerOrders.poll());
    }
}

class CustomerOrderComparator implements Comparator<CustomerOrder>{
    @Override
    public int compare(CustomerOrder o1, CustomerOrder o2) {
       if(o1.getOrderAmount() > o2.getOrderAmount()){
           return -1;
       } else if(o1.getOrderAmount() < o2.getOrderAmount()) {
           return 1;
       }
       else return 0;
    }
}
class CustomerOrder {
    private int orderId;
    private double orderAmount;
    private String customerName;

    public CustomerOrder(int orderId,double orderAmount,String customerName){
        this.orderId=orderId;
        this.orderAmount=orderAmount;
        this.customerName = customerName;
    }

    public int getOrderId() {
        return orderId;
    }

    public double getOrderAmount() {
        return orderAmount;
    }



    @Override
    public String toString() {
        return "CustomerOrder{" +
                "orderId=" + orderId +
                ", orderAmount=" + orderAmount +
                ", customerName='" + customerName + '\'' +
                '}';
    }
}