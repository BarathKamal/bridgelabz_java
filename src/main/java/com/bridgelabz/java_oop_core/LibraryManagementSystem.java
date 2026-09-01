package com.bridgelabz.java_oop_core;

// Interface
interface Reservable {
    void reserveItem();

    boolean checkAvailability();
}

// Abstraction
abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;

    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Encapsulation
    public int getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Abstract method
    public abstract int getLoanDuration();

    // Concrete method
    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Loan Duration: " + getLoanDuration() + " days");
    }
}

// Inheritance and Interface Implementation
class Book extends LibraryItem implements Reservable {

    private boolean available = true;
    private int loanDuration = 21;

    public Book(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    // superclass method overriding
    @Override
    public int getLoanDuration() {
        return loanDuration;
    }

    // interface method overriding
    @Override
    public void reserveItem() {
        if (available) {
            available = false;
            System.out.println("Book reserved successfully.");
        } else {
            System.out.println("Book is already reserved.");
        }
    }

    // interface method overriding
    @Override
    public boolean checkAvailability() {
        return available;
    }
}

class Magazine extends LibraryItem implements Reservable {

    private boolean available = true;
    int loanDuration = 7;

    public Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    // superclass method overriding
    @Override
    public int getLoanDuration() {
        return loanDuration;
    }

    // interface method overriding
    @Override
    public void reserveItem() {
        if (available) {
            available = false;
            System.out.println("Magazine reserved successfully.");
        } else {
            System.out.println("Magazine is already reserved.");
        }
    }

    // interface method overriding
    @Override
    public boolean checkAvailability() {
        return available;
    }
}

class DVD extends LibraryItem implements Reservable {

    private boolean available = true;
    private int loanDuration = 3;

    public DVD(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    // superclass method overriding
    @Override
    public int getLoanDuration() {
        return loanDuration;
    }

    // interface method overriding
    @Override
    public void reserveItem() {
        if (available) {
            available = false;
            System.out.println("DVD reserved successfully.");
        } else {
            System.out.println("DVD is already reserved.");
        }
    }

    // interface method overriding
    @Override
    public boolean checkAvailability() {
        return available;
    }
}

public class LibraryManagementSystem {

    public static void main(String[] args) {

        // Polymorphism
        LibraryItem book =
                new Book(101, "Clean Code", "Robert C. Martin");

        LibraryItem magazine =
                new Magazine(102, "National Geographic", "Various Authors");

        LibraryItem dvd =
                new DVD(103, "Inception", "Christopher Nolan");

        // Same LibraryItem reference manages different types
        book.getItemDetails();
        System.out.println();

        magazine.getItemDetails();
        System.out.println();

        dvd.getItemDetails();
        System.out.println();

        // Interface reference for reservation functionality
        Reservable reservableBook = (Reservable) book;

        System.out.println("Available: "
                + reservableBook.checkAvailability());

        reservableBook.reserveItem();

        System.out.println("Available after reservation: "
                + reservableBook.checkAvailability());
    }
}