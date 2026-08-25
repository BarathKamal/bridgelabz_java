package com.bridgelabz.java_constructors.level_2;

/*
Program to
1. Create a product class with attributes productName and price
2. Display the product details and total number of products created
 */
public class Product {
    // variables declaration
    private String productName;
    private int price;
    private static int totalProducts = 0; // static variable

    // Parameterized Constructor
    public Product(String productName, int price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    // Instance Method to display product details
    public void displayProductDetails() {
        System.out.println("\nProduct Details: ");
        System.out.println("Product Name: " + productName);
        System.out.println("Price: Rs. " + price);
    }

    // Static method to display the total number of products
    public static void displayTotalProducts() {
        System.out.println("\nTotal number of products: " + totalProducts);
    }
}

class ProductMain {
    public static void main(String[] args) {
        // Objects creation
        Product product1 = new Product("Earbuds", 2000);
        Product product2 = new Product("Speaker", 1500);
        Product product3 = new Product("MacSafe", 9000);

        // Calling the instance method to display the product details
        product1.displayProductDetails();
        product2.displayProductDetails();
        product3.displayProductDetails();

        // Calling the static method to display the total number of products
        Product.displayTotalProducts();
    }
}
