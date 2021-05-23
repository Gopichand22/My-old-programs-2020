package com.mindtree.groupb;

import com.mindtreefirstset.validations.AllValidationChecks;

public class SwapSmallestNumberInAMatrix {

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
		System.out.println("Enter target1 row:");
		int target1 = AllValidationChecks.integerCheck();
		System.out.println("Enter target2 row");
		int target2 = AllValidationChecks.integerCheck();
		int temp, min = 0;
		min = array[target1 - 1][0];
		int flag = 0, k = 0;
		for (int i = 0; i < array.length - 1; i++) {
			if (min > array[target1 - 1][i + 1]) {
				min = array[target1 - 1][i + 1];
				k = i;
				flag = 1;
			}
		}
		if (flag == 1) {
			temp = min;
			array[target1 - 1][k + 1] = array[target2 - 1][k + 1];
			array[target2 - 1][k + 1] = temp;
		} else {
			temp = 0;
			temp = array[target1 - 1][0];
			array[target1 - 1][0] = array[target2 - 1][0];
			array[target2 - 1][0] = temp;
		}

		for (int[] element : array) {
			for (int element2 : element) {
				System.out.print(element2 + "\t");
			}

			System.out.println();
		}

	}

}
