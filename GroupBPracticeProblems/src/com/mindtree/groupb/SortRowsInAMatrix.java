package com.mindtree.groupb;

import com.mindtreefirstset.validations.AllValidationChecks;

public class SortRowsInAMatrix {

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
		for (int[] element : array) {
			for (int element2 : element) {
				System.out.print(element2 + "\t");
			}
			System.out.println();
		}

//logic part
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				for (int k = 0; k < array[i].length - j - 1; k++)
					if (array[i][k] > array[i][k + 1]) {
						int temp = array[i][k];
						array[i][k] = array[i][k + 1];
						array[i][k + 1] = temp;

				}
			}
		}
		for (int[] element : array) {
			for (int element2 : element) {
				System.out.print(element2 + "\t");
			}
			System.out.println();
		}

	}

}
