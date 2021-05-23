package com.begintoend.coding;

import java.util.Scanner;

import com.mindtreefirstset.validations.AllValidationChecks;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		boolean isValid = true;
		do {
			switch (AllValidationChecks.integerCheck()) {
			case 1:
				binarySearchForIntArray(size);
				break;
			case 2:
				BinarySearchForStringArray(size);
				break;
			case 3:
				searchInAString();
				break;
			case 4:
				System.out.println("Exiting...");
				isValid = false;
				break;
			default:
				System.out.println("please enter 1,2,3 only");
				break;
			}

		} while (isValid);
	}

	private static void searchInAString() {
	}

	private static void BinarySearchForStringArray(int size) {

	}

	private static void binarySearchForIntArray(int size) {
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = AllValidationChecks.integerCheck();
		}
		int[] array2 = bubbleSort(array);
		System.out.println("Enter element that u wanna search");
		int key = AllValidationChecks.integerCheck();
		int left = 0, right = array.length - 1, mid;
		boolean flag = true;
		while (left <= right) {
			mid = (left + right) / 2;
			if (key == array2[mid]) {
				System.out.println("Key Found at index" + mid);
				flag = false;
				break;
			} else if (key < array2[mid]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		if (flag) {
			System.out.println("Key not found");
		}

	}

	private static int[] bubbleSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}

}
