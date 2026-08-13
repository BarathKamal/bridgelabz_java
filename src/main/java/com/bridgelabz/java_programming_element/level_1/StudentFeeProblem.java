package com.bridgelabz.java_programming_element.level_1;

public class StudentFeeProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int studentFee = 12500;
		int discountPercent = 10;
		double discountAmount = studentFee * ((float) discountPercent / 100);
		double finalFee = studentFee - discountAmount;
		System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + finalFee);

	}

}
