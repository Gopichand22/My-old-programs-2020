package com.mindtreefirstset.withnewupdates;

import com.mindtreefirstset.validations.AllValidationChecks;

public class SumOfTwoArrayApplication {

	public static void main(String[] args) {

		System.out.println("Enter size of array 1:");
		int[] array1 = AllValidationChecks.integerArrayCheck(AllValidationChecks.integerCheck());
		System.out.println("Enter size of array 2:");
		int[] array2 = AllValidationChecks.integerArrayCheck(AllValidationChecks.integerCheck());

		// intilize max size for array3 based on array1 & array2
		if (array1.length > array2.length) {
			int[] array3 = new int[array1.length];
			for (int i = 0; i < array2.length; i++) {
				array3[i] = array1[i] + array2[i];
			}
			for (int i = array2.length; i < array1.length; i++) {
				array3[i] = array1[i];
			}

			for (int i = 0; i < array3.length; i++) {
				System.out.println("After adding all the elements:");
				System.out.println(array3[i]);
			}
		} else {
			int[] array3 = new int[array2.length];
			for (int i = 0; i < array1.length; i++) {
				array3[i] = array1[i] + array2[i];
			}
			for (int i = array1.length; i < array2.length; i++) {
				array3[i] = array2[i];
			}

			System.out.println("After adding all the elements:");
			for (int i = 0; i < array3.length; i++) {
				System.out.println(array3[i]);
			}
		}

	}

}
