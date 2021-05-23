package com.mindtree.groupb;

import com.mindtreefirstset.validations.AllValidationChecks;

public class ExchangeRowsAndCols {

	public static void main(String[] args) {
		int rows, cols, target1, target2, temp = 0;
		System.out.print("Enter number of rows in matrix:");
		rows = AllValidationChecks.integerCheck();
		System.out.print("Enter number of columns in matrix:");
		cols = AllValidationChecks.integerCheck();
		int array[][] = new int[rows][cols];
		System.out.println("Enter all the elements of matrix:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				array[i][j] = AllValidationChecks.integerCheck();
			}
		}
		System.out.println("Given Matrix:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		boolean isValid = true;
		do {

			switch (chooseAnOption()) {
			case 1:// swapping rows
				System.out.println("Enter the row numbers:");
				target1 = AllValidationChecks.integerCheck();// 2
				target2 = AllValidationChecks.integerCheck();// 3
				for (int i = 0; i < rows; i++)// 4
				{
					temp = array[(target1 - 1)][i];// t=10
					array[target1 - 1][i] = array[target2 - 1][i];// 10=20
					array[target2 - 1][i] = temp;// 20=t
				}
				System.out.println("Matrix after swapping rows:" + target1 + " and " + target2);
				for (int i = 0; i < rows; i++) {
					for (int j = 0; j < cols; j++) {
						System.out.print(array[i][j] + " ");
					}
					System.out.println("");
				}
				break;
			case 2:// swapping colomns
				System.out.println("Enter the column numbers:");
				target1 = AllValidationChecks.integerCheck();// 1 1-1 0th col
				target2 = AllValidationChecks.integerCheck();// 3 3-1 2nd col
				for (int i = 0; i < rows; i++) {
					temp = array[i][(target1 - 1)];// temp=00 10 20
					array[i][target1 - 1] = array[i][(target2 - 1)];// 00=02 10=12 20=22
					array[i][target2 - 1] = temp;
				}
				System.out.println("Matrix after swapping columns:" + target1 + " and " + target2);
				for (int i = 0; i < rows; i++) {
					for (int j = 0; j < cols; j++) {
						System.out.print(array[i][j] + " ");
					}
					System.out.println("");
				}
				break;
			case 3:
				System.out.println("Exiting\nBye have a nice day");
				isValid = false;
				break;
			default:
				System.out.println("Please enter correct option i.e: between 1-3:");
			}
		} while (isValid);
	}

	private static int chooseAnOption() {
		System.out.println("Press 1. To swap rows");
		System.out.println("Press 2. To swap columns");
		System.out.println("Press 3. To Exit");
		int option = AllValidationChecks.integerCheck();
		return option;
	}
}
