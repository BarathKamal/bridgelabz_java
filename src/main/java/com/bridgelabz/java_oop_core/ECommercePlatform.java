package com.bridgelabz.java_oop_core;

import java.util.List;
import java.util.ArrayList;

abstract class Product implements Taxable {
    private int productId;
    private String name;
    private int price;
    private int discountPercent;
    private int taxRate;

    public Product(int productId, String name, int price, int discountPercent,int taxRate) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.discountPercent=discountPercent;
        this.taxRate = taxRate;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    public double calculateTax() {
        return taxRate * price / 100.0;
    }

    public void getTaxDetails() {
        System.out.println("Tax applied for " + name + " product is Rs. " + calculateTax());
    }

    public int getTaxRate() {
        return taxRate;
    }

    abstract double calculateDiscount();
}

class Electronics extends Product {

    public Electronics(int productId, String name, int price, int discountPercent, int taxRate) {
        super(productId, name, price, discountPercent, taxRate);
    }
    public double calculateDiscount() {
        return this.getPrice()*getDiscountPercent() / 100.0;
    }
}

class Clothing extends Product {

    public Clothing(int productId, String name, int price, int discountPercent,int taxRate) {
        super(productId, name, price, discountPercent, taxRate);
    }
    public double calculateDiscount() {
        return this.getPrice()*getDiscountPercent() / 100.0;
    }
}

class Groceries extends Product {

    public Groceries(int productId, String name, int price, int discountPercent,int taxRate) {
        super(productId, name, price, discountPercent, taxRate);
    }
    public double calculateDiscount() {
        return this.getPrice()*getDiscountPercent() / 100.0;
    }
}

interface Taxable {
    double calculateTax();
    void getTaxDetails();
}

class ProductMain {
    public static double calculateFinalPrice(Product product) {
        double finalPrice = product.getPrice() - product.calculateDiscount() + product.calculateTax();
        return finalPrice;
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        Electronics product1 = new Electronics(1, "Realme Earbuds T310", 2010, 10, 15);
        Clothing product2 = new Clothing(2, "Jogger pants", 1500, 7, 16);
        Groceries product3 = new Groceries(3, "Home needs", 700, 5, 10);

        products.add(product1);
        products.add(product2);
        products.add(product3);

        for (Product product: products) {
            System.out.println("Product " + product.getName() + " is Rs. " + calculateFinalPrice(product) + " after discount and tax");
        }
    }
}
