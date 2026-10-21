package com.bridgelabz.design_patterns.structural_patterns;

/*
Program to demonstrate the Decorator pattern with the example of
Coffee, Milk decorator and Sugar Decorator
 */

// Component Interface - Coffee
interface Coffee {
    public double getCost();
}

// Concrete Component - SimpleCoffee
class SimpleCoffee implements Coffee {
    @Override
    public double getCost() {
        return 10.0;
    }
}

// Decorator abstract class - CoffeeDecorator
abstract class CoffeeDecorator implements Coffee {
    Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }

    // delegating to the decorated object
    @Override
    public double getCost() {
        return decoratedCoffee.getCost();
    }
}

// Decorator 1 - MilkDecorator
class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    // adding additional behaviour to the decorated object
    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 5.0;
    }
}

// Decorator 2 - SugarDecorator
class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    // adding additional behaviour to the decorated object
    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 2.0;
    }
}

public class DecoratorPattern {
    public static void main(String[] args) {
        // Concrete component object
        Coffee coffee1 = new SimpleCoffee();
        System.out.println("Cost of simple coffee: Rs. " + coffee1.getCost());

        // MilkDecorator object
        Coffee coffee2 = new SimpleCoffee();
        MilkDecorator milkDecorator = new MilkDecorator(coffee2);
        System.out.println("Cost of coffee with milk: Rs. " + milkDecorator.getCost());

        // SugarDecorator object
        Coffee coffee3 = new SimpleCoffee();
        SugarDecorator sugarDecorator = new SugarDecorator(coffee2);
        System.out.println("Cost of coffee with sugar: Rs. " + sugarDecorator.getCost());

        // Milk and Sugar decorated object
        SugarDecorator sugarDecorator2 = new SugarDecorator(new MilkDecorator(new SimpleCoffee()));
        System.out.println("Cost of coffee with sugar and milk: Rs. " + sugarDecorator2.getCost());
    }
}
