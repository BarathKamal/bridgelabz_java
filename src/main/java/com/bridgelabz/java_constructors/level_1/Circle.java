package com.bridgelabz.java_constructors.level_1;

import java.util.Scanner;

/*
Program to
1. Create of Circle class with radius attribute
2. Use Default and parameterized constructor with user values
 */

public class Circle {
    // variables declaration
    private double radius; // instance variable

    // Default constructor
    public Circle() {
        radius = 5.0;
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Instance method to display the details
    public void displayDetails() {
        System.out.println("Circle Details: ");
        System.out.println("Radius: " + radius + " cm");
    }
}

class CircleMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // object creation using default values
        Circle circle1 = new Circle();

        // object creation using user values
        System.out.print("Enter the radius of the circle (in cms): ");
        double radius = scanner.nextDouble();
        Circle circle2 = new Circle(radius);

        // calling instance method
        circle1.displayDetails();
        circle2.displayDetails();

        scanner.close();
    }
}
