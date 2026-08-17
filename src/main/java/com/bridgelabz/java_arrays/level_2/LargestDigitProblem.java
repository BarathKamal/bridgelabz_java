package com.bridgelabz.java_arrays.level_2;

import java.util.Scanner;

public class LargestDigitProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int originalNum = scanner.nextInt();
        scanner.nextLine();

        int maxDigit = 10;
        int index = 0;
        int num = originalNum;
        int[] digitArray = new int[maxDigit];

        while (num != 0) {
            int digit = num % 10;
            digitArray[index] = digit;
            num /= 10;
            index += 1;

            if (index == maxDigit) {
                break;
            }
        }

        int largestDigit = 0;
        int secondLargestDigit = 0;

        for (int digit : digitArray) {
            if (digit > largestDigit) {
                secondLargestDigit = largestDigit;
                largestDigit = digit;
            }
            else if (digit > secondLargestDigit && digit != largestDigit) {
                secondLargestDigit = digit;
            }
        }

        System.out.println("The largest digit of the number " + originalNum + " is " + largestDigit);
        System.out.println("The second largest digit of the number " + originalNum + " is " + secondLargestDigit);

        scanner.close();
    }
}
