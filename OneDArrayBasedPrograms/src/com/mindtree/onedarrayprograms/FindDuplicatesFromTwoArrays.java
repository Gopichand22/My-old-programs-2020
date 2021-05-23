package com.mindtree.onedarrayprograms;

import com.mindtreefirstset.validations.AllValidationChecks;

public class FindDuplicatesFromTwoArrays {

	public static void main(String[] args) {
		String[] result;
		System.out.println("Enter the size of String1:");
		int size1 = AllValidationChecks.integerCheck();
		String[] array1 = new String[size1];
		System.out.println("Enter " + size1 + " words");
		for (int i = 0; i < size1; i++) {
			array1[i] = AllValidationChecks.stringCheck();
		}
		System.out.println("Enter the size of String2:");
		int size2 = AllValidationChecks.integerCheck();
		String[] array2 = new String[size2];
		System.out.println("Enter " + size2 + " words");
		for (int i = 0; i < size2; i++) {
			array2[i] = AllValidationChecks.stringCheck();
		}
		if (size1 <= size2) {
			result = new String[size1];
		} else {
			result = new String[size2];
		}
		int k = 0;
		for (int i = 0; i < size1; i++) {
			for (int j = 0; j < size2; j++) {
				if (array1[i].equals(array2[j])) {
					result[k] = array1[i];
					k++;
				}
			}
		}
		for (String element : result) {
			if (element != null)
				System.out.print(element + " | ");
		}
	}

}
