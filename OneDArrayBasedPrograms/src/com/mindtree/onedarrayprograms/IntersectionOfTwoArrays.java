package com.mindtree.onedarrayprograms;

import com.mindtreefirstset.validations.AllValidationChecks;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		System.out.println("Entera size of an array1");
		int size1 = AllValidationChecks.integerCheck();
		int[] array1 = new int[size1];
		// data 1 initialization here
		System.out.println("Enter elements");
		for (int i = 0; i < size1; i++) {
			array1[i] = AllValidationChecks.integerCheck();
		}
		System.out.println("Entera size of an array2");
		int size2 = AllValidationChecks.integerCheck();
		int[] array2 = new int[size2];
		// data 2 initialization here
		System.out.println("Enter elements");
		for (int i = 0; i < size2; i++) {
			array2[i] = AllValidationChecks.integerCheck();
		}

		for (int i = 0; i < size1; i++) {
			for (int j = 0; j < size2; j++) {
				if (array1[i] != array2[j]) {
					System.out.print(array1[i] + " ");
				}
			}
		}
	}

}
