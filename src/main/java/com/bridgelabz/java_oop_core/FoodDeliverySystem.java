package com.bridgelabz.java_oop_core;

/*
Program to demonstrate Inheritance, abstraction, encapsulation and polymorphism
using a Food Delivery System
 */

// Interface
interface Discountable {
    void applyDiscount(double percentage);
    void getDiscountDetails();
}

// Abstraction
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Encapsulation
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Protected setter used only by subclasses
    protected void setPrice(double price) {
        this.price = price;
    }

    // Abstract method
    public abstract double calculateTotalPrice();

    // Concrete method
    public void getItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price: ₹" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: ₹" + calculateTotalPrice());
    }
}

// Inheritance and Interface Implementation
class VegItem extends FoodItem implements Discountable {

    private double discount = 0;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    // Method Overriding
    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public void applyDiscount(double percentage) {
        discount = percentage;
        setPrice(getPrice() - (getPrice() * percentage / 100));
    }

    @Override
    public void getDiscountDetails() {
        System.out.println("Veg Item Discount Applied: " + discount + "%");
    }
}

// Inheritance and Interface Implementation
class NonVegItem extends FoodItem implements Discountable {

    private double discount = 0;
    private static final double EXTRA_CHARGE = 50;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    // Method overriding
    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + EXTRA_CHARGE;
    }

    @Override
    public void applyDiscount(double percentage) {
        discount = percentage;
        setPrice(getPrice() - (getPrice() * percentage / 100));
    }

    @Override
    public void getDiscountDetails() {
        System.out.println("Non-Veg Item Discount Applied: " + discount + "%");
    }
}

public class FoodDeliverySystem {

    // Polymorphic order processing
    public static void processOrder(FoodItem item) {
        item.getItemDetails();
        System.out.println("------------------------");
    }

    public static void main(String[] args) {

        // Polymorphism
        FoodItem veg = new VegItem("Paneer Biryani", 180, 2);
        FoodItem nonVeg = new NonVegItem("Chicken Biryani", 250, 2);

        processOrder(veg);
        processOrder(nonVeg);

        Discountable vegDiscount = (Discountable) veg;
        vegDiscount.applyDiscount(10);
        vegDiscount.getDiscountDetails();

        System.out.println("\nAfter Discount:");
        processOrder(veg);
    }
}