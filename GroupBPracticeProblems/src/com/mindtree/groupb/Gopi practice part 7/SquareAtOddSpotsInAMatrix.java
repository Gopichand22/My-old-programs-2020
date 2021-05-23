package com.mindtree.groupb;

import com.mindtreefirstset.validations.AllValidationChecks;

public class SquareAtOddSpotsInAMatrix {

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
		System.out.println("Before squaring odd spots");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
		// logic part
		System.out.println("After squaring odd spots");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if ((i + j) % 2 != 0) {
					array[i][j] = array[i][j] * array[i][j];
				} else {
					array[i][j] = array[i][j];
				}
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
