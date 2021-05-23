package com.sorting.techniques;

import java.util.Scanner;

public class SortingTechniqueApp {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean isValid = true;
		int[] array = { 5, 1, 4, 2, 8 };
		int size = array.length;
		do {
			switch (sc.nextInt()) {
			case 1:
				bubbleSort(array, size);
				break;
			case 2:
				insertionSort(array, size);
				break;
			case 3:
				selectionSort(array, size);
				break;
			case 4:
				bubbleSortUsingRecursion(array, size);
				break;
			case 5:
				insertionSortUsingRecursion(array, size);
				break;
			case 6:
				mergeSort(array, size);
				break;
			case 7:
				quickSort(array, size);
				break;
			case 8:
				isValid = false;
				break;
			default:
				System.out.println("Please choose correct Option between 1-8");
			}

		} while (isValid);
	}

	// QuickSorting
	private static void quickSort(int[] arr, int size) {

	}

	// MergeSorting
	private static void mergeSort(int[] arr, int size) {

	}

	// insertionSortUsingRecursion
	private static void insertionSortUsingRecursion(int[] arr, int size) {

	}

	// bubbleSortUsingRecursion
	private static void bubbleSortUsingRecursion(int[] arr, int size) {

	}

	// selectionSort
	private static void selectionSort(int[] arr, int size) {
		// Before sorting
		System.out.println("Before Insertion Sorting:");
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}
		// Logic part
		for (int i = 0; i < size - 1; i++) {
			int min_index = i;
			for (int j = i + 1; j < size; j++) {
				if (arr[j] < arr[min_index]) {
					min_index = j;
				}
			}
			if (min_index != i) {
					// swap
					int temp = arr[min_index];
					arr[min_index] = arr[i];
					arr[i] = temp;
					System.out.println(arr[i]);
				}
			}
		// After Sorting
		System.out.println("After Insertion Sorting:");
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}
	}

	// insertionSort
	private static void insertionSort(int[] arr, int size) {
		// Before sorting
		System.out.println("Before Insertion Sorting:");
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}
		// Logic part
		for (int i = 1; i < size; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
		// After Sorting
		System.out.println("After Insertion Sorting:");
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}
	}

	// bubbleSort
	private static void bubbleSort(int[] arr, int size) {
		// Before sorting
		System.out.println("Before Bubble Sorting:");
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}
		// Logic part
		for (int i = 0; i < size; i++) {
			boolean swapped=false;
			for (int j = 0; j < size - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped =true;
				}
			}
			if (swapped == false)
				break;
		}
		// After Sorting
		System.out.println("After Bubble Sorting:");
		for (int i = 0; i < size; i++) {
			System.out.println(arr[i]);
		}
	}
}
