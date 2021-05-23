package com.mindtree.programset2;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows");
		int rows = sc.nextInt();
		System.out.println("Enter no of cols");

		int cols = sc.nextInt();
		String[][] matrix = new String[rows][cols];
		System.out.println("Enter elements:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				matrix[i][j] = sc.next();
			}
		}

		System.out.println(matrix.length);
		System.out.println(matrix[0].length);
		System.out.println();
		System.out.println();
		// convertint to 1d
//		int k = 0;
//		String[] result = new String[rows * cols];
//		for (int i = 0; i < matrix[0].length; i++) {
//			for (int j = 0; j < matrix.length; j++) {
//				result[k++] = matrix[j][i];
//			}
//		}
		// displaying in matrix form
//		System.out.println("Matrix form");
//		for (int i = 0; i < rows; i++) {
//			for (int j = 0; j < cols; j++) {
//				System.out.print(matrix[i][j] + "    ");
//			}
		System.out.println();
//		}
//		System.out.println("1D Array:");
//		for (int i = 0; i < result.length; i++) {
//			System.out.print(result[i] + " ");
//		}

		String[] result2 = triangularMatrix(matrix);
		for (int i = 0; i < result2.length; i++) {

			System.out.print(result2[i] + " ");
		}

	}

	private static String[] triangularMatrix(String[][] matrix) {
		int size = matrix.length;
		int count = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (i < j) {
					count++;
				}

			}
		}
		int k = 0;
		String[] res = new String[(size * size) - count];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j <= i; j++) {
				res[k] = matrix[i][j];
				k++;
			}
		}
		return res;
	}

}
