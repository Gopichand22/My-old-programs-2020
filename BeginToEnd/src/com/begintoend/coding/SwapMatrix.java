package com.begintoend.coding;

import java.util.Scanner;

import com.mindtreefirstset.validations.AllValidationChecks;

public class SwapMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of matrix");
		int size = AllValidationChecks.positiveIntegerCheck();
		int[][] matrix = new int[size][size];
		System.out.println("Enter " + size * size + " Elements");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				// matrix[i][j] = reverseNum(AllValidationChecks.integerCheck()); reversed it
				// while assigning
				matrix[i][j] = AllValidationChecks.integerCheck();
			}
		}
		// rev numbers in the matrix code
		int[][] matrix2 = new int[size][size];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix2[i][j] = reverseNum(matrix[i][j]);
			}
		}
		int end = matrix2.length;
		for (int i = 0; i < matrix2.length; ++i) {
			if (i != matrix2.length / 2) {
				int temp = matrix2[i][i];
				matrix2[i][i] = matrix2[i][end - i - 1];
				matrix2[i][end - i - 1] = temp;
			}
		}
		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2.length; j++) {
				System.out.print(matrix2[i][j] + " ");
			}
			System.out.println();
		}

	}

	private static int reverseNum(int num) {
		int rem, rev = 0;
		int count = 0;
		while (num != 0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
			count++;
		}
		// words only for 2digits
		if (count == 1) {
			return rev * 10 + 1;
		}
		return rev + 1;
	}

}
