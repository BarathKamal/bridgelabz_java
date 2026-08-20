package com.bridgelabz.java_methods.level_3;

public class OtpProblem {

    /*
    Program to generate 10 unique 6 digit OTPs (One Time Passwords)
     */
    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000;
    }

    public static boolean isUnique(int[] otps, int currentIndex, int otp) {

        for (int i = 0; i < currentIndex; i++) {
            if (otps[i] == otp) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[] otps = new int[10];

        for (int i = 0; i < otps.length; i++) {
            int otp;

            do {
                otp = generateOTP();
            } while (!isUnique(otps, i, otp));

            otps[i] = otp;
        }

        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.println(otp);
        }
    }
}
