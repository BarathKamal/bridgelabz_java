package com.bridgelabz.java_programming_element.level_1;

import java.util.Scanner;
public class TotalPriceFromQuantityProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the unit price: ");
        int unitPrice = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the quantity: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();

        int totalPrice = quantity * unitPrice;

        System.out.println("The total purchase price is INR " + totalPrice +
                " if the quantity is " + quantity +
                " and unit price is INR " + unitPrice);

        scanner.close();
    }
}
