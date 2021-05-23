package com.mindtree.onedarrayprograms;

import com.mindtreefirstset.validations.AllValidationChecks;

public class AlternatePositiveAndNegative {

	public static void main(String[] args) {
		System.out.println("Enter size");
		int size = AllValidationChecks.integerCheck();
		int[] array = new int[size];
		System.out.println("Enter combination of both positive and negative numbers");
		for (int i = 0; i < size; i++) {
			array[i] = AllValidationChecks.integerCheck();
		}
//		sorting elements
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
//negatives from start and positives from end
		int[] result = new int[size];
		int start = 0;
		int end = array.length - 1;
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				result[i] = array[start];
				start++;
			} else {
				result[i] = array[end];
				end--;
			}
			if (start > end) {
				break;
			}
		}
		System.out.println();
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}