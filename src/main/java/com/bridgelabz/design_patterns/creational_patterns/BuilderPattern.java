package com.bridgelabz.design_patterns.creational_patterns;

/*
Program to demonstrate the Builder pattern using a User class with
static nested class Builder (Bloch Builder approach)
 */

// Product class - User
class User {
    private int id;
    private String name;
    private int age;

    private User(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.age = builder.age;
    }

    // Static nested Builder class
    static class Builder {
        private int id;
        private String name;
        private int age;

        Builder setId(int id) {
            this.id = id;
            return this;
        }

        Builder setName(String name) {
            this.name = name;
            return this;
        }

        Builder setAge(int age) {
            this.age = age;
            return this;
        }

        User getUser() {
            return new User(this);
        }
    }

    public void displayUser() {
        System.out.println("User details: ");
        System.out.println("User Id: " + id);
        System.out.println("User Name: " + name);
        System.out.println("User Age: " + age);
    }
}

public class BuilderPattern {
    public static void main(String[] args) {

        // different configurations of the User class objects
        User user1 = new User.Builder().setId(1).setName("Albert").setAge(20).getUser();
        User user2 = new User.Builder().setId(2).setName("Einstein").setAge(52).getUser();

        user1.displayUser();
        user2.displayUser();
    }
}