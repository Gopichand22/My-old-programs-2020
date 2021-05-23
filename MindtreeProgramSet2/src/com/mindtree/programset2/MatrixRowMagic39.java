package com.mindtree.programset2;

import com.mindtreefirstset.validations.AllValidationChecks;

public class MatrixRowMagic39 {

	public static void main(String args[]) {
		MatrixRowMagic39 rowMagic = new MatrixRowMagic39();
		int rows, columns;
		System.out.println("Enter the no of rows");
		rows = AllValidationChecks.integerCheck();
		System.out.println("Enter the no of columns");
		columns = AllValidationChecks.integerCheck();
		int matrix[][] = new int[rows][columns];
		System.out.println("Enter the matrix values");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				matrix[i][j] = AllValidationChecks.integerCheck();
			}
		}
		boolean tf = rowMagic.rowsmagic(matrix);
		if (tf) {
			System.out.println("The Entered matrix is not a row matrix");
		} else {
			System.out.println("The Entered matrix is not a row matrix");
		}

	}

	public boolean rowsmagic(int array[][]) {
		int count = 1;
		boolean flag = true;
		int mat[] = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			int sum = 0;
			for (int j = 0; j < array[i].length; j++) {
				sum = sum + array[i][j];
			}
			mat[i] = sum;
		}
		for (int i = 0; i < mat.length; i++) {
			for (int j = i + 1; j < mat.length; j++) {
				if (mat[i] != mat[j]) {
					count++;
				}
			}
		}
		if (count == 1) {
			flag = true;
		} else {
			flag = false;
		}
		return flag;
	}
}
