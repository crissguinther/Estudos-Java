package application;

import java.util.Date;

import entities.Order;
import entitiesenums.OrderStatus;

public class Program {
    public static void main(String[] args) throws Exception {

        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

    }
}
