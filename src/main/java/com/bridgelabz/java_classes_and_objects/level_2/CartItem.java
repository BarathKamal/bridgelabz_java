package com.bridgelabz.java_classes_and_objects.level_2;

import java.sql.SQLOutput;

public class CartItem {
    private String itemName;
    private int price;
    private int quantity;

    public CartItem(String itemName,int price) {
        this.itemName = itemName;
        this.price = price;
    }

    public void addItem() {
        this.quantity += 1;
    }

    public void removeItem() {
        this.quantity -= 1;
    }

    public int calculateTotalPrice() {
        int total = this.quantity * this.price;
        return total;
    }

    public void displayDetails(int totalPrice) {
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: Rs." + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: Rs." + totalPrice);
    }
}

class CartItemMain {
    public static void main(String[] args) {
        CartItem cartItem = new CartItem("Tooth Brush", 20);

        cartItem.addItem();
        cartItem.addItem();
        cartItem.addItem();

        cartItem.removeItem();

        int totalPrice = cartItem.calculateTotalPrice();

        cartItem.displayDetails(totalPrice);
    }
}
