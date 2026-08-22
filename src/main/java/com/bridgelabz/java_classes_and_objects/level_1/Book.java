package com.bridgelabz.java_classes_and_objects.level_1;

public class Book {
    private String title;
    private String author;
    private int price;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Book details: ");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

class BookMain {
    public static void main(String[] args) {

        Book book = new Book("Who moved my cheese?", "Dr. Spencer Johnsor", 500);
        book.displayDetails();
    }
}

