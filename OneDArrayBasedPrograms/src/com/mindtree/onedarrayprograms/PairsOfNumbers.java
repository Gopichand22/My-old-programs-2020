package com.mindtree.onedarrayprograms;

import com.mindtreefirstset.validations.AllValidationChecks;

public class PairsOfNumbers {

	public static void main(String[] args) {
		System.out.println("Entera size of an array");
		int size = AllValidationChecks.integerCheck();
		int[] array = new int[size];
		// data initialization here
		System.out.println("Enter elements");
		System.out.println("INPUT:");
		for (int i = 0; i < size; i++) {
			array[i] = AllValidationChecks.integerCheck();
		}

		System.out.println("Enter an element to find pairs from an array:");
		int number = AllValidationChecks.integerCheck();
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (array[i] + array[j] == number) {
					System.out.print("(" + array[i] + "," + array[j] + ")");
				}
			}
		}
	}

}
