package com.bridgelabz.java_arrays.level_2;

import java.util.Scanner;

public class LargestDigitProblem2 {
    public static void main(String[] args) {
        /*
        Program to find the largest and the second largest digit in a given number
        (there is no maximum number of digits constraint)
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        long originalNum = scanner.nextLong();
        scanner.nextLine();

        int maxDigit = 10;
        long[] digitArray = new long[maxDigit];
        int index = 0;
        long num = originalNum;

        while (num != 0) {
            long digit = num % 10;
            digitArray[index] = digit;
            num /= 10;
            index += 1;

            if (index == maxDigit) {
                maxDigit += 10;
                long[] temp = new long[maxDigit];

                for (int i = 0; i < index; i++) {
                    temp[i] = digitArray[i];
                }

                digitArray = temp;
            }
        }

        long largestDigit = 0;
        long secondLargestDigit = 0;

        for (long digit : digitArray) {
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
