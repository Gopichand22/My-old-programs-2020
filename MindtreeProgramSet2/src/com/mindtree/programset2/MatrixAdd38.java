package com.mindtree.programset2;

import com.mindtreefirstset.validations.AllValidationChecks;

public class MatrixAdd38 {

	public static void main(String args[])
		{
			int row,column;
			System.out.println("enter the number of rows");
			row = AllValidationChecks.integerCheck();
			System.out.println("enter the number of cloumns");
			column = AllValidationChecks.integerCheck();
			int arr1[][]=new int [row][column];
			int arr2[][]=new int [row][column];
			System.out.println("enter the matrix1");
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<column;j++)
				{
					arr1[i][j] = AllValidationChecks.integerCheck();
				}
			}
			System.out.println("Enter the matrix 2");
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<column;j++)
				{
					arr2[i][j] = AllValidationChecks.integerCheck();
				}
			}
			int arr[][]=matrixadd(arr1,arr2,row,column);
			System.out.println("The addition of matrix");
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<column;j++)
				{
					System.out.print(arr[i][j]+" ");
				}
			}
		}

	private static int[][] matrixadd(int[][] arr1, int[][] arr2, int row, int column) {
		int arr3[][] = new int[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				arr3[i][j] = arr1[i][j] + arr2[i][j];
			}
		}

		return arr3;
	}
}
