package com.bridgelabz.java_programming_element.level_1;

public class VolumeOfEarthProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PI = 3.14;
		int radius = 6378;

		double volumeInKms = ((float)4/3)*PI*(Math.pow(radius, 3));
		double volumeInMiles = volumeInKms/1.6;

		System.out.println("The volume of earth in cubic kilometers is " + String.format("%.2f", volumeInKms) +
				" and in cubic miles is " + String.format("%.2f", volumeInMiles));
	}

}
