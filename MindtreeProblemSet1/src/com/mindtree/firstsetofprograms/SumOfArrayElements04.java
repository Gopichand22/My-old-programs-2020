package com.mindtree.firstsetofprograms;

import java.util.Scanner;

public class SumOfArrayElements04 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: \n");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int sum = 0;
		System.out.println("Enter elements of array: \n");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		// for each loop
		for (int elements : arr) {
			sum += elements;
		}
		System.out.println("Sum of Array elements : " + sum);
	}

}
