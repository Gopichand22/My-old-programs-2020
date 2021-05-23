package com.mindtree.groupb;

import com.mindtreefirstset.validations.AllValidationChecks;

public class PrimeValuesInASquareMatrix1 {

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

//		logic part
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				findPrime(array[i][j], size);
			}
		}

	}

	private static void findPrime(int num, int size) {
		int[] result = new int[size * size];
		int k = 0;
		int count = 0;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				count++;
				break;
			}

		}

		if (count == 0) {
			result[k] = num;
			System.out.print(result[k] + " ");
			k++;
		}
	}
}
