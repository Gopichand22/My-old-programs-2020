package com.mindtree.onedarrayprograms;

import com.mindtreefirstset.validations.AllValidationChecks;

public class KthLargestNumberInArray {

	public static void main(String[] args) {
		System.out.println("Enter size of array:");
		int size = AllValidationChecks.integerCheck();
		int array[] = new int[size];
		System.out.println("Enter te values");
		for (int i = 0; i < size; i++) {
			array[i] = AllValidationChecks.integerCheck();
		}
		System.out.println("Enter the position to get the max value");
		int k = AllValidationChecks.integerCheck();
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (array[i] < array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}

		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("largest value at position " + k + " is: " + array[k - 1]);
	}

}
