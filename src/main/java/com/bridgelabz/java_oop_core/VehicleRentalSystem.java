package com.bridgelabz.java_oop_core;

import java.util.List;
import java.util.ArrayList;

interface Insurable {

    double calculateInsurance(Vehicle vehicle);
    void getInsuranceDetails(Vehicle vehicle);
}

class Details implements Insurable {

    public double calculateInsurance(Vehicle vehicle) {
        return vehicle.getInsuranceRate() * vehicle.getDays();
    }

    public double calculateTotalCost(Vehicle vehicle) {
        return vehicle.calculateRentalCost() + calculateInsurance(vehicle);
    }

    public void getInsuranceDetails(Vehicle vehicle) {
        System.out.println("Insurance Details: ");
        System.out.println("InsurancePolicyNumber: " + vehicle.getInsurancePolicyNumber());
        System.out.println("Total Insurance Cost: " + calculateInsurance(vehicle));
    }

    public void displayVehicleDetails(Vehicle vehicle) {
        System.out.println("Vehicle Details: ");
        System.out.println("Vehicle Number: " + vehicle.getVehicleNumber());
        System.out.println("Vehicle Type: " + vehicle.getType());
        System.out.println("Rental Rate per day: Rs. " + vehicle.getRentalRate());
        System.out.println("No of days: " + vehicle.getDays());
        System.out.println("Insurance Policy Number: " + vehicle.getInsurancePolicyNumber());
        System.out.println("Insurance Rate per day: Rs. " + vehicle.getInsuranceRate());
        System.out.println("Rental Cost: Rs. " + vehicle.calculateRentalCost());
        System.out.println("Insurance Cost: Rs. " + calculateInsurance(vehicle));
        System.out.println("Total Cost: Rs. " + calculateTotalCost(vehicle));
    }
}

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;
    private int insurancePolicyNumber;
    private double insuranceRate;
    private int days;

    public Vehicle(String vehicleNumber, String type, double rentalRate, int insurancePolicyNumber, double insuranceRate, int days) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
        this.insurancePolicyNumber = insurancePolicyNumber;
        this.insuranceRate = insuranceRate;
        this.days = days;
    }

    abstract double calculateRentalCost();

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public double getInsuranceRate() {
        return insuranceRate;
    }

    public int getInsurancePolicyNumber() {
        return insurancePolicyNumber;
    }

    public int getDays() {
        return days;
    }
}

class Car extends Vehicle{

    public Car(String vehicleNumber, double rentalRate, int insurancePolicyNumber, double insuranceRate, int days) {
        super(vehicleNumber, "Car", rentalRate, insurancePolicyNumber, insuranceRate, days);
    }

    @Override
    public double calculateRentalCost() {
        return getRentalRate() * getDays();
    }
}

class Bike extends Vehicle{

    public Bike(String vehicleNumber, double rentalRate, int insurancePolicyNumber, double insuranceRate, int days) {
        super(vehicleNumber, "Bike", rentalRate, insurancePolicyNumber, insuranceRate, days);
    }

    @Override
    public double calculateRentalCost() {
        double longTermDiscount = (getDays() > 5) ? 10 : 0;
        double baseCost = getRentalRate() * getDays();
        double discountCost = baseCost * (longTermDiscount / 100);
        return baseCost - discountCost;
    }
}

class Truck extends Vehicle{
    private double maintenanceCost = 100;
    public Truck(String vehicleNumber, double rentalRate, int insurancePolicyNumber, double insuranceRate, int days) {
        super(vehicleNumber, "Truck", rentalRate, insurancePolicyNumber, insuranceRate, days);
    }

    @Override
    public double calculateRentalCost() {
        double baseCost = getRentalRate() * getDays();
        double totalMaintenanceCost = maintenanceCost * getDays();
        return baseCost + totalMaintenanceCost;
    }
}

public class VehicleRentalSystem {
    public static void displayDetails(List<Vehicle> vehicles) {
        Details details = new Details();
        for (Vehicle vehicle: vehicles) {
            details.displayVehicleDetails(vehicle);
        }
    }

    public static void main(String[] args) {
        Vehicle car = new Car("TN05BK2027", 1000, 1234, 200, 5);
        Vehicle bike = new Bike("TN05JK2029", 500, 2345, 100, 7);
        Vehicle truck = new Truck("TN05RK2026", 1200, 3456, 250, 8);

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(truck);

        displayDetails(vehicles);
    }
}
