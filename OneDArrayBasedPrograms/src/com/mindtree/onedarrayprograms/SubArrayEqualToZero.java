package com.mindtree.onedarrayprograms;

import com.mindtreefirstset.validations.AllValidationChecks;

public class SubArrayEqualToZero {

	public static void main(String[] args) {
		System.out.println("Enter size of array:");
		int size = AllValidationChecks.integerCheck();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = AllValidationChecks.integerCheck();
		}
		boolean flag = true;
		for (int i = 0; i < size; i++) {
			int sum = 0;
			for (int j = i; j < size; j++) {
				sum = sum + array[j];
				if (array[j] == 0) {
					flag = false;
					System.out.println("There is a sub array with sum equal to zero from index " + i + " to " + i);
				}
				if (sum == 0) {
					flag = false;
					System.out.println("There is a sub array with sum equal to zero from index " + i + " to " + j);
				}
			}
		}
		if (flag) {
			System.out.println("There is NO sub array with sum equal to zero");
		}
	}

}
