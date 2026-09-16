package com.bridgelabz.dsa_linkedlist;
/*
Program to implement Movie management system using doubly linked list
 */
class MovieNode {
    private String title;
    private String director;
    private int year;
    private double rating;
    private MovieNode next;
    private MovieNode prev;

    public MovieNode(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getYear() {
        return year;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public MovieNode getNext() {
        return next;
    }

    public void setNext(MovieNode movie) {
        next = movie;
    }

    public MovieNode getPrev() {
        return prev;
    }

    public void setPrev(MovieNode movie) {
        prev = movie;
    }
}

class DLL {
    private MovieNode head;
    private MovieNode tail;

    public DLL() {
    }

    public DLL(MovieNode head, MovieNode tail) {
        this.head = head;
        this.tail = tail;
    }

    // Insert movie at the beginning
    public void addMovieAtBeginning(MovieNode movie) {
        if (head == null) {
            head = movie;
            tail = movie;
            return;
        }

        movie.setNext(head);
        head.setPrev(movie);
        head = movie;
    }

    // Insert movie at the end
    public void addMovieAtEnd(MovieNode movie) {
        if (head == null) {
            head = movie;
            tail = movie;
            return;
        }

        tail.setNext(movie);
        movie.setPrev(tail);
        tail = movie;
    }

    // Insert movie at a specific position
    public void addMovieAtPosition(MovieNode movie, int position) {
        if (position < 1) {
            System.out.println("Position is invalid!");
            return;
        }

        if (position == 1) {
            addMovieAtBeginning(movie);
            return;
        }

        MovieNode curr = head;

        for (int i = 1; i < position - 1 && curr != null; i++) {
            curr = curr.getNext();
        }

        if (curr == null) {
            System.out.println("Position is invalid!");
            return;
        }

        if (curr == tail) {
            addMovieAtEnd(movie);
            return;
        }

        movie.setNext(curr.getNext());
        movie.setPrev(curr);
        curr.getNext().setPrev(movie);
        curr.setNext(movie);
    }

    // Delete movie by title
    public void deleteMovieByTitle(String title) {
        if (head == null) {
            System.out.println("There are no movies to delete.");
            return;
        }

        MovieNode curr = head;

        while (curr != null) {
            if (curr.getTitle().equals(title)) {

                if (curr == head) {
                    head = curr.getNext();

                    if (head != null) {
                        head.setPrev(null);
                    } else {
                        tail = null;
                    }

                    return;
                }

                if (curr == tail) {
                    tail = curr.getPrev();
                    tail.setNext(null);
                    return;
                }

                curr.getPrev().setNext(curr.getNext());
                curr.getNext().setPrev(curr.getPrev());
                return;
            }

            curr = curr.getNext();
        }

        System.out.println("No movie exists with the title " + title);
    }

    // Search movie by director
    public MovieNode searchMovieByDirector(String director) {
        if (head == null) {
            System.out.println("There are no movies to search.");
            return null;
        }

        MovieNode curr = head;

        while (curr != null) {
            if (curr.getDirector().equals(director)) {
                return curr;
            }

            curr = curr.getNext();
        }

        System.out.println("No movie exists with the director " + director);
        return null;
    }

    // Update movie rating by title
    public void updateMovieByTitle(String title, double rating) {
        if (head == null) {
            System.out.println("No movies exist!");
            return;
        }

        MovieNode curr = head;

        while (curr != null) {
            if (curr.getTitle().equals(title)) {
                curr.setRating(rating);
                return;
            }

            curr = curr.getNext();
        }

        System.out.println("No movie exists with the given title!");
    }

    // Display movies from head to tail
    public void displayMoviesByForward() {
        if (head == null) {
            System.out.println("No movies exist!");
            return;
        }

        System.out.println("Movie Records by forward:");
        System.out.println("-----------------------------------");

        MovieNode curr = head;

        while (curr != null) {
            System.out.println("Movie Title: " + curr.getTitle());
            System.out.println("Movie Director: " + curr.getDirector());
            System.out.println("Movie Year: " + curr.getYear());
            System.out.println("Movie Rating: " + curr.getRating());
            System.out.println("-----------------------------------");

            curr = curr.getNext();
        }
    }

    // Display movies from tail to head
    public void displayMoviesByBackward() {
        if (tail == null) {
            System.out.println("No movies exist!");
            return;
        }

        System.out.println("Movie Records by backward:");
        System.out.println("-----------------------------------");

        MovieNode curr = tail;

        while (curr != null) {
            System.out.println("Movie Title: " + curr.getTitle());
            System.out.println("Movie Director: " + curr.getDirector());
            System.out.println("Movie Year: " + curr.getYear());
            System.out.println("Movie Rating: " + curr.getRating());
            System.out.println("-----------------------------------");

            curr = curr.getPrev();
        }
    }
}

public class MovieManagement {
    public static void main(String[] args) {
        MovieNode movie1 = new MovieNode(
                "Leo", "Lokesh Kanagaraj", 2023, 9.2);

        MovieNode movie2 = new MovieNode(
                "Goat", "Venkat Prabhu", 2024, 8.5);

        MovieNode movie3 = new MovieNode(
                "Mersal", "Atlee", 2016, 9.0);

        MovieNode movie4 = new MovieNode(
                "Sarkar", "AR Murugadoss", 2019, 8.7);

        MovieNode movie5 = new MovieNode(
                "Jananayagan", "Vinoth", 2026, 8.5);

        DLL list = new DLL();

        list.addMovieAtBeginning(movie3);
        list.addMovieAtEnd(movie5);
        list.addMovieAtPosition(movie2, 2);
        list.addMovieAtBeginning(movie1);
        list.addMovieAtPosition(movie4, 6);

        list.displayMoviesByForward();

        list.deleteMovieByTitle("Goat");
        list.displayMoviesByBackward();

        list.updateMovieByTitle("Jananayagan", 8.6);
        list.displayMoviesByForward();

        MovieNode searchedMovie =
                list.searchMovieByDirector(movie3.getDirector());

        if (searchedMovie != null) {
            System.out.println(
                    "Movie directed by " + searchedMovie.getDirector()
                            + " is " + searchedMovie.getTitle());
        }
    }
}
