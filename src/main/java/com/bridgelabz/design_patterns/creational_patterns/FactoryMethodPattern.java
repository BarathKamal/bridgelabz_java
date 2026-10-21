package com.bridgelabz.design_patterns.creational_patterns;

/*
Program to demonstrate the Factory Method design pattern
 */

// Concrete creator
class ShapeFactory {
    // Factory method for Shape object creation
    public static Shape getShape(String type) {
        if (type.equals("circle")) {
            return new Circle();
        }

        else if (type.equals("rectangle")){
            return new Rectangle();
        }

        return null;
    }
}

// Product
interface Shape {
    void draw();
}

// Concrete Product 1 - Circle
class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing circle...");
    }
}

// Concrete Product 2 - Rectangle
class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing rectangle...");
    }
}

public class FactoryMethodPattern {
    public static void main(String[]args) {
        // calling factory method
        Shape circle = ShapeFactory.getShape("circle");
        Shape rectangle = ShapeFactory.getShape("rectangle");

        circle.draw();
        rectangle.draw();
    }
}
