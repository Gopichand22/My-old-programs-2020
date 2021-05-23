package com.mindtree.onedarrayprograms;

import com.mindtreefirstset.validations.AllValidationChecks;

public class FindIndividualNumber {

	public static void main(String[] args) {
		System.out.println("Entera size of an array1");
		int size = AllValidationChecks.integerCheck();
		int[] array = new int[size];
		// data 1 initialization here
		System.out.println("Enter elements");
		for (int i = 0; i < size; i++) {
			array[i] = AllValidationChecks.integerCheck();
		}
		int individualNumber=0;
		for (int i = 0; i < size;) {
			for (int j = 1; j < size;) {
				if (array[i] != array[j]) {
					individualNumber = array[i];
					break;
				}
				j = j + 2;
				i = i + 2;
			}
		}
		if(individualNumber!=0) {
		System.out.println(individualNumber);
		}else {
			System.out.println("there are no individual number in the array");
		}
	}

}
