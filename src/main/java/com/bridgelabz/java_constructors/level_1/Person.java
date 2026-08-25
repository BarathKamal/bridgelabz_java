package com.bridgelabz.java_constructors.level_1;

/*
Program to
1. Create a Person class with name, age, gender attributes;
2. Use a copy constructor
 */

public class Person {
    // variables declaration
    private String name;
    private int age;
    private String gender;

    // Parameterized constructor
    public Person (String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Copy constructor
    public Person (Person person) {
        this.name = person.name;
        this.age = person.age;
        this.gender = person.gender;
    }

    // Instance method to display the details
    public void displayDetails() {
        System.out.println("Person Details: ");
        System.out.println("Person Name: " + name);
        System.out.println("Person Age: " + age + " years");
        System.out.println("Person Gender: " + gender);
    }
}

class PersonMain {
    public static void main(String[] args) {
        // creation of objects
        Person person1 = new Person("Rahul", 27, "Male");
        Person person2 = new Person(person1);

        // calling instance method
        person1.displayDetails();
        person2.displayDetails();
    }
}
