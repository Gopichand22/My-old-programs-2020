package com.mindtree.groupb;

import com.mindtreefirstset.validations.AllValidationChecks;

public class OneDTwoDArrays {

	public static void main(String[] args) {
		boolean flag = true;
		do {
			switch (menuToChooseOption()) {
			case 1:
				twoDimToOneDim();
				break;
			case 2:
				addingAdjValues();
				break;
			case 3:
				oneDArrayMinusEvenSpotsWith1();
				break;
			case 4:
				System.out.println("Exiting...\nBye Have a nice day");
				flag = false;
				break;
			default:
				System.out.println("enter the correct choice btw 1-3:");
			}

		} while (flag);
	}

//case 3
	private static void oneDArrayMinusEvenSpotsWith1() {
		System.out.println("Enter size:");
		int size = AllValidationChecks.integerCheck();
		int[] array = new int[size];
		int[] result = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = AllValidationChecks.integerCheck();
		}

		for (int i = 0; i < array.length; i++) {
			if (i % 2 != 0) {
				result[i] = array[i] - 1;
			} else {
				result[i] = array[i];
			}
		}
		System.out.println("Final answer");
		for (int element : result) {
			System.out.println(element);
		}
	}

	// Methods are represented here

	// case 1
	private static void twoDimToOneDim() {
		System.out.println("enter the size of the n X n:");
		int size = AllValidationChecks.integerCheck();
		int[][] marks = new int[size][size];
		// enter elements
		System.out.println("Enter the elements");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				marks[i][j] = AllValidationChecks.integerCheck();
			}
		}
		// print
		// elements stored in 2D array
		System.out.println("Elements stored in 2D array");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(marks[i][j] + "\t");
			}

			System.out.println();
		}
//		shift elements from 2d to 1d array
		int[] b = new int[size * size];
		int c = 0;
		// 1d array
		System.out.println("Elements stored in 1D array");
		System.out.print("[");
		for (int[] mark : marks) {
			for (int element : mark) {
				b[c] = element;
				System.out.print(b[c] + "\t");
				c++;
			}
		}
		System.out.print("] \n");
	}

	// case 2
	private static void addingAdjValues() {
		System.out.println("enter the size of the n X n:");
		int size = AllValidationChecks.integerCheck();
		int[][] marks = new int[size][size];
		// scanner takes values
		System.out.println("Enter the elements");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				marks[i][j] = AllValidationChecks.integerCheck();
			}
		}
		// print
		// elements stored in 2D array
		System.out.println("display elements in matrix");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(marks[i][j] + "\t");
			}

			System.out.println();
		}

		// Logic here
		int resultArray[][] = new int[size][size];
		for (int i = 0; i < size; i++) {
			int k = 0;
			for (int j = 0; j < size; j++) {
				if (j == 0) {
					resultArray[i][j] = marks[i][j];
				} else {
					resultArray[i][j] = marks[i][k] + marks[i][j];
					marks[i][j] = resultArray[i][j];
					k++;
				}
			}
		}
			System.out.println("display elements in matrix after adding rows");
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					System.out.print(resultArray[i][j] + "\t");
				}

				System.out.println();
			}

	}

	// Menu items
	private static int menuToChooseOption() {

		System.out.println("......................MENU........................");
		System.out.println("Enter the choice");
		System.out.println("1. Converting 2D to 1D array");
		System.out.println("2. Add row wise values in matrix");
		System.out.println("3. oneDArrayMinusEvenSpotsWith1");
		System.out.println("4. Exit");
		System.out.println("..............................................");
		int opt = AllValidationChecks.integerCheck();
		return opt;

	}
}
