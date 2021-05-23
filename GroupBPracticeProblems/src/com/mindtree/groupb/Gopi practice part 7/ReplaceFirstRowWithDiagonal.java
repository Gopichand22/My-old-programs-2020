package com.mindtree.groupb;

import com.mindtreefirstset.validations.AllValidationChecks;

public class ReplaceFirstRowWithDiagonal {

	public static void main(String[] args) {
		System.out.println("Enter the row size");
		int rows = AllValidationChecks.integerCheck();
		System.out.println("Enter the col size");
		int cols = AllValidationChecks.integerCheck();
		int a[][] = new int[rows][cols];
		int n = 0, k = 0;
		// enter data here
		System.out.println("Enter the matrix");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				a[i][j] = AllValidationChecks.integerCheck();
			}
		}
		// print the matrix
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		int length = rows;
		while (length != 0) {
			int temp = a[length - 1][n];
			a[length - 1][n] = a[0][k];
			a[0][k] = temp;
			length--;
			n++;
			k++;

		}
		System.out.println("After swapping dialgonal elements into row");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}
