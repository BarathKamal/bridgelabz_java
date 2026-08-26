package com.bridgelabz.java_constructors.level_1;

/*
Program to:
1. Create a class Book with attributes title, author, price and availability
2. Use Default and Parameterized constructors
3. Implement a method to borrow a book
 */

public class Book {

    // private instance variables declaration
    private String title;
    private String author;
    private int price;
    private boolean availability = true;

    // Default constructor
    public Book() {
        title = "Default book";
        author = "Default author";
        price = 100;
    }

    // Parameterized constructor
    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Instance method to borrow a book
    public void borrowBook() {
        availability = false;
        System.out.println("\"" + title + "\" Book is borrowed \n");
    }

    // Instance Method to display the object details
    public void displayDetails() {
        System.out.println("Book Details: ");
        System.out.println("Book Title: " + title);
        System.out.println("Book Author: " + author);
        System.out.println("Book Price: INR " + price);
        if (availability) {
            System.out.println("Book is available");
        } else {
            System.out.println("Book is not available");
        }

    }
}

class BookMain {
    public static void main(String[] args) {
        // Object creation
        Book book1 = new Book();
        Book book2 = new Book("Who moved my cheese?", "Dr. Spencer Johnsor", 500);

        // calling instance method
        book1.displayDetails();
        System.out.println();

        book2.displayDetails();
        System.out.println();

        book2.borrowBook();
        book2.displayDetails();
    }
}
