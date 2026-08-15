package com.bridgelabz.java_control_flows.level_2;

import java.util.Scanner;

public class MultiplesProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        int counter = 1;

        System.out.println("Multiples of " + num + ":");
        while (num * counter <= 100) {
            System.out.println(num*counter);
            counter += 1;
        }

        scanner.close();
    }
}
