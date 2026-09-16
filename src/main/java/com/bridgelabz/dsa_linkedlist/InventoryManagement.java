package com.bridgelabz.dsa_linkedlist;

/*
 * Inventory management system using singly linked list.
 */

class ItemNode {
    private String name;
    private int id;
    private int quantity;
    private double price;
    private ItemNode next;

    public ItemNode(String name, int id, int quantity, double price) {
        this.name = name;
        this.id = id;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }

    public int getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public ItemNode getNext() {
        return next;
    }

    public void setNext(ItemNode item) {
        next = item;
    }
}

class ItemLinkedList {
    private ItemNode head;

    public ItemLinkedList(ItemNode head) {
        this.head = head;
    }

    // Insert item at the beginning
    public void addItemAtBeginning(ItemNode item) {
        item.setNext(head);
        head = item;
    }

    // Insert item at the end
    public void addItemAtEnd(ItemNode item) {
        if (head == null) {
            head = item;
            return;
        }

        ItemNode last = head;

        while (last.getNext() != null) {
            last = last.getNext();
        }

        last.setNext(item);
    }

    // Insert item at a specific position
    public void addItemAtPosition(ItemNode item, int targetPosition) {
        if (targetPosition < 1) {
            System.out.println("Invalid position!");
            return;
        }

        if (targetPosition == 1) {
            addItemAtBeginning(item);
            return;
        }

        ItemNode curr = head;

        for (int i = 2; i < targetPosition && curr != null; i++) {
            curr = curr.getNext();
        }

        if (curr != null) {
            item.setNext(curr.getNext());
            curr.setNext(item);
        }
    }

    // Delete item by ID
    public void deleteById(int id) {
        if (head == null) {
            System.out.println("No elements to perform the operation");
            return;
        }

        if (head.getId() == id) {
            head = head.getNext();
            return;
        }

        ItemNode curr = head;

        while (curr.getNext() != null) {
            if (curr.getNext().getId() == id) {
                curr.setNext(curr.getNext().getNext());
                return;
            }

            curr = curr.getNext();
        }

        System.out.println("No element with given Id - " + id + " is found");
    }

    // Update quantity by ID
    public void updateQuantityById(int extraQuantity, int id) {
        if (head == null) {
            System.out.println("No items available to perform update operation");
            return;
        }

        ItemNode curr = head;

        while (curr != null) {
            if (curr.getId() == id) {
                int newQuantity = curr.getQuantity() + extraQuantity;
                curr.setQuantity(newQuantity);
                return;
            }

            curr = curr.getNext();
        }

        System.out.println("No item is found with item Id - " + id);
    }

    // Search item by ID
    public ItemNode searchItemById(int id) {
        if (head == null) {
            System.out.println("No items in the list");
            return null;
        }

        ItemNode curr = head;

        while (curr != null) {
            if (curr.getId() == id) {
                return curr;
            }

            curr = curr.getNext();
        }

        System.out.println("Item with given id - " + id + " is not found");
        return null;
    }

    // Calculate total inventory value
    public double calculateTotalPrice() {
        double total = 0;
        ItemNode curr = head;

        while (curr != null) {
            total += curr.getQuantity() * curr.getPrice();
            curr = curr.getNext();
        }

        return total;
    }
}

public class InventoryManagement {
    public static void main(String[] args) {

        ItemNode item1 = new ItemNode("Laptop", 101, 5, 55000.00);
        ItemNode item2 = new ItemNode("Mouse", 102, 20, 750.00);
        ItemNode item3 = new ItemNode("Keyboard", 103, 15, 1200.00);
        ItemNode item4 = new ItemNode("Monitor", 104, 10, 15000.00);
        ItemNode item5 = new ItemNode("Headphones", 105, 25, 2500.00);

        ItemLinkedList list = new ItemLinkedList(item1);

        list.addItemAtBeginning(item2);
        list.addItemAtEnd(item3);
        list.addItemAtEnd(item4);
        list.addItemAtPosition(item5, 3);

        list.deleteById(103);

        double total = list.calculateTotalPrice();
        System.out.println("Total Price of the items: Rs. " + total);

        list.updateQuantityById(5, 101);

        ItemNode updateItem = list.searchItemById(101);

        if (updateItem != null) {
            System.out.println(
                    "Updated quantity of item with id - "
                            + updateItem.getId()
                            + " is "
                            + updateItem.getQuantity()
            );
        }
    }
}
