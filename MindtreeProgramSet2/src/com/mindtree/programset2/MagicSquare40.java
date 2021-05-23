package com.mindtree.programset2;

import com.mindtreefirstset.validations.AllValidationChecks;

public class MagicSquare40 {
		public static void main(String args[]) {
			int rows, columns;
			System.out.println("Enter the rows");
			rows = AllValidationChecks.integerCheck();
			System.out.println("Enter the columns");
			columns = AllValidationChecks.integerCheck();
			int matrix[][] = new int[rows][columns];
			System.out.println("Enter the matrix");
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					matrix[i][j] = AllValidationChecks.integerCheck();
				}
			}
			if (rows != columns) {
				System.out.println("Entered matrix is not a square matrix");
			} else {
				MagicSquare40 sqMatrix = new MagicSquare40();
				boolean value = sqMatrix.checkMatrix(matrix);
				if (value == false) {
					System.out.println("Enter matrix is not a square matrix");
				} else {
					System.out.println("Enter matrix is  a square matrix");
				}
			}
		}

		public boolean checkMatrix(int matrix[][]) {
			boolean flag = true;
			int count = 1, sum1 = 0, sum2 = 0;
			int tempvalue1 = 0, tempvalue2 = 0;
			int rows = matrix.length;
			int columns = matrix[0].length;
			int diagonal = 2;
			int temp[] = new int[rows + columns + diagonal];//
			for (int i = 0; i < rows; i++) {
				int sum = 0;
				for (int j = 0; j < columns; j++) {
					sum = sum + matrix[i][j];
				}
				temp[tempvalue1] = sum;
				tempvalue1++;
			}
			for (int j = 0; j < columns; j++) {
				int sum = 0;
				for (int i = 0; i < rows; i++) {
					sum = sum + matrix[i][j];
				}
				temp[tempvalue1] = sum;
				tempvalue1++;
			}
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					if (i == j) {
						sum1 = sum1 + matrix[i][j];
					}
				}
			}
			temp[tempvalue1] = sum1;
			tempvalue1++;
			while (tempvalue2 < matrix.length)
				for (int j = columns - 1; j >= 0; j--) {
					sum2 = sum2 + matrix[tempvalue2][j];
					tempvalue2++;
				}
			temp[tempvalue1] = sum2;
			tempvalue1++;
			for (int i = 0; i < temp.length; i++) {
				for (int j = i + 1; j < temp.length; j++) {
					if (temp[i] != temp[j]) {
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