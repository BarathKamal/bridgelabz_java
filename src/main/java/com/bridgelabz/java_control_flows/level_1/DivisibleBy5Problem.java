package com.bridgelabz.java_control_flows.level_1;

import java.util.Scanner;

public class DivisibleBy5Problem {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        int remainder = number % 5;

        if (remainder == 0) {
            System.out.println("The number " + number + " is divisible by 5");
        }
        else {
            System.out.println("The number " + number + " is not divisibly by 5");
        }

        scanner.close();
    }
}
