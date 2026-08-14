package com.bridgelabz.java_control_flows.level_1;

import java.util.Scanner;

public class OddEvenProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is even" );
            }
            else {
                System.out.println(i + " is odd");
            }
        }
        scanner.close();
    }
}
