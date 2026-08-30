package com.bridgelabz.java_inheritance.practice_problems;

/*
Program to
1. demonstrate hybrid inheritance by combining inheritance and interfaces
2. Use superclass Person1 and interface Worker, with subclasses Chef and Waiter
 */

// superclass Person1
public class Person1 {
    protected String name;
    protected int id;

    public Person1(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

// interface Worker
interface Worker {
    public void performDuties(); // abstract method
}

// subclass Chef
class Chef extends Person1 implements Worker {
    // constructor chaining
    public Chef(String name, int id) {
        super(name, id);
    }

    // abstract method overriding
    @Override
    public void performDuties() {
        System.out.println("Chef with id: " + id + " is performing his/her duties");
    }
}

// subclass Waiter
class Waiter extends Person1 implements Worker {
    // constructor chaining
    public Waiter(String name, int id) {
        super(name, id);
    }

    // abstract method overriding
    @Override
    public void performDuties() {
        System.out.println("Worker with id: "  + id + " is performing his/her duties");
    }
}

class Person1Main {
    public static void main(String[] args) {
        Chef chef = new Chef("Dharman", 1);
        Waiter waiter = new Waiter("Ganesan", 2);

        chef.performDuties(); // chef object calling overridden method
        waiter.performDuties(); // waiter object calling overridden method
    }
}



