package com.mindtree.onedarrayprograms;

import com.mindtreefirstset.validations.AllValidationChecks;

public class DuplicateElementInArray {
	public static void main(String[] args) {
		System.out.println("Entera size of an array");
		int size = AllValidationChecks.integerCheck();
		int[] array = new int[size];
		// data initialization here
		System.out.println("INPUT:");
		for (int i = 0; i < size; i++) {
			array[i] = AllValidationChecks.integerCheck();
		}
		int[] result = new int[size];
		int k = 0;
		for (int i = 0; i < size - 1; i++) {
			for (int j = i + 1; j < size; j++) {
				if (array[i] == array[j]) {
					result[k] = array[i];
					k++;
					array[j] = 0;
				}
			}
		}
		System.out.println("OUTPUT:");
		for (int element : result) {
			if (element != 0) {
				System.out.print(element + " ");
			}
		}

	}

}
