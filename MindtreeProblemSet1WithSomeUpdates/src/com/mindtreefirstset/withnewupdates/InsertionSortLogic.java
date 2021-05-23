package com.mindtreefirstset.withnewupdates;

public class InsertionSortLogic {
	public void insertionSort(int[] arr) {
		int i, j, key;
		for (i = 1; i < arr.length; i++) {
			key = arr[i];
			j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
		System.out.println("After Sorting the Elements");
		for (int element : arr) {
			System.out.print(element + " ");
		}
	}
}
