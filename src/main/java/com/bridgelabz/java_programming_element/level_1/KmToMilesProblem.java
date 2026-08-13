package com.bridgelabz.java_programming_element.level_1;

import java.util.Scanner;

public class KmToMilesProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the distance in kms: ");
		int km = scanner.nextInt();
		scanner.nextLine();
		double mile = km / 1.6;
		System.out.println(km + " Kms is equivalent to " + String.format("%.2f", mile) + " miles");
		scanner.close();
	}

}
