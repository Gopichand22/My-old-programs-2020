package com.mindtree.groupb;

import com.mindtreefirstset.validations.AllValidationChecks;

public class ConvertTwoDToOneD5 {

	public static void main(String[] args) {
		System.out.println("Enter size of array");
		int size = AllValidationChecks.integerCheck();

		int[][] array = new int[size][size];
		// data is entered here
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				array[i][j] = AllValidationChecks.integerCheck();
			}
		}
		// data is shown here
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
		// store in 1d
		int[] array2 = new int[size * size];
		int k = 0;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				array2[k] = array[i][j];
				k++;
			}
		}
		System.out.println("Before sorting");
		for (int element : array2) {
			System.out.print(element + "  ");
		}

		// sorting using bubble sort
		int temp = 0;
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2.length - i - 1; j++) {
				if (array2[j] > array2[j + 1]) {
					// swap array2[j] and array2[j+1]
					temp = array2[j];
					array2[j] = array2[j + 1];
					array2[j + 1] = temp;
				}
			}
		}
		System.out.println("After sorting");
		for (int element : array2) {
			System.out.print(element + "  ");
		}

		System.out.println("\nEnter the element that u want to search:");
		int key = AllValidationChecks.integerCheck();
		// binary searching
		int length = array2.length;
		int left = 0, right = length - 1, mid;
		while (left <= right) {
			mid = (left + right) / 2;
			if (key == array2[mid]) {
				System.out.println("Key is found & index of the value is: array[" + mid + "]");
				break;
			} else if (key < array2[mid]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
	}
}
