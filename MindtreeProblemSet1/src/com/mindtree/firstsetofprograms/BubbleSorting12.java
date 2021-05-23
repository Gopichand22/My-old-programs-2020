package com.mindtree.firstsetofprograms;


import java.util.Scanner;

public class BubbleSorting12 {

	public static void main(String[] args) {
		BubbleSortingg sortingWithBubbleSort = new BubbleSortingg();
		AllValidationChecks validates = new AllValidationChecks();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter " + n + " Elements:");
		// enter array elements
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		// print array elements
		System.out.println("Entered Elements are: ");
		for (int ele : arr) {
			System.out.print(ele + " ");
		}
		// sorting code
		sortingWithBubbleSort.Bubble(arr, n);
	}

}
