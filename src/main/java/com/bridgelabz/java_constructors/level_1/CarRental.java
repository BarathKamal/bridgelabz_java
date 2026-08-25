package com.bridgelabz.java_constructors.level_1;

/* Program to
1. Create a CarRental class with customerName, carModel and rentalDays attribute
2. Calculate the total cost based on the number of days
*/

public class CarRental {
    // variables declaration
    private String customerName;
    private String carModel;
    private int rentalDays;
    private int rentPerDay;

    // parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        rentPerDay = 1000;
    }

    // Instance method to calculate the total cost of rent
    public int calculateTotalRentCost() {
        return rentalDays * rentPerDay;
    }

    // Instance method to display the details
    public void displayDetails() {
        System.out.println("Car Rental Details: ");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Number of Rental Days: " + rentalDays);
        System.out.println("Rent cost per day: INR " + rentPerDay);;
    }
}

class Main {
    public static void main(String[] args) {
        // object creation
        CarRental carRental = new CarRental("Rishabh", "Sedan", 5);

        // Storing total rental cost value
        int totalRentCost = carRental.calculateTotalRentCost();

        // Calling the instance method to display the details
        carRental.displayDetails();

        // Printing the total rental cost
        System.out.println("Total Rental Cost: INR " + totalRentCost);
    }
}
