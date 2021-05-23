package com.mindtree.onedarrayprograms;

import com.mindtreefirstset.validations.AllValidationChecks;

public class FirstRepeatedValue {

	public static void main(String[] args) {
		System.out.println("Enter size of array:");
		int size = AllValidationChecks.integerCheck();
		int array[] = new int[size];
		System.out.println("Enter the values");
		for (int i = 0; i < size; i++) {
			array[i] = AllValidationChecks.integerCheck();
		}
		int result = -1;
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (array[i] == array[j]) {
					result = i;
				}
			}
			if (result != -1) {
				break;
			}
		}
		if (result != -1) {
		System.out.println(array[result] + " is the first element that repeats in the array");
		} else {
			System.out.println("No repeating elements in the array");
		}
	}

}
