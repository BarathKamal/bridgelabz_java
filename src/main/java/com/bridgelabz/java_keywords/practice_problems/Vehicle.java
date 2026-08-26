package com.bridgelabz.java_keywords.practice_problems;
/*
Program to create a Vehicle Registration System
 */
public class Vehicle {
    // static keyword for registration fee
    private static int registrationFee = 500;
    public String ownerName;
    public String vehicleType;
    public final int registrationNumber;// final keyword for registration number

    // this keyword to avoid ambiguity with method parameters
    public Vehicle(String ownerName, String vehicleType, int registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // static variable accessing
    public static void updateRegistrationFee(int registrationFee) {
        Vehicle.registrationFee = registrationFee;
    }

    public void displayDetails(){
        System.out.println("Vehicle Registration Details: ");
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Registration Fee: Rs. " + registrationFee);
    }
}

class VehicleMain {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Bheem", "Motorcycle", 101);

        // instanceof keyword to check whether the object is an instance of this specific class
        if (vehicle instanceof Vehicle) {
            vehicle.displayDetails();
        }

        vehicle.updateRegistrationFee(600);
        vehicle.displayDetails();
    }
}
