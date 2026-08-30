package com.bridgelabz.java_inheritance.practice_problems;

/*
Program to
1. Create Book superclass and Author subclass
2. demonstrate single inheritance through subclass, specific attributes in subclass
 */

// superclass Book
public class Book {
    protected String title;
    protected int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
}

// subclass Author
class Author extends Book {
    private String name;
    private String country;

    public Author(String name, String country, String title, int publicationYear) {
        super(title, publicationYear); // Constructor chaining using super()
        this.name = name;
        this.country = country;
    }

    // instance method to display the details
    public void displayDetails() {
        System.out.println("Author and Book details: ");
        System.out.println("Book Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("Author: " + name);
        System.out.println("Country: " + country);
    }
}

class BookMain {
    public static void main(String[] args) {
        // subclass object creation
        Author author = new Author("Dr. Spencer Johnsor", "USA", "Who moved my cheese?", 1998);
        author.displayDetails();
    }
}
