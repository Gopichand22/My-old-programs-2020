package com.mindtree.onedarrayprograms;

import com.mindtreefirstset.validations.AllValidationChecks;

public class MinAndMaxInAnArray {

	public static void main(String[] args) {
		System.out.println("Entera size of an array");
		int size = AllValidationChecks.integerCheck();
		int[] array = new int[size];
		// data initialization here
		System.out.println("INPUT:");
		for (int i = 0; i < size; i++) {
			array[i] = AllValidationChecks.integerCheck();
		}
		int max = array[0], min = array[0];
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (array[j] > max) {
					max = array[j];
				}
				if (array[j] < min) {
					min = array[j];
				}
			}
		}
		System.out.println("Largest value is " + max + " & smallest value is " + min);
	}

}
