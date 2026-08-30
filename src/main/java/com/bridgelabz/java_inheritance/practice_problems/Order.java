package com.bridgelabz.java_inheritance.practice_problems;

/*
Program to
1. demonstrate multilevel inheritance through a superclass Order, subclass ShippedOrder
extending Order class and subclass DeliveredOrder extending the ShippedOrder class
 */

// superclass Order
public class Order {
    protected int orderId;
    protected String orderDate;
    protected String orderStatus = "Ordered";

    public Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void displayDetails() {
        System.out.println("Order details: ");
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
    }
}

// subclass ShippedOrder extending superclass Order
class ShippedOrder extends Order {
    protected int trackingNumber; // subclass specific attribute

    public ShippedOrder(int orderId, String orderDate, int trackingNumber) {
        super(orderId, orderDate); // constructor chaining
        this.trackingNumber = trackingNumber;
        this.orderStatus = "Shipped";
    }

    // method overriding
    @Override
    public void displayDetails() {
        System.out.println("Order details: ");
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Tracking Number: " + trackingNumber);
    }
}

// subclass DeliveredOrder extending subclass ShippedOrder
class DeliveredOrder extends ShippedOrder {
    protected String deliveryDate; // subclass specific attribute

    public DeliveredOrder(int orderId, String orderDate, int trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber); // constructor chaining
        this.deliveryDate = deliveryDate;
        this.orderStatus = "Delivered";
    }

    // method overriding
    @Override
    public void displayDetails() {
        System.out.println("Order details: ");
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Tracking Number: " + trackingNumber);
        System.out.println("Delivery Date: " + deliveryDate);
    }
}

class OrderMain {
    public static void main(String[] args) {
        Order order = new Order(1, "26-08-2026");
        ShippedOrder shippedOrder = new ShippedOrder(2, "27-08-2026", 1234);
        DeliveredOrder deliveredOrder = new DeliveredOrder(3, "01-09-2026", 2345, "08-09-2026");

        // Order object calling overridden method
        order.displayDetails();
        System.out.println("Order status: " + order.getOrderStatus());

        // ShippedOrder object calling overridden method
        shippedOrder.displayDetails();
        System.out.println("Order status: " + shippedOrder.getOrderStatus());

        // DeliveredOrder object calling overridden method
        deliveredOrder.displayDetails();
        System.out.println("Order status: " + deliveredOrder.getOrderStatus());
    }
}
