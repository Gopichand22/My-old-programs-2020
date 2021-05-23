package com.mindtree.onedarrayprograms;

import com.mindtreefirstset.validations.AllValidationChecks;

public class HighestProductInAnArray {

	public static void main(String[] args) {
		System.out.println("Enter size of array:");
		int size = AllValidationChecks.integerCheck();
		int[] array = new int[size];
		System.out.println("Enter elements:");
		for (int i = 0; i < size; i++) {
			array[i] = AllValidationChecks.integerCheck();
		}
		int[] product = new int[size - 1];
		for (int i = 0; i < size - 1; i++) {
			product[i] = (array[i] * array[i + 1]);
		}
		int max = product[0], count = 0;
		for (int i = 0; i < product.length; i++) {
			if (max < product[i]) {
				max = product[i];
				count = i;
			}
		}
		System.out.println(
				"The contiguous subarray " + array[count] + "," + array[count + 1] + " has the largest product " + max);
	}
}
