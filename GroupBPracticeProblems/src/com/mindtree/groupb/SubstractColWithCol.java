package com.mindtree.groupb;

import com.mindtreefirstset.validations.AllValidationChecks;

public class SubstractColWithCol {

	public static void main(String[] args) {
		System.out.println("Enter size of array");
		int size = AllValidationChecks.integerCheck();

		int[][] array = new int[size][size];
		// data is entered here
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				array[i][j] = AllValidationChecks.integerCheck();
			}
		}
		// data is shown here
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("Enter first column:");
		int target1 = AllValidationChecks.integerCheck();
		System.out.println("Enter second column:");
		int target2 = AllValidationChecks.integerCheck();
		int k = 0;
		for (int i = 0; i < array.length; i++) {

			array[k][target2 - 1] = array[k][target1 - 1] - array[k][target2 - 1];

			if (array[k][target2 - 1] < 0) {
				array[k][target2 - 1] = 0;
			}
			k++;
		}
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
