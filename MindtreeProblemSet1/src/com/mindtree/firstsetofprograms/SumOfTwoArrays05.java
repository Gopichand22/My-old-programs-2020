package com.mindtree.firstsetofprograms;

import java.util.Scanner;

public class SumOfTwoArrays05 {

	public static void main(String[] args) {
		double[] arr1 = new double[50];
		double[] arr2 = new double[50];
		int[] sumOfTwoArrays = new int[50];
		int i;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of arr1 & arr2:");
		int n = sc.nextInt();
		System.out.println("&");
		int m = sc.nextInt();
		System.out.println("Enter 1st array elements:");
		for (i = 0; i < n; i++) {
			arr1[i] = sc.nextDouble();
		}
		System.out.println("Enter 2nd array elements:");
		for (i = 0; i < m; i++) {
			arr2[i] = sc.nextDouble();
		}
		sc.close();
		// Sum process starts here
		System.out.println("Sum Of Two Arrays: ");
		if (n > m || n == m) {
			for (i = 0; i < n; i++) {
				sumOfTwoArrays[i] = (int) arr1[i] + (int) arr2[i];
				System.out.println(sumOfTwoArrays[i]);
			}
		} else {
			for (i = 0; i < m; i++) {
				sumOfTwoArrays[i] = (int) arr1[i] + (int) arr2[i];
				System.out.println(sumOfTwoArrays[i]);
			}
		}
	}
}
