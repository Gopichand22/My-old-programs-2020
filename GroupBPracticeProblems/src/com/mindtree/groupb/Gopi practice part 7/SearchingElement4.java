package com.mindtree.groupb;

import com.mindtreefirstset.validations.AllValidationChecks;

public class SearchingElement4 {

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
		System.out.println("Enter the numbers that you want to search:");
		int element = AllValidationChecks.integerCheck();
		System.out.print("The number " + element + " is present at index:");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (array[i][j] == element) {
					System.out.print(i + "" + j + ",");
				}
			}
		}
	}

}
