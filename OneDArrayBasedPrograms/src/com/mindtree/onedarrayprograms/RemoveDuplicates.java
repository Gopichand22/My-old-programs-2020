package com.mindtree.onedarrayprograms;

import com.mindtreefirstset.validations.AllValidationChecks;

public class RemoveDuplicates {
//this works only for sorted array
	public static void main(String[] args) {
		System.out.println("Enter size of array:");
		int size = AllValidationChecks.integerCheck();
		int[] array = new int[size];
		System.out.println("Enter elements:");
		for (int i = 0; i < size; i++) {
			array[i] = AllValidationChecks.integerCheck();
		}
		int lengthOfArray = removeDuplicates(array, array.length);

		for (int i = 0; i < lengthOfArray; i++) {
			System.out.println(array[i] + " ");
		}
	}

	private static int removeDuplicates(int[] array, int n) {
		int[] temp = new int[n];
		int index = 0;
		for (int i = 0; i < n - 1; i++) {// checking upto n-2
			if (array[i] != array[i + 1]) {
				temp[index] = array[i];
				index++;
			}
		}
		temp[index++] = array[n - 1];// storing last element after the loop

		for (int i = 0; i <= index; i++) {
			array[i] = temp[i];
		}

		return index;
	}

}
