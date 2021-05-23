package com.mindtree.onedarrayprograms;

import com.mindtreefirstset.validations.AllValidationChecks;

public class FirstNonRepeatedValue {

	public static void main(String[] args) {

		System.out.println("Enter size of array:");
		int size = AllValidationChecks.integerCheck();
		int array[] = new int[size];
		System.out.println("Enter the values");
		for (int i = 0; i < size; i++) {
			array[i] = AllValidationChecks.integerCheck();
		}
		int count[] = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			count[i] = 0;
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (i != j && array[i] == array[j]) {
					count[i]++;
				}
			}
		}
		System.out.println("First non-repeating element in the array");
		for (int i = 0; i < array.length; i++) {
			if (count[i] == 0) {
				System.out.println(array[i]);
				break;
			}
		}
	}

}
