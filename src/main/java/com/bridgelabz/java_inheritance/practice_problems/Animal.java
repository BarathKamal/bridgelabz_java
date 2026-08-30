package com.bridgelabz.java_inheritance.practice_problems;

/*
Program to
1. create hierarchical inheritance of Animal, Dog, Cat and Bird classes
2. demonstrate the inheritance, method overriding and polymorphism
 */

// superclass Animal
public class Animal {
    private String name;
    private int age;

    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// subclass Dog
class Dog extends Animal {
    // overridden method
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

// subclass Cat
class Cat extends Animal {
    // overridden method
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

// subclass Bird
class Bird extends Animal {
    // overridden method
    @Override
    public void makeSound() {
        System.out.println("Bird chirps");
    }
}

class AnimalMain {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Animal bird = new Bird(); // polymorphism

        animal.makeSound(); // invokes method of Animal class
        dog.makeSound(); // invokes method of Dog class
        cat.makeSound(); // invokes method of Cat class
        bird.makeSound(); // invokes method of Bird class
    }
}