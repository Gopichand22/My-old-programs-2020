package com.mindtree.firstsetofprograms;

public class InsertSort {

	public void insertionSort(int[] arr, int n) {
		int i, j, key;
		
		System.out.println();
		for (i = 1; i < n; i++) {
			key = arr[i];
			j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
		System.out.println("After Sorting the Elements");
		for (i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
