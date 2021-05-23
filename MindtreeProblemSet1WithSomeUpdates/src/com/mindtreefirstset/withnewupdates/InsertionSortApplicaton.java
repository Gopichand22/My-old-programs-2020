package com.mindtreefirstset.withnewupdates;

import com.mindtreefirstset.validations.AllValidationChecks;

public class InsertionSortApplicaton {

	public static void main(String[] args) {
		InsertionSortLogic insertionSort = new InsertionSortLogic();
		System.out.println("Enter size of array");
		int[] array = AllValidationChecks.integerArrayCheck(AllValidationChecks.integerCheck());
		insertionSort.insertionSort(array);
	}
}
