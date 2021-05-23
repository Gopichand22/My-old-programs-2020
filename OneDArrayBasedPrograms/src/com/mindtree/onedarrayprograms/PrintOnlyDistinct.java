package com.mindtree.onedarrayprograms;

import com.mindtreefirstset.validations.AllValidationChecks;

public class PrintOnlyDistinct {

	public static void main(String[] args) {
		System.out.println("Entera size of an array");
		int size = AllValidationChecks.integerCheck();
		int[] array = new int[size];
		// data initialization here
		System.out.println("Enter elements");
		System.out.println("INPUT:");
		for (int i = 0; i < size; i++) {
			array[i] = AllValidationChecks.integerCheck();
		}
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (array[i] == array[j]) {
					array[j] = 0;
				}
			}
		}
		System.out.println("OUTPUT");
		System.out.println("Distinct values in array are:");
		for (int num : array) {
			if (num != 0) {
				System.out.print(num + " ");
			}
		}
	}

}
