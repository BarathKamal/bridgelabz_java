package com.bridgelabz.lambda_expressions.practice_problems;

import java.util.function.Supplier;
import java.util.Random;

public class GenerateOTP {
    public static void main(String[] args) {
        Random random = new Random();

        Supplier<Integer> generateOTP = () -> {
            int num = random.nextInt(1000000);
            String string = String.format("%06d", num);
            return Integer.parseInt(string);
        };

        System.out.println("OTP: " + generateOTP.get());
    }
}
