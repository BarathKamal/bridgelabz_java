package com.bridgelabz.java_classes_and_objects.level_1;

public class MobilePhone {
    private String brand;
    private String model;
    private int price;

    public MobilePhone(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Mobile phone brand: " + brand);
        System.out.println("Mobile phone model: " + model);
        System.out.println("Mobile phone price: INR " + price);
    }
}

class MobilePhoneMain {
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("One Plus", "Nord CE6", 35000);
        phone.displayDetails();
    }
}
