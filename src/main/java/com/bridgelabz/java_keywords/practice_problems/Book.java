package com.bridgelabz.java_keywords.practice_problems;

/*
Program to create a Library Management System and demonstrate the use of
the keywords static, this, final and instanceof
 */

public class Book {
    // static keyword to store libraryName
    public static String libraryName = "ABC Library";
    public String title;
    public String author;
    public final long isbn; // final keyword to avoid changing isbn

    // 'this' keyword to avoid ambiguity with method parameters
    public Book(String title, String author, long isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // static method to display the libraryName
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // instance method to display the book details
    public void displayBookDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN number: " + isbn);
    }
}

class BookMain {
    public static void main(String[] args) {
        Book book = new Book("Who moved my cheese?", "Dr. Spencer Johnsor", 989645881);

        // instanceof keyword to check whether the object is an instance of this specific class
        if (book instanceof Book) {
            book.displayBookDetails();
            book.displayLibraryName();
        }
    }
}
