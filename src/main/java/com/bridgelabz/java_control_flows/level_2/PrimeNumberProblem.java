package com.bridgelabz.java_control_flows.level_2;

import java.util.Scanner;

public class PrimeNumberProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to check for prime: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        boolean isPrime = true;

        if (num > 1) {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        else {
            isPrime = false;
        }

        if (isPrime) {
            System.out.println("The number " + num + " is prime");
        }
        else {
            System.out.println("The number " + num + " is not prime");
        }
        scanner.close();
    }

}
