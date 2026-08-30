package com.bridgelabz.java_inheritance.practice_problems;

/*
Program to
1. create vehicle superclass and subclasses Car, Truck and Motorcycle
2. demonstrate hierarchical inheritance, specific subclass features and polymorphism
 */

// vehicle superclass
public class Vehicle {
    protected int maxSpeed;
    protected String fuelType;

    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    public void displayInfo() {
        System.out.println("Vehicle Details: ");
        System.out.println("Maximum speed (in km/h): " + maxSpeed);
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Car subclass
class Car extends Vehicle {
    private static final String vehicleType = "Car";
    private int seatCapacity; // subclass specific attribute

    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType); // constructor chaining using super()
        this.seatCapacity = seatCapacity;
    }

    // method overriding
    @Override
    public void displayInfo() {
        System.out.println("Car Details: ");
        System.out.println("Maximum speed (in km/h): " + maxSpeed);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}

// Truck subclass
class Truck extends Vehicle {
    private static final String vehicleType = "Truck";
    private int towingCapacity;

    public Truck(int maxSpeed, String fuelType, int towingCapacity) {
        super(maxSpeed, fuelType);
        this.towingCapacity = towingCapacity;
    }

    // method overriding
    @Override
    public void displayInfo() {
        System.out.println("Truck Details: ");
        System.out.println("Maximum speed (in km/h): " + maxSpeed);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Towing Capacity (in kg): " + towingCapacity);
    }
}

// Motorcycle subclass
class Motorcycle extends Vehicle {
    private static final String vehicleType = "Motorcycle";
    private int engineDisplacement;

    public Motorcycle(int maxSpeed, String fuelType, int engineDisplacement) {
        super(maxSpeed, fuelType);
        this.engineDisplacement = engineDisplacement;
    }

    // method overriding
    @Override
    public void displayInfo() {
        System.out.println("Motorcycle Details: ");
        System.out.println("Maximum speed (in km/h): " + maxSpeed);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Engine Displacement (in cc): " + engineDisplacement);
    }
}

class VehicleMain {
    public static void displayVehicleInfo(Vehicle[] vehicleArray) {
        for (Vehicle vehicle : vehicleArray) {
            vehicle.displayInfo();
        }
    }

    public static void main(String[] args) {
        Car car = new Car(150, "CNG", 4);
        Truck truck = new Truck(100, "Diesel", 2000);
        Motorcycle motorcycle = new Motorcycle(200, "Petrol", 220);

        Vehicle[] vehicleArray = {car, truck, motorcycle}; // polymorphism
        displayVehicleInfo(vehicleArray);
    }
}
