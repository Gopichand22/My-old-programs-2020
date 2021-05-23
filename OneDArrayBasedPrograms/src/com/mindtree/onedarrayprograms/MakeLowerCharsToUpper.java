package com.mindtree.onedarrayprograms;

import com.mindtreefirstset.validations.AllValidationChecks;

public class MakeLowerCharsToUpper {

	public static void main(String[] args) {
		System.out.println("Enter the size of String:");
		int size = AllValidationChecks.integerCheck();
		String[] array = new String[size];
		System.out.println("Enter " + size + " words");
		for (int i = 0; i < size; i++) {
			array[i] = AllValidationChecks.stringCheck();
		}
		String[] result = new String[size];
		for (int i = 0; i < size; i++) {
			String temp = "";
			for (int j = 0; j < array[i].length(); j++) {
				if (j == 0 || j == 1) {
					temp = temp + array[i].charAt(j);
					result[i] = temp;
				} else {
					if (j % 2 == 0) {
						temp = temp + (char) (array[i].charAt(j) - 32);
						result[i] = temp;
					} else {
						temp = temp + array[i].charAt(j);
						result[i] = temp;
					}
				}
			}
		}
		for (String str : result) {
			System.out.print(str + " ");
		}
	}

}