package com.bridgelabz.java_constructors.level_1;

/*
Program to
1. Create a HotelBooking class with guestName, roomType and nights attributes
2. Use default, parameterized and copy constructors
 */

public class HotelBooking {
    // variables declaration
    private String guestName;
    private String roomType;
    private int nights;

    // Default constructor
    public HotelBooking() {
        guestName = "Guest";
        roomType = "Single";
        nights = 1;
    }

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Copy constructor
    public HotelBooking(HotelBooking booking) {
        this.guestName = booking.guestName;
        this.roomType = booking.roomType;
        this.nights = booking.nights;
    }

    // Instance method to display details
    public void displayDetails() {
        System.out.println("Booking details: ");
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Number of Nights: " + nights);
    }
}

class HotelBookingMain {
    public static void main(String[] args) {
        // object creation for default values
        HotelBooking booking1 = new HotelBooking();

        // object creation with parameters
        HotelBooking booking2 = new HotelBooking("Arul", "Deluxe", 2);

        // object creation for copy constructor
        HotelBooking booking3 = new HotelBooking(booking2);

        // calling instance method
        booking1.displayDetails();
        System.out.println();
        booking2.displayDetails();
        System.out.println();
        booking3.displayDetails();
    }
}
