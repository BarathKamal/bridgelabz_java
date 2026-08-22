package com.bridgelabz.java_classes_and_objects.level_2;

public class MovieTicket {
    private String movieName;
    private String seatNumber;
    private int price = 100;

    public MovieTicket(String movieName) {
        this.movieName = movieName;
    }

    public void bookATicket(String seatNumber, int amount) {
        this.seatNumber = seatNumber;
        this.price = price;

    }

    public void displayDetails() {
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }
}

class MovieTicketMain {
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Jananayagan");
        ticket.bookATicket("F10", 250);
        ticket.displayDetails();
    }
}
