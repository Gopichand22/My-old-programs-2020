package com.mindtreefirstset.withnewupdates;

import com.mindtreefirstset.validations.AllValidationChecks;

public class SumOfArrayElementApplication {
	public static void main(String[] args) {
		int sum = 0;
		System.out.println("Enter size of array");
		// initializing array values
		int[] array = AllValidationChecks.integerArrayCheck(AllValidationChecks.integerCheck());
		// Printing array values
		for (int element : array) {
			sum += element;
		}
		System.out.println("Sum of array elements: " + sum);
	}
}


