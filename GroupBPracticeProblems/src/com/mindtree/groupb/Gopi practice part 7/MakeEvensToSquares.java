package com.mindtree.groupb;

import com.mindtreefirstset.validations.AllValidationChecks;

public class MakeEvensToSquares {

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
		// before squaring evens
		System.out.println("Before Squaring");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
		// logic
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (array[i][j] % 2 == 0) {
					array[i][j] = array[i][j] * array[i][j];
				}
			}
		}
		// after squaring evens
		System.out.println("After Squaring");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
