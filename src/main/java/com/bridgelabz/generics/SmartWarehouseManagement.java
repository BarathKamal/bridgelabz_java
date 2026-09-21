package com.bridgelabz.generics;

import java.util.ArrayList;
import java.util.List;

/*
Program to create a smart warehouse management system with the use of
1. Generic class
2. Upper Bounded Type parameters
3. Upper Bounded Wild card in generics
*/

abstract class WarehouseItem {
    private String itemId;
    private String name;

    public WarehouseItem(String itemId, String name) {
        this.itemId = itemId;
        this.name = name;
    }

    public String getId() {
        return itemId;
    }

    public String getName() {
        return name;
    }

    abstract void displayInfo();
}

class Electronics extends WarehouseItem {
    private String brand;

    public Electronics(String itemId, String name, String brand) {
        super(itemId, name);
        this.brand = brand;
    }

    public void displayInfo() {
        System.out.println("Electronics Id: " + this.getId());
        System.out.println("Electronics Name: " + this.getName());
        System.out.println("Electronics Brand: " + brand);
        System.out.println("----------------------------");
    }
}

class Groceries extends WarehouseItem {
    private String expiryDate;

    public Groceries(String itemId, String name, String expiryDate) {
        super(itemId, name);
        this.expiryDate = expiryDate;
    }

    public void displayInfo() {
        System.out.println("Grocery Id: " + this.getId());
        System.out.println("Grocery Name: " + this.getName());
        System.out.println("Grocery Expiry Date: " + this.expiryDate);
        System.out.println("----------------------------");
    }
}

class Furniture extends WarehouseItem {

    private String material;

    public Furniture(String itemId, String name, String material) {
        super(itemId, name);
        this.material = material;
    }

    public void displayInfo() {
        System.out.println("Furniture Id: " + this.getId());
        System.out.println("Furniture Name: " + this.getName());
        System.out.println("Furniture Material: " + material);
        System.out.println("----------------------------");
    }
}


// T is bounded to WarehouseItem, so Storage can only store WarehouseItem subclasses.
class Storage<T extends WarehouseItem> {

    private List<T> items;

    public Storage() {
        this.items = new ArrayList<>();
    }

    // T ensures that only the specific type used during Storage creation can be added.
    public void addItem(T item) {
        items.add(item);
    }

    // Returns the same generic type T, providing type safety without casting.
    public T getItem(int index) {
        return items.get(index);
    }

    public List<T> getAllItems() {
        return items;
    }

    public void displayItems() {
        for (T item : items) {
            item.displayInfo();
            System.out.println("----------------------------");
        }
    }
}


class WarehouseUtility {

    // ? extends WarehouseItem allows this method to accept
    // List<Electronics>, List<Groceries>, List<Furniture>, etc.
    public static void displayAllItems(List<? extends WarehouseItem> items) {

        // We only need to treat each element as a WarehouseItem;
        // the exact subtype is not important here.
        for (WarehouseItem item : items) {
            item.displayInfo();
        }
    }
}


public class SmartWarehouseManagement {

    public static void main(String[] args) {

        Electronics laptop = new Electronics("E101", "Laptop", "HP");
        Groceries milk = new Groceries("G101", "Milk", "25-09-2026");
        Furniture chair = new Furniture("F101", "Chair", "Wood");


        // T = Electronics
        Storage<Electronics> electronicsStorage = new Storage<>();

        // T = Groceries
        Storage<Groceries> groceryStorage = new Storage<>();

        // T = Furniture
        Storage<Furniture> furnitureStorage = new Storage<>();


        electronicsStorage.addItem(laptop);
        groceryStorage.addItem(milk);
        furnitureStorage.addItem(chair);


        // Returns Electronics because T = Electronics.
        Electronics item = electronicsStorage.getItem(0);
        item.displayInfo();


        // Wildcard allows different Storage types to be passed
        // to the same method.
        WarehouseUtility.displayAllItems(electronicsStorage.getAllItems());
        WarehouseUtility.displayAllItems(groceryStorage.getAllItems());
        WarehouseUtility.displayAllItems(furnitureStorage.getAllItems());
    }
}
