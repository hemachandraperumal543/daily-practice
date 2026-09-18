import java.util.*;
class Order{
    public int orderId;
    public String orderedFoods;
    public double totalPrice;
    public String status;

    public double calculateTotalPrice(int unitPrice){
        totalPrice=unitPrice+(unitPrice*5/100.0);
        return totalPrice;
    }
}
class Main {
    public static void main(String[] args) {
        Order order = new Order();
        order.orderId = 101;
        order.orderedFoods = "Pizza";
        order.status = "Ordered";
        order.calculateTotalPrice(200);
        System.out.println("Order Id : " + order.orderId);
        System.out.println("Ordered Foods : " + order.orderedFoods);
        System.out.println("Total Price : " + order.totalPrice);
        System.out.println("Status : " + order.status);
    }
}