package com.mindtreefirstset.withnewupdates;

import com.mindtreefirstset.validations.AllValidationChecks;

public class BubbleSortingApplication {

	public static void main(String[] args) {
		System.out.println("Enter size of array : ");
		int[] array = AllValidationChecks.integerArrayCheck(AllValidationChecks.integerCheck());

		// print array elements
		System.out.println("Entered Elements are: ");
		for (int ele : array) {
			System.out.print(ele + " ");
		}
		// sorting logic
		bubbleSort(array, array.length);
	}

	private static void bubbleSort(int[] arr, int n) {
		int i, j, temp;
		for (i = 0; i < n; i++) {
			for (j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		System.out.println("\nAfter sorting the elements:");
		for (int elem : arr) {
			System.out.print(elem + " ");
		}

	}
}
