package com.mindtree.onedarrayprograms;

import com.mindtreefirstset.validations.AllValidationChecks;

public class RemoveElementFromAnArray {

	public static void main(String[] args) {
		System.out.println("Enter size of array:");
		int size = AllValidationChecks.integerCheck();
		int[] array = new int[size];
		System.out.println("Enter elements:");
		for (int i = 0; i < size; i++) {
			array[i] = AllValidationChecks.integerCheck();
		}

		System.out.println("Enter the element that you want to remove:");
		int element = AllValidationChecks.integerCheck();
		int count = 0;
		for (int element2 : array) {
			if (element2 != element) {
				count++;
			}
		}
		int[] newSize = new int[count];
		int j = 0;
		for (int element2 : array) {
			if (element2 != element) {
				newSize[j] = element2;
				j++;
			}
		}
		for (int values : newSize) {
			System.out.print(values + " ");
		}
	}

}
