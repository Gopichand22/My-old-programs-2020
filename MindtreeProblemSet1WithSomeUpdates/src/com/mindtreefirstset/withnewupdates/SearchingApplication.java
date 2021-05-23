package com.mindtreefirstset.withnewupdates;

import com.mindtreefirstset.validations.AllValidationChecks;

public class SearchingApplication {

	public static void main(String[] args) {
		System.out.println("Enter the size of an array:");
		int[] array = AllValidationChecks.integerArrayCheck(AllValidationChecks.integerCheck());
		System.out.println("Enter the element that you want to search");
		int key = AllValidationChecks.integerCheck();
		SearchingLogic(array, key);

	}

	private static void SearchingLogic(int[] array1, int key) {
		boolean flag = false;
		for (int element : array1) {
			if (element == key) {
				flag = true;
				break;
			}
		}
		if (flag == true) {
			System.out.println("Number found");
		} else {
			System.out.println("Number Not Found");
		}
	}
}
