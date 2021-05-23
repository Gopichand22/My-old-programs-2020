package com.mindtree.firstsetofprograms;

import java.util.Scanner;

public class InsertionSorting15 {

	public static void main(String[] args) {
		InsertSort iSort = new InsertSort();
		int[] arr = new int[50];
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Elements: ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		iSort.insertionSort(arr, n);
	}

}
