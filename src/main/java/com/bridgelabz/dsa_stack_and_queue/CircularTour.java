package com.bridgelabz.dsa_stack_and_queue;

/*
Program to find the starting point of a circular tour of petrol pumps
 */

public class CircularTour {

    public static int findStartingPoint(int[] petrol, int[] distance) {
        if (petrol == null || distance == null ||
                petrol.length == 0 ||
                petrol.length != distance.length) {
            throw new IllegalArgumentException("Invalid input");
        }

        int start = 0;
        int currentSurplus = 0;
        int totalSurplus = 0;

        for (int i = 0; i < petrol.length; i++) {

            // Calculate petrol gained/lost at this pump.
            int surplus = petrol[i] - distance[i];

            currentSurplus += surplus;
            totalSurplus += surplus;

            // Current start cannot complete the tour.
            if (currentSurplus < 0) {
                start = i + 1;
                currentSurplus = 0;
            }
        }

        // Total petrol must be enough to complete the entire tour.
        return totalSurplus >= 0 ? start : -1;
    }
}

class CircularTourMain {

    public static void main(String[] args) {
        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};

        int start = CircularTour.findStartingPoint(petrol, distance);

        if (start == -1) {
            System.out.println("No possible starting point");
        } else {
            System.out.println("Starting point: " + start);
        }
    }
}
