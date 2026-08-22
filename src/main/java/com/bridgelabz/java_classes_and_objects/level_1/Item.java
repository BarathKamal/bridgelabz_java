package com.bridgelabz.java_classes_and_objects.level_1;

import java.util.Scanner;

public class Item {
    private int itemCode;
    private String itemName;
    private int price;

    public Item(int itemCode, String itemName, int price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    public int calculateTotalCost(int quantity) {
        int totalCost = quantity * price;
        return totalCost;
    }

    public void displayDetails() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Item code: " + itemCode);
        System.out.println("Item Price: " + price);
    }
}

class ItemMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Item item = new Item(1253,"Shampoo", 70);
        item.displayDetails();

        System.out.print("Enter the total quantity of the item: ");
        int quantity = scanner.nextInt();
        int totalCost = item.calculateTotalCost(quantity);
        System.out.println("Total cost: " + totalCost);

        scanner.close();

    }
}
