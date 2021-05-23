package com.begintoend.coding;

import com.mindtreefirstset.validations.AllValidationChecks;

public class ConvertArray {

	public static void main(String[] args) {
		System.out.println("Enter rows:");
		int m = AllValidationChecks.integerCheck();
		System.out.println("Enter cols:");
		int n = AllValidationChecks.integerCheck();
		int a = m * n;
		// enter 2D array data here
		int[][] twoDArray = twoDArray(m, n);
		// display 2d array
		displayTwoDArray(twoDArray);
		// store 2d array elements in 1d array
		int[] toOneDArray = oneDArray(a, twoDArray);
		// display 1d array
		displayOneDArray(toOneDArray);
	}

	private static void displayOneDArray(int[] toOneDArray) {
		for (int i = 0; i < toOneDArray.length; i++) {
			System.out.print(toOneDArray[i] + " ");
		}
	}

	private static int[] oneDArray(int a, int[][] array) {
		int[] array2 = new int[a];
		int k = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array2[k] = array[i][j];
				k++;
			}
		}
		return array2;
	}

	private static int[][] twoDArray(int m, int n) {
		int[][] twoDArray = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				twoDArray[i][j] = AllValidationChecks.integerCheck();
			}
		}
		return twoDArray;
	}

	private static void displayTwoDArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
