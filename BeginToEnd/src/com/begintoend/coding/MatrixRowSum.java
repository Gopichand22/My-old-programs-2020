package com.begintoend.coding;

import java.util.Scanner;

//Square Matrix Manipulation
//*****Input******
//	1  2  3
//	1  2  3
//	1  2  3

//*****Output*****
//	6  5  3
//	6  5  3
//	6  5  3

public class MatrixRowSum {
// ***Sum all the rows***  
//	1. Analyze the code 1st
//	2. Check what is happening in the given problem statement
//	3. Note down the changes which are happening at the indexes
//	4. Now manipulate the indexes in a paper
//	5. Crack the logic implement the CODE

	// Main method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of matrix:");
		// Taking size of 2d array from the user
		int size = sc.nextInt();
		// This is a square matrix
		// Creating a 2D matrix with size x
		int[][] matrix = assignValues(size, sc);
		// method for Logic part
		int[][] result = addingAllTheRowsInAMatrix(matrix, size);
		// method for displaying the final output in the console
		displayFinalOutput(result, size);

	}

//Method to assign values
	private static int[][] assignValues(int size, Scanner sc) {
		// Creating a 2D matrix with size
		int[][] matrix = new int[size][size];
		// loop to enter all the values into that array
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		// return the matrix to main method
		return matrix;
	}

//Method for adding rows 
	private static int[][] addingAllTheRowsInAMatrix(int[][] matrix, int size) {
		// k,l variables using for index manipulation
		int k = 0, l;
		// loop executes upto the final row
		for (l = 0; l < matrix.length; l++) {
			// this is the main logic part
			// loop for adding value by value in all the rows
			for (int j = l; j < matrix.length - 1; j++) {
				matrix[k][l] += matrix[k][j + 1];
			}
			if (l == matrix.length - 1 && k != matrix.length - 1) {
				k++;
				l = -1;
			}
		}
		return matrix;
	}

//Method for displaying the final output matrix 
	private static void displayFinalOutput(int[][] matrix, int size) {
		// printing the final output on the console
		System.out.println("Output:");
		// loop to print all the values of the matrix
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			// it prints a new line for matrix type of look
		}
		System.out.println();

	}

}
