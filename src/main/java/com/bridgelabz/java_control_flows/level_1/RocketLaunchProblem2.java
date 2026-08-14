package com.bridgelabz.java_control_flows.level_1;

import java.util.Scanner;

public class RocketLaunchProblem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the timer: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        if (num > 0) {
            for (int i = num; i > 0; i--) {
                System.out.println(i);
            }
        }
        else {
            System.out.println("Enter a valid timer");
        }

        scanner.close();
    }
}