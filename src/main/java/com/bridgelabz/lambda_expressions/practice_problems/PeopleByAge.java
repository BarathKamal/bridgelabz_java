package com.bridgelabz.lambda_expressions.practice_problems;
// TODO to be Continued and finished
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class PeopleByAge {
    public static void main(String[] args) {
        Person person1 = new Person("Babu", 32);
        Person person2 = new Person("Bheem", 48);
        Person person3 = new Person("Kushal", 18);


    }
}
