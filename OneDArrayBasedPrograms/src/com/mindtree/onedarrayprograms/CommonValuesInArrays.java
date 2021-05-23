package com.mindtree.onedarrayprograms;

import com.mindtreefirstset.validations.AllValidationChecks;

public class CommonValuesInArrays {

	public static void main(String[] args) {
		int size;
		System.out.println("Enter size of array1:");
		size = AllValidationChecks.integerCheck();
		int array[] = new int[size];
		System.out.println("Enter te values");
		for (int i = 0; i < size; i++) {
			array[i] = AllValidationChecks.integerCheck();
		}

		System.out.println("Enter size of array2:");
		int size2 = AllValidationChecks.integerCheck();
		int array1[] = new int[size2];
		System.out.println("Enter te values");
		for (int i = 0; i < size2; i++) {
			array1[i] = AllValidationChecks.integerCheck();
		}

		System.out.println("Enter size of array3:");
		int size3 = AllValidationChecks.integerCheck();
		int array2[] = new int[size3];
		System.out.println("Enter te values");
		for (int i = 0; i < size3; i++) {
			array2[i] = AllValidationChecks.integerCheck();
		}
		int[] temp = new int[size];
		int index = 0;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size2; j++) {
				if (array[i] == array1[j]) {
					temp[index] = array[i];
					index++;
				}
			}
		}
		int[] resultCommonValues = new int[size];
		int k = 0;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size3; j++) {
				if (temp[i] == array2[j]) {
					resultCommonValues[k] = temp[i];
					k++;
				}
			}
		}
		for (int a : resultCommonValues) {
			if (k == 0) {
				System.out.println("No common values/intersection values in 3 arrays");
				break;
			}
			if (a != 0)
			System.out.println(a + " ");
		}

	}

}
