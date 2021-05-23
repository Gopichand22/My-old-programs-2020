package com.mindtreefirstset.withnewupdates;

import com.mindtreefirstset.validations.AllValidationChecks;

public class FiveTripletsApplication {

	public static void main(String args[]) {
		System.out.println("Enter size of array");
		int size = AllValidationChecks.integerCheck();
		int array[] = AllValidationChecks.integerArrayCheck(size);
		tripletLogic(array, size);
	}

	static void tripletLogic(int arr[], int n) {
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = i + 2; k < n; k++) {
					if (arr[i] + arr[j] == arr[k]) {
						System.out.println(arr[i] + "," + arr[j] + "," + arr[k]);
					}
				}
			}
		}
	}
}
