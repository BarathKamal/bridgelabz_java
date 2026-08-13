package com.bridgelabz.java_programming_element.level_1;

public class PenProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int noOfPens = 14;
		int noOfStudents = 3;
		int penPerStudent = noOfPens / noOfStudents;
		int remainingPens = noOfPens % noOfStudents;
		System.out.println("The Pen Per Student is " + penPerStudent + " and the remaining pen not distributed is " + remainingPens);

	}
}
