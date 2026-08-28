package com.bridgelabz.java_object_modeling.practice_problems;

import java.util.List;
import java.util.ArrayList;
/*
Program to:
1. create a library book management system
2. demonstrate object modeling (aggregation)
 */

// Library class
public class Library {
    private String name;
    private List<Book> books = new ArrayList<>();

    public Library(String name) {
        this.name = name;
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book " + book.getTitle() + " added to the " + name + "\n");
    }

    public void listBooks() {
        System.out.println("List of books in " + name + ":");
        for (Book book : books) {
            System.out.println(book.getTitle() + " - " + book.getAuthor());
        }
    }
}

// Book class
class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

}

class Main {
    public static void main(String[] args) {
        Library library1 = new Library("SRM Library");
        Library library2 = new Library("Kalaignar Library");

        // creation of books
        Book book1 = new Book("Wings of fire", "Abdul Kalam");
        Book book2 = new Book("Who moved my cheese?", "Dr. Spencer Johnson");
        Book book3 = new Book("Atomic Habits", "James Clear");

        // adding books to the library
        library1.addBook(book1);
        library1.addBook(book2);
        library2.addBook(book2);

        // list of books in library1
        library1.listBooks();
        System.out.println();

        // list of books in library2
        library2.listBooks();
        System.out.println();

        // independent book (book without a library)
        System.out.println("Independent Book: " + book3.getTitle() + " - " + book3.getAuthor());
    }
}
