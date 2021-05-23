package com.mindtree.firstsetofprograms;

public class BubbleSortingg {// main method in BubbleSorting12 program

	public void Bubble(int[] arr, int n) {
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

		System.out.println("\nSorted elements are:");
		for (int elem : arr) {
			System.out.print(elem + " ");
		}


	}

}
