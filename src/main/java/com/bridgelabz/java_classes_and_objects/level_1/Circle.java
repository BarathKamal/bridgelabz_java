package com.bridgelabz.java_classes_and_objects.level_1;

import java.util.Scanner;
public class Circle {

    private static final double PI = 3.14159;
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double calculateArea(int radius) {
        double area = PI * Math.pow(radius, 2);
        return area;
    }

    public double circumference(int radius) {
        double circumference = 2 * PI * radius;
        return circumference;
    }

    public void displayDetails(double area, double circumference) {
        System.out.println("Area of the circle: " + String.format("%.2f", area));
        System.out.println("Circumference of the circle: " + String.format("%.2f", circumference));
    }
}

class CircleMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the raidus of the circle:");
        int radius = scanner.nextInt();

        Circle circle = new Circle(radius);
        double area = circle.calculateArea(radius);
        double circumference = circle.circumference(radius);
        circle.displayDetails(area, circumference);

        scanner.close();
    }
}
