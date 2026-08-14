package com.bridgelabz.java_control_flows.level_1;

import java.util.Scanner;

public class RocketLaunchProblem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the timer: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        do {
            System.out.println(num);
            num -= 1;
        } while (num != 0);

        scanner.close();
    }
}
