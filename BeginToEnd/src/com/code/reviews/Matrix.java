package com.code.reviews;

import java.util.Scanner;

import com.mindtreefirstset.validations.AllValidationChecks;

public class Matrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int size = AllValidationChecks.positiveIntegerCheck();
		int[][] matrix = new int[size][size];
		// assiging data
		System.out.println("Enter elements:");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = AllValidationChecks.positiveIntegerCheck();
			}
		}
		// printing data before logic
//		for (int i = 0; i < matrix.length; i++) {
//			for (int j = 0; j < matrix.length; j++) {
//				System.out.print(matrix[i][j]+" ");
//			}
//			System.out.println();
//		}
		// logic here
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if ((i + j) % 2 != 0) {
					matrix[i][j] *= matrix[i][j];
				}
			}
		}
//		for (int i = 0; i < matrix.length; i++) {
//			for (int j = matrix.length - 1; j > i; j--) {

		int temp = 0;
		int i = 0, j = size - 1;// 0<2
		while (i < j) {
			temp = matrix[i][i];// temp=1
			matrix[i][i] = matrix[j][j]; // 00 9
			matrix[j][j] = temp;// 22 1

			temp = matrix[i][j];
			matrix[i][j] = matrix[j][i];
			matrix[j][i] = temp;
			i++;
			j--;

		}

		for (int k = 0; k < matrix.length; k++) {
			for (int l = 0; l < matrix.length; l++) {
				System.out.print(matrix[k][l] + " ");
			}
			System.out.println();
		}

	}
}
