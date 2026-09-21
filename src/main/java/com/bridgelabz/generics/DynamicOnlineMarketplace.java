package com.bridgelabz.generics;

import java.util.ArrayList;
import java.util.List;

/*
Program to create a dynamic online marketplace using:
1. Generic Classes
2. Bounded Type Parameters
3. Generic Methods
*/

interface ProductCategory {
    void displayCategory();
}

class BookCategory implements ProductCategory {
    public void displayCategory() {
        System.out.println("Category: Books");
    }
}

class ClothingCategory implements ProductCategory {
    public void displayCategory() {
        System.out.println("Category: Clothing");
    }
}

class GadgetCategory implements ProductCategory {
    public void displayCategory() {
        System.out.println("Category: Gadgets");
    }
}


// T is bounded to ProductCategory.
// Therefore, Product can only use valid category types.
class Product<T extends ProductCategory> {

    private String productId;
    private String name;
    private double price;
    private T category;

    public Product(String productId, String name, double price, T category) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayProduct() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
        category.displayCategory();
        System.out.println("----------------------------");
    }
}


class MarketplaceUtility {

    // T extends Product allows the method to work with
    // different specific Product types while preserving type safety.
    public static <T extends Product<?>> void applyDiscount(
            T product, double percentage) {

        double discount = product.getPrice() * percentage / 100;
        product.setPrice(product.getPrice() - discount);
    }
}


public class DynamicOnlineMarketplace {

    public static void main(String[] args) {

        BookCategory bookCategory = new BookCategory();
        ClothingCategory clothingCategory = new ClothingCategory();
        GadgetCategory gadgetCategory = new GadgetCategory();

        // T = BookCategory
        Product<BookCategory> book =
                new Product<>("B101", "Java Book", 500, bookCategory);

        // T = ClothingCategory
        Product<ClothingCategory> shirt =
                new Product<>("C101", "T-Shirt", 800, clothingCategory);

        // T = GadgetCategory
        Product<GadgetCategory> laptop =
                new Product<>("G101", "Laptop", 60000, gadgetCategory);

        // Generic method works with different Product types.
        MarketplaceUtility.applyDiscount(book, 10);
        MarketplaceUtility.applyDiscount(shirt, 20);
        MarketplaceUtility.applyDiscount(laptop, 15);

        book.displayProduct();
        shirt.displayProduct();
        laptop.displayProduct();
    }
}
